package com.github.ironjan.ccd;

import com.actionbarsherlock.app.*;

import org.androidannotations.annotations.*;

@EActivity(R.layout.activity_ccd)
@OptionsMenu(R.menu.about_menu)
public class CCD extends SherlockFragmentActivity {
    @OptionsItem(R.id.ab_about)
    void aboutClicked() {
        About_.intent(this).start();
    }
}
