package com.github.ironjan.ccd;

import android.annotation.*;
import android.content.*;
import android.os.*;
import android.support.v4.app.*;
import android.widget.*;

import com.actionbarsherlock.app.*;
import com.actionbarsherlock.app.ActionBar.OnNavigationListener;
import com.github.ironjan.ccd.fragments.*;
import com.googlecode.androidannotations.annotations.*;
import com.googlecode.androidannotations.annotations.res.*;

@EActivity(R.layout.activity_value)
public class Value extends SherlockFragmentActivity {
	private static final Class<CCD_> PARENT_ACTIVITY = CCD_.class;

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
	ValueFragment_ mValueFragment;

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

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	@OptionsItem({ android.R.id.home, R.id.homeAsUp })
	void up() {
		Intent upIntent = new Intent(this, PARENT_ACTIVITY);
		NavUtils.navigateUpTo(this, upIntent);
	}
}
