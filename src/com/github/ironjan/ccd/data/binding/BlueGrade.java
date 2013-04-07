package com.github.ironjan.ccd.data.binding;

import com.github.ironjan.ccd.data.*;
import com.googlecode.androidannotations.annotations.*;
import com.googlecode.androidannotations.annotations.res.*;


@EBean
public class BlueGrade extends Grade {
	@StringRes
	String blueGradeName, designAndImplementationName,
			designAndImplementationWhy, designAndImplementationDescription,
			implementationMirrorsDesignName, implementationMirrorsDesignWhy,
			implementationMirrorsDesignDescription, yagniName, yagniWhy,
			yagniDescription, continousDeliveryName, continousDeliveryWhy,
			continousDeliveryDescription, iterativeDevelopmentName,
			iterativeDevelopmentWhy, iterativeDevelopmentDescription,
			componentorientedName, componentorientedWhy,
			componentorientedDescription, testsFirstName, testsFirstWhy,
			testsFirstDescription;

	@AfterInject
	void init() {
		initPrinciples();
		initPractices();
	}

	private void initPractices() {
		initPractice(continousDeliveryName, continousDeliveryWhy,
				continousDeliveryDescription);
		initPractice(iterativeDevelopmentName, iterativeDevelopmentWhy,
				iterativeDevelopmentDescription);
		initPractice(componentorientedName, componentorientedWhy,
				componentorientedDescription);
		initPractice(testsFirstName, testsFirstWhy, testsFirstDescription);
	}

	private void initPrinciples() {
		initPrinciple(designAndImplementationName, designAndImplementationWhy,
				designAndImplementationDescription);
		initPrinciple(implementationMirrorsDesignName,
				implementationMirrorsDesignWhy,
				implementationMirrorsDesignDescription);
		initPrinciple(yagniName, yagniWhy, yagniDescription);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
