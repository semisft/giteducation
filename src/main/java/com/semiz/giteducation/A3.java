package com.semiz.giteducation;

import java.util.List;

public class A3 {

	public static void main1(String[] args) {
		System.out.println("A3 step 1");
	}
	
	public Integer getMax(List<Integer> vals) {
		return vals.stream().mapToInt(v -> v.intValue()).max().getAsInt();
	}
}
