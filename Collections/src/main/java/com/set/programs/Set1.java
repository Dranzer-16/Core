package com.set.programs;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Set1 {
	public static void main(String[] args) {
        Set<String> distinctWords = Arrays.asList(args).stream()
		.collect(Collectors.toSet()); 
        System.out.println(distinctWords.size()+ 
                           " distinct words: " + 
                           distinctWords);
    }
}
