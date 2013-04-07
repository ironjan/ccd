package com.github.ironjan.ccd.data.binding;

import com.github.ironjan.ccd.data.*;
import com.googlecode.androidannotations.annotations.*;
import com.googlecode.androidannotations.annotations.res.*;


@EBean
public class GreenGrade extends Grade {

	@StringRes
	String greenGradeName, openClosedPrincipleName, openClosedPrincipleWhy,
			openClosedPrincipleDescription, tellDontAskName, tellDontAskWhy,
			tellDontAskDescription, lawOfDemeterName, lawOfDemeterWhy,
			lawOfDemeterDescription, continousIntegrationName,
			continousIntegrationWhy, continousIntegrationDescription,
			staticCodeAnalysisName, staticCodeAnalysisWhy,
			staticCodeAnalysisDescription, iocContainerName, iocContainerWhy,
			iocContainerDescription, shareExperiencesName, shareExperiencesWhy,
			shareExperiencesDescription, errorMeasurementName,
			errorMeasurementWhy, errorMeasurementDescription;

	@AfterInject
	void init() {
		initPrinciples();
		initPractices();
	}

	private void initPrinciples() {
		initPrinciple(openClosedPrincipleName, openClosedPrincipleWhy,
				openClosedPrincipleDescription);
		initPrinciple(tellDontAskName, tellDontAskWhy, tellDontAskDescription);
		initPrinciple(lawOfDemeterName, lawOfDemeterWhy,
				lawOfDemeterDescription);
	}

	private void initPractices() {
		initPractice(continousIntegrationName, continousIntegrationWhy,
				continousIntegrationDescription);
		initPractice(staticCodeAnalysisName, staticCodeAnalysisWhy,
				staticCodeAnalysisDescription);
		initPractice(iocContainerName, iocContainerWhy, iocContainerDescription);
		initPractice(shareExperiencesName, shareExperiencesWhy,
				shareExperiencesDescription);
		initPractice(errorMeasurementName, errorMeasurementWhy,
				errorMeasurementDescription);
	}

	@Override
	public String getName() {
		return greenGradeName;
	}
}
