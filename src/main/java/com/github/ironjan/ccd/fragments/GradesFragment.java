package com.github.ironjan.ccd.fragments;

import android.widget.*;

import com.actionbarsherlock.app.*;
import com.github.ironjan.ccd.*;

import org.androidannotations.annotations.*;


@EFragment(R.layout.fragment_grades)
public class GradesFragment extends SherlockFragment {

    @FromHtml(R.string.aboutGradesMeaningHL)
    @ViewById(R.id.aboutGradeMeaningHeadline)
    TextView aboutGradeMeaningHeadline;

    @FromHtml(R.string.aboutGradesMeaningContent)
    @ViewById(R.id.aboutGradeMeaningContent)
    TextView aboutGradeMeaningContent;

    @FromHtml(R.string.aboutGradesPracticeHL)
    @ViewById(R.id.aboutGradePracticeHeadline)
    TextView aboutGradePracticeHeadline;

    @FromHtml(R.string.aboutGradesPracticeContent)
    @ViewById(R.id.aboutGradePracticeContent)
    TextView aboutGradePracticeContent;

    @FromHtml(R.string.aboutGradesTrainingHL)
    @ViewById(R.id.aboutGradeTrainingHeadline)
    TextView aboutGradeTrainingHeadline;

    @FromHtml(R.string.aboutGradesTrainingContent)
    @ViewById(R.id.aboutGradeTrainingContent)
    TextView aboutGradeTrainingContent;

    @Click(R.id.imgGradeRed)
    void redGradeClicked() {
        openGrade(SingleGrade.RED_URL);
    }

    @Click(R.id.imgGradeOrange)
    void orangeGradeClicked() {
        openGrade(SingleGrade.ORANGE_URL);
    }

    @Click(R.id.imgGradeYellow)
    void yellowGradeClicked() {
        openGrade(SingleGrade.YELLOW_URL);
    }

    @Click(R.id.imgGradeGreen)
    void greenGradeClicked() {
        openGrade(SingleGrade.GREEN_URL);
    }

    @Click(R.id.imgGradeBlue)
    void bluegGradeClicked() {
        openGrade(SingleGrade.BLUE_URL);
    }

    private void openGrade(String gradeUrl) {
        SingleGrade_.intent(getActivity()).extraUrl(gradeUrl).start();
    }

}
