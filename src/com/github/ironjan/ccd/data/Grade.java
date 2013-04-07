package com.github.ironjan.ccd.data;

import java.util.*;

public abstract class Grade {
	private final List<GradePart> mPrinciples = new ArrayList<GradePart>();
	private final List<GradePart> mPractices = new ArrayList<GradePart>();

	public abstract String getName();

	protected void initPrinciple(String name, String why, String description) {
		GradePart part = new GradePart(name, why, description);
		mPrinciples.add(part);
	}

	protected void initPractice(String name, String why, String description) {
		GradePart part = new GradePart(name, why, description);
		mPractices.add(part);
	}

	public List<GradePart> getPrinciples() {
		return mPrinciples;
	}

	public List<GradePart> getPractices() {
		return mPractices;
	}
}
