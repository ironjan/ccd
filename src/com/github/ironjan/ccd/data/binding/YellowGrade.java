package com.github.ironjan.ccd.data.binding;

import com.github.ironjan.ccd.data.*;
import com.googlecode.androidannotations.annotations.*;
import com.googlecode.androidannotations.annotations.res.*;


@EBean
public class YellowGrade extends Grade {
	@StringRes
	String yellowGradeName, ispName, ispWhy, ispDescription, dipName, dipWhy,
			dipDescription, lspName, lspWhy, lspDescription, polaName, polaWhy,
			polaDescription, informationHidingName, informationHidingWhy,
			informationHidingDescription, automaticUnitTestsName,
			automaticUnitTestsWhy, automaticUnitTestsDescription, mockupsName,
			mockupsWhy, mockupsDescription, codeCoverageAnalysisName,
			codeCoverageAnalysisWhy, codeCoverageAnalysisDescription,
			specialEventsName, specialEventsWhy, specialEventsDescription,
			complexRefactoringName, complexRefactoringWhy,
			complexRefactoringDescription;

	@AfterInject
	void init() {
		initPrinciples();
		initPractices();
	}

	private void initPrinciples() {
		initPrinciple(ispName, ispWhy, ispDescription);
		initPrinciple(dipName, dipWhy, dipDescription);
		initPrinciple(lspName, lspWhy, lspDescription);
		initPrinciple(polaName, polaWhy, polaDescription);
		initPrinciple(informationHidingName, informationHidingWhy,
				informationHidingDescription);
	}

	private void initPractices() {
		initPractice(automaticUnitTestsName, automaticUnitTestsWhy,
				automaticUnitTestsDescription);
		initPractice(mockupsName, mockupsWhy, mockupsDescription);
		initPractice(codeCoverageAnalysisName, codeCoverageAnalysisWhy,
				codeCoverageAnalysisDescription);
		initPractice(specialEventsName, specialEventsWhy,
				specialEventsDescription);
		initPractice(complexRefactoringName, complexRefactoringWhy,
				complexRefactoringDescription);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
