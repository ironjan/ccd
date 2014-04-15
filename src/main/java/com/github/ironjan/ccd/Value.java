package com.github.ironjan.ccd;

import android.content.*;
import android.support.v4.app.*;
import android.widget.*;

import com.actionbarsherlock.app.*;
import com.actionbarsherlock.app.ActionBar.*;
import com.github.ironjan.ccd.fragments.*;

import org.androidannotations.annotations.*;
import org.androidannotations.annotations.res.*;

@EActivity(R.layout.activity_value)
public class Value extends SherlockFragmentActivity {
    @StringRes
    String valueReflexionDescription, valueEvolveDescription,
            valueEfficiencyDescription, valueCorrectnessDescription;

    @StringArrayRes(R.array.values)
    String[] values;

    @Extra
    int selectedValue;

    public static final int VALUE_EVOLVE = 0, VALUE_CORRECTNESS = 1,
            VALUE_EFFICIENCY = 2, VALUE_REFLEXION = 3;

    @FragmentById(R.id.fragmentValue)
    ValueFragment mValueFragment;

    @AfterInject
    void addNavigation() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.values,
                android.R.layout.simple_spinner_dropdown_item);

        ActionBar.OnNavigationListener navigationListener = new OnNavigationListener() {

            @Override
            public boolean onNavigationItemSelected(int itemPosition,
                                                    long itemId) {
                setSelectedValue(itemPosition);
                return true;
            }
        };

        actionBar.setListNavigationCallbacks(adapter, navigationListener);
        actionBar.setSelectedNavigationItem(selectedValue);
    }

    protected void setSelectedValue(int itemPosition) {
        if (mValueFragment != null) {
            switch (itemPosition) {
                case VALUE_REFLEXION:
                    mValueFragment.setContent(valueReflexionDescription);
                    break;
                case VALUE_EFFICIENCY:
                    mValueFragment.setContent(valueEfficiencyDescription);
                    break;
                case VALUE_CORRECTNESS:
                    mValueFragment.setContent(valueCorrectnessDescription);
                    break;
                case VALUE_EVOLVE:
                    mValueFragment.setContent(valueEvolveDescription);
                    break;
                default:
                    mValueFragment.setContent(valueEvolveDescription);
                    break;
            }
        }
    }

    @OptionsItem({android.R.id.home, R.id.homeAsUp})
    void up() {
        Intent upIntent = CCD_.intent(this).get();
        NavUtils.navigateUpTo(this, upIntent);
    }
}
