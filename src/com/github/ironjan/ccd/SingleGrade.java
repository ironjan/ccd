package com.github.ironjan.ccd;

import java.util.*;

import android.annotation.*;
import android.content.*;
import android.os.*;
import android.support.v4.app.*;
import android.widget.*;

import com.actionbarsherlock.app.*;
import com.actionbarsherlock.app.ActionBar.OnNavigationListener;
import com.github.ironjan.ccd.data.*;
import com.github.ironjan.ccd.data.binding.*;
import com.github.ironjan.ccd.fragments.*;
import com.googlecode.androidannotations.annotations.*;
import com.googlecode.androidannotations.annotations.res.*;

@EActivity(R.layout.activity_single_grade)
public class SingleGrade extends SherlockFragmentActivity {
	private static final Class<CCD_> PARENT_ACTIVITY = CCD_.class;

	public static String RED_URL = "http://clean-code-developer.de/Roter-Grad.ashx", //$NON-NLS-1$
			ORANGE_URL = "http://clean-code-developer.de/Oranger-Grad.ashx", //$NON-NLS-1$
			YELLOW_URL = "http://clean-code-developer.de/Gelber-Grad.ashx", //$NON-NLS-1$
			GREEN_URL = "http://clean-code-developer.de/Gr%c3%bcner-Grad.ashx", //$NON-NLS-1$
			BLUE_URL = "http://clean-code-developer.de/Blauer-Grad.ashx"; //$NON-NLS-1$

	protected static final int POSITION_RED = 0, POSITION_ORANGE = 1,
			POSITION_YELLOW = 2, POSITION_GREEN = 3, POSITION_BLUE = 4;

	Grade mGrade;

	@Bean(RedGrade.class)
	Grade mRed;

	@Bean(OrangeGrade.class)
	Grade mOrage;

	@Bean(YellowGrade.class)
	Grade mYellow;

	@Bean(GreenGrade.class)
	Grade mGreen;

	@Bean(BlueGrade.class)
	Grade mBlue;

	@ViewById
	FrameLayout fragmentGradePartsHolder;

	@StringArrayRes
	String[] grades;

	@Extra
	String extraUrl;

	private GradePartFragment fragmentGradeParts;

	private int mNavPos;

	@AfterInject
	void init() {
		initGrade();
		addNavigation();
	}

	private void addNavigation() {
		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.grades,
				android.R.layout.simple_spinner_dropdown_item);

		ActionBar.OnNavigationListener navigationListener = new OnNavigationListener() {

			@Override
			public boolean onNavigationItemSelected(int itemPosition,
					long itemId) {
				switch (itemPosition) {
				case POSITION_RED:
					setGrade(mRed);
					break;
				case POSITION_ORANGE:
					setGrade(mOrage);
					break;
				case POSITION_YELLOW:
					setGrade(mYellow);
					break;
				case POSITION_GREEN:
					setGrade(mGreen);
					break;
				case POSITION_BLUE:
					setGrade(mBlue);
					break;
				default:
					setGrade(mRed);
					break;
				}

				return true;

			}
		};

		actionBar.setListNavigationCallbacks(adapter, navigationListener);
		actionBar.setSelectedNavigationItem(mNavPos);
	}

	void setGrade(Grade grade) {
		this.mGrade = grade;
		updateFragments();
	}

	void updateFragments() {
		GradePartFragment newFragmentGradeParts = GradePartFragment_.builder()
				.build();

		if (mGrade != null) {
			final List<GradePart> practices = mGrade.getPractices();
			final List<GradePart> principles = mGrade.getPrinciples();

			List<GradePart> allGradeParts = new ArrayList<GradePart>();
			allGradeParts.addAll(principles);
			allGradeParts.addAll(practices);

			newFragmentGradeParts.setGradeParts(allGradeParts);
		}

		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

		if (fragmentGradeParts != null) {
			ft.remove(fragmentGradeParts);
		}

		ft.add(R.id.fragmentGradePartsHolder, newFragmentGradeParts);
		ft.commit();

		fragmentGradeParts = newFragmentGradeParts;
	}

	void initGrade() {
		if (extraUrl.equals(BLUE_URL)) {
			mNavPos = POSITION_BLUE;
			mGrade = mBlue;
		} else if (extraUrl.equals(GREEN_URL)) {
			mNavPos = POSITION_GREEN;
			mGrade = mGreen;
		} else if (extraUrl.equals(YELLOW_URL)) {
			mNavPos = POSITION_YELLOW;
			mGrade = mYellow;
		} else if (extraUrl.equals(ORANGE_URL)) {
			mNavPos = POSITION_ORANGE;
			mGrade = mOrage;
		} else {
			mNavPos = POSITION_RED;
			mGrade = mRed;
		}

	}

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	@OptionsItem({ android.R.id.home, R.id.homeAsUp })
	void up() {
		Intent upIntent = new Intent(this, PARENT_ACTIVITY);
		NavUtils.navigateUpTo(this, upIntent);
	}
}
