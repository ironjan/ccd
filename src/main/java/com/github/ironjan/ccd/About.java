package com.github.ironjan.ccd;

import android.annotation.*;
import android.content.*;
import android.os.*;
import android.support.v4.app.*;

import com.actionbarsherlock.app.*;

import org.androidannotations.annotations.*;

@EActivity(R.layout.activity_about)
public class About extends SherlockFragmentActivity {
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @OptionsItem({android.R.id.home, R.id.homeAsUp})
    void up() {
        Intent upIntent = new Intent(this, CCD_.class);
        NavUtils.navigateUpTo(this, upIntent);
    }
}
