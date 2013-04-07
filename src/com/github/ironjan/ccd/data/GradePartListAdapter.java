package com.github.ironjan.ccd.data;

import java.util.*;

import android.content.*;
import android.view.*;
import android.widget.*;

import com.github.ironjan.ccd.*;
import com.googlecode.androidannotations.annotations.*;


@EBean
public class GradePartListAdapter extends BaseAdapter {

	List<GradePart> mParts = new ArrayList<GradePart>();

	@RootContext
	Context mContext;

	public void setParts(List<GradePart> parts) {
		mParts = parts;
		notifyDataSetChanged();
	}

	@Override
	public int getCount() {
		return mParts.size();
	}

	@Override
	public GradePart getItem(int position) {
		return mParts.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;

		if (v == null) {
			v = GradePartView_.build(mContext, null);
		}

		((GradePartView) v).bind(getItem(position));
		return v;
	}

}
