import java.util.Scanner;

/*Problem Statement
The management of LearnMore University is planning to automate the 
University management system. Therefore, Steve Wilkinson, the 
programmer, has decided to create a Java program that accepts the 
student details, such as the first name, last name, age, 
course enrolled, and student ID. In addition, he also needs to 
accept the employee details, such as first name, last name, age,
salary, department name, designation, and employee ID. Steve must
ensure the reusability of code. The program must offer a choice to
accept either the student's or employee's details. Help Steve to 
develop the program.*/


public class College {
public static void main(String args[]) {
	Employee1 e= new Employee1();
	e.get_details();
	e.display_employee();
}
}
class Student{
	String f_name,l_name,course_enrolled;
	int age,id;
	Scanner s= new Scanner(System.in);
	void get_details() {
		Scanner s1= new Scanner(System.in);
		System.out.println("enter first name");
		f_name=s.nextLine();
		System.out.println("enter last name");
		l_name=s.nextLine();
		System.out.println("enter age");
		age=Integer.parseInt(s.nextLine());
		System.out.println("enter course_enrolled");
		course_enrolled=s.nextLine();
		System.out.println("enter salary");
	    id=Integer.parseInt(s.nextLine());
	}
	void display_student(){
		System.out.println("first name :"+f_name+" last name: "+l_name+""
				+ " age"+age+" dept_name:"+dept_name+"designation: " +
				designation+" salary:"+salary);
	}

	
}
class Employee1 extends Student{
	int salary;
	String dept_name,designation;
	void get_details() {
		Scanner s1= new Scanner(System.in);
		System.out.println("enter first name");
		f_name=s.nextLine();
		System.out.println("enter last name");
		l_name=s.nextLine();
		System.out.println("enter age");
		age=Integer.parseInt(s.nextLine());
		System.out.println("enter dept_name");
		dept_name=s.nextLine();
		System.out.println("enter designation");
		designation=s.nextLine();
		System.out.println("enter salary");
		salary=Integer.parseInt(s.nextLine());
	}
	void display_employee(){
		System.out.println("first name :"+f_name+" last name: "+l_name+""
				+ " age"+age+" dept_name:"+dept_name+"designation: " +
				designation+" salary:"+salary);
	}


}