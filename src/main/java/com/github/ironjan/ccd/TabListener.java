package com.github.ironjan.ccd;

import android.support.v4.app.*;

import com.actionbarsherlock.app.ActionBar.*;

public class TabListener implements
        com.actionbarsherlock.app.ActionBar.TabListener {

    final Fragment mFragment;

    public TabListener(Fragment fragment) {
        super();
        this.mFragment = fragment;
    }

    @Override
    public void onTabSelected(Tab tab, FragmentTransaction ft) {
        ft.add(mFragment, "selectedFragment"); //$NON-NLS-1$
    }

    @Override
    public void onTabUnselected(Tab tab, FragmentTransaction ft) {
        ft.remove(mFragment);
    }

    @Override
    public void onTabReselected(Tab tab, FragmentTransaction ft) { // nothing to
        // do
    }

}
