package com.github.ironjan.ccd;

import android.annotation.*;
import android.content.*;
import android.os.*;
import android.support.v4.app.*;

import com.actionbarsherlock.app.*;
import com.github.ironjan.ccd.R;
import com.googlecode.androidannotations.annotations.*;

@EActivity(R.layout.activity_grades)
public class Grades extends SherlockFragmentActivity {

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	@OptionsItem({ android.R.id.home, R.id.homeAsUp })
	void up() {
		Intent upIntent = new Intent(this, CCD_.class);
		NavUtils.navigateUpTo(this, upIntent);
	}
}
