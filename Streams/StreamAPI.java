package com.cts.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String ar[]) {
		// it is used with collections and return us the modified collection.
		// based on certain conditions we get the results.
		// 1.filter()
		List<String> names = new ArrayList<String>();
		addNames(names);

		names.forEach(System.out::println);

		List<String> lengthScale = names.stream().filter(s -> s.length() >= 7).collect(Collectors.toList());
		System.out.println("the names that has length greater than 7:\n");
		lengthScale.forEach(System.out::println);
        
		List<String> capName = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println("Nmaes in capital letter");
        capName.forEach(System.out::println);
	}

	private static void addNames(List<String> names) {
		names.add("abin joshy");
		names.add("sai");
		names.add("aniket andhale");
	}
}
