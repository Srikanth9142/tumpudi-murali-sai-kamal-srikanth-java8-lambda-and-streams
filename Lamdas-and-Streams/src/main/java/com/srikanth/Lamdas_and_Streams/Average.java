package com.srikanth.Lamdas_and_Streams;

import java.util.List;

public class Average {
	public double findAverage(List<Integer> list) {
		return list.stream().mapToInt((a)->a.intValue()).average().getAsDouble();
	}
}
