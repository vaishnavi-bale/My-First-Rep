package com.cts.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StramAPI1 {
	public static void main(String args[]) {
		List<Employee5> employee = new ArrayList<Employee5>();

		addEmployees(employee);
		employee.forEach(System.out::println);

		List<Employee5> ageScale = employee.stream()
				.filter(emp -> emp.getAge() < 22 && emp.getAddr().contentEquals("hyd")).collect(Collectors.toList());
		System.out.println("employees with age less than 22:\n");
		ageScale.forEach(System.out::println);

		List<Employee5> nameLen = employee.stream().filter(s -> (s.getName().length()) >= 5)
				.collect(Collectors.toList());
		System.out.println("the names that has length greater than 5:\n");
		nameLen.forEach(System.out::println);

		List<Employee5> salary = employee.stream().map(sal -> {
			sal.setSal(sal.getSal() * 1.1);
			return sal;
		}).collect(Collectors.toList());
		System.out.println("increased salary with 10%:\n");
		salary.forEach(System.out::println);
	}

	private static void addEmployees(List<Employee5> employee) {
		Employee5 emp1 = new Employee5(101, "vaish", "hyd", 21, 5352556265L, 21000);
		Employee5 emp2 = new Employee5(102, "vidya", "warangal", 22, 5362556265L, 22000);
		Employee5 emp3 = new Employee5(103, "pranay", "hyd", 21, 4362556265L, 25000);
		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);
	}
}
