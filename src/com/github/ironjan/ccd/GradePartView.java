package com.github.ironjan.ccd;

import android.content.*;
import android.util.*;
import android.widget.*;

import com.github.ironjan.ccd.R;
import com.github.ironjan.ccd.data.*;
import com.googlecode.androidannotations.annotations.*;


@EViewGroup(R.layout.view_grade)
public class GradePartView extends RelativeLayout {
	public GradePartView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@ViewById
	TextView txtName, txtWhy, txtDescription;
	@ViewById
	@FromHtml(R.string.mehr_anzeigen)
	Button btnExpand;

	public void bind(GradePart part) {
		txtName.setText(part.name);
		txtWhy.setText(part.why);
		txtDescription.setText(part.description);
	}

	@Click(R.id.btnExpand)
	void toggleExpansion() {
		txtDescription.setVisibility(VISIBLE);
		btnExpand.setVisibility(GONE);
		invalidate();
	}
}
