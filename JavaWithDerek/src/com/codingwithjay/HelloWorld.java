package com.codingwithjay;

import java.util.*;
import java.util.stream.IntStream;


public class HelloWorld {

	public static void main(String[] args) {
	
		ArrayList<String> aL1 = new ArrayList<String>(20);
		aL1.add( "Jay");
		aL1.add( "Sue");
		System.out.println(aL1);
		
		ArrayList<Integer> aL2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		for(Integer x: aL2) System.out.println(x);
		System.out.println(aL2.get(2));
	}
}
