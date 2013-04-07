package com.github.ironjan.ccd.data.binding;

import com.github.ironjan.ccd.data.*;
import com.googlecode.androidannotations.annotations.*;
import com.googlecode.androidannotations.annotations.res.*;


@EBean
public class RedGrade extends Grade {
	@StringRes
	String redGradeName, dryName, dryWhy, dryDescription, kissName, kissWhy,
			kissDescription, optName, optWhy, optDescription, fcolName,
			fcolWhy, fcolDescription, scoutName, scoutWhy, scoutDescription,
			rcaName, rcaWhy, rcaDescription, vcsName, vcsWhy, vcsDescription,
			simpleRefactoringName, simpleRefactoringWhy,
			simpleRefactoringDescription, reflexionName, reflexionWhy,
			reflexionDescription;

	@AfterInject
	void init() {
		initPrinciples();
		initPractices();
	}

	private void initPrinciples() {
		initPrinciple(dryName, dryWhy, dryDescription);
		initPrinciple(kissName, kissWhy, kissDescription);
		initPrinciple(optName, optWhy, optDescription);
		initPrinciple(fcolName, fcolWhy, fcolDescription);
	}

	private void initPractices() {
		initPractice(scoutName, scoutWhy, scoutDescription);
		initPractice(vcsName, vcsWhy, vcsDescription);
		initPractice(simpleRefactoringName, simpleRefactoringWhy,
				simpleRefactoringDescription);
		initPractice(reflexionName, reflexionWhy, reflexionDescription);
	}

	@Override
	public String getName() {
		return redGradeName;
	}

}
