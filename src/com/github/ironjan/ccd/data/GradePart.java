package com.github.ironjan.ccd.data;

public class GradePart {
	public final String name;
	public final String why;
	public final int evolve;
	public final int correctness;
	public final int efficiency;
	public final int reflexion;
	public final String type;
	public final String description;

	public GradePart(String name, String why, int evolve, int correctness,
			int efficiency, int reflexion, String type, String description) {
		super();
		this.name = name;
		this.why = why;
		this.evolve = evolve;
		this.correctness = correctness;
		this.efficiency = efficiency;
		this.reflexion = reflexion;
		this.type = type;
		this.description = description;
	}

	public GradePart(String name, String why, String description) {
		super();
		this.name = name;
		this.why = why;
		this.description = description;
		this.evolve = 1;
		this.correctness = -1;
		this.efficiency = -1;
		this.reflexion = -1;
		this.type = null;
	}

}
