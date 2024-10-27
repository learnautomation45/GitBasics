package demo;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num to reverse:");
		int num=sc.nextInt();//456
		int rev=0;
		for(int i=num;i>0;i=i/10) {//4
			int rem=i%10;//0
			rev=rev*10+rem;//60+5=654
		}
		System.out.println(rev);
	}

}
