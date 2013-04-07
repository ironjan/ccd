package com.github.ironjan.ccd.data.binding;

import com.github.ironjan.ccd.data.*;
import com.googlecode.androidannotations.annotations.*;
import com.googlecode.androidannotations.annotations.res.*;


@EBean
public class OrangeGrade extends Grade {

	@StringRes
	String orangeGradeName, slaName, slaWhy, slaDescription, srpName, srpWhy,
			srpDescription, socName, socWhy, socDescription,
			codeConventionsNamesName, codeConventionsNamesWhy,
			codeConventionsNamesDescription, codeConventionsCommentsName,
			codeConventionsCommentsWhy, codeConventionsCommentsDescription,
			issueTrackingName, issueTrackingWhy, issueTrackingDescription,
			automaticIntegrationTestsName, automaticIntegrationTestsWhy,
			automaticIntegrationTestsDescription, readingName, readingWhy,
			readingDescription, reviewsName, reviewsWhy, reviewsDescription;

	@AfterInject
	void init() {
		initPrinciples();
		initPractices();
	}

	private void initPractices() {
		initPractice(issueTrackingName, issueTrackingWhy,
				issueTrackingDescription);
		initPractice(automaticIntegrationTestsName,
				automaticIntegrationTestsWhy,
				automaticIntegrationTestsDescription);
		initPractice(readingName, readingWhy, readingDescription);
		initPractice(reviewsName, reviewsWhy, reviewsDescription);
	}

	private void initPrinciples() {
		initPrinciple(slaName, slaWhy, slaDescription);
		initPrinciple(srpName, srpWhy, srpDescription);
		initPrinciple(socName, socWhy, socDescription);
		initPrinciple(codeConventionsNamesName, codeConventionsNamesWhy,
				codeConventionsNamesDescription);
		initPrinciple(codeConventionsCommentsName, codeConventionsCommentsWhy,
				codeConventionsCommentsDescription);
	}

	@Override
	public String getName() {
		return orangeGradeName;
	}

}
