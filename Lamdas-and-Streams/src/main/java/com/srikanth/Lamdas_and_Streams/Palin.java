package com.srikanth.Lamdas_and_Streams;

import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
public interface Palin {
	void PalindromeList(List<String> list,Predicate<String> predicate);

}
