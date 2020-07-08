package com.srikanth.Lamdas_and_Streams;

import java.util.*;
import java.util.stream.Collectors;

public class StringFilter {
	public List<String> filterStrings(List<String> list){
		return list.stream().filter(s->s.charAt(0)=='a' && s.length()==3).collect(Collectors.toList());
	}
}
