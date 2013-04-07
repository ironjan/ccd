package com.github.ironjan.ccd.fragments;

import android.widget.*;

import com.actionbarsherlock.app.*;
import com.github.ironjan.ccd.*;
import com.googlecode.androidannotations.annotations.*;


@EFragment(R.layout.fragment_values)
public class ValueFragment extends SherlockFragment {

	@ViewById(R.id.txtValueContent)
	TextView txtContent;

	public void setContent(String content) {
		txtContent.setText(content);
	}
}
