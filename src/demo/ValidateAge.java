package demo;

import java.util.Scanner;

public class ValidateAge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		if(age>18) {
			System.out.println("Allowed to vote");
		}
		else {
			System.out.println("Not Allowed to vote");
		}

	}

}
