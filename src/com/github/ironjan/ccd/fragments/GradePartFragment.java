package com.github.ironjan.ccd.fragments;

import java.util.*;

import com.actionbarsherlock.app.*;
import com.github.ironjan.ccd.*;
import com.github.ironjan.ccd.data.*;
import com.googlecode.androidannotations.annotations.*;


@EFragment(R.layout.fragment_grade_parts)
public class GradePartFragment extends SherlockListFragment {

	@Bean
	GradePartListAdapter mListAdapter;

	private List<GradePart> mGradeParts = new ArrayList<GradePart>();

	public void setGradeParts(List<GradePart> gradeParts) {
		mGradeParts = gradeParts;
		updateList();
	}

	@AfterInject
	void initAdapter() {
		setListAdapter(mListAdapter);
	}

	@AfterViews
	@UiThread
	void updateList() {
		if (mListAdapter != null && mGradeParts != null) {
			mListAdapter.setParts(mGradeParts);
			getListView().invalidate();
		}
	}
}
