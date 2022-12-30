package java_course;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Age_calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your date of birth in Year-Month-Day order : ");	
			String dob=sc.nextLine();
			LocalDate ld=LocalDate.parse(dob);
			LocalDate now=LocalDate.now();
			int year=Period.between(ld, now).getYears();
			System.out.println("You are " + year + " years old");

	}

}
