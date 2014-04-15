package com.github.ironjan.ccd.fragments;

import com.actionbarsherlock.app.*;
import com.github.ironjan.ccd.*;

import org.androidannotations.annotations.*;


@EFragment(R.layout.fragment_ccd)
public class CCDFragment extends SherlockFragment {
    @Click(R.id.txtValueEvolve)
    void openValueEvolve() {
        Value_.intent(getActivity()).selectedValue(Value.VALUE_EVOLVE).start();
    }

    @Click(R.id.txtValueCorrectnes)
    void openValueCorrectness() {
        Value_.intent(getActivity()).selectedValue(Value.VALUE_CORRECTNESS)
                .start();
    }

    @Click(R.id.txtValueEfficiency)
    void openValueEfficiency() {
        Value_.intent(getActivity()).selectedValue(Value.VALUE_EFFICIENCY)
                .start();
    }

    @Click(R.id.txtValueReflexion)
    void openValueReflexion() {
        Value_.intent(getActivity()).selectedValue(Value.VALUE_REFLEXION)
                .start();
    }

    @Click(R.id.btnGradeHelp)
    void openGradeHelp() {
        Grades_.intent(getActivity()).start();
    }

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
