package com.arc.operator2;

import java.util.Scanner;

public class Operator7 {

	public static void main(String [] args) {
		
		//수식 작성
		
		// 0	->0
		// 1	->  1
		// 2	->  2
		// 3	->  3
		
		// 4	->10
		// 5	->  11
		// 6	->  12
		// 7	->13
		
		// 8	->  20
		// 9	->  21
		
		Scanner sc= new Scanner(System.in);
		int input = 1;
		int output1 = 0;
		int output2 = 0;
		
		System.out.println("숫자");
		input = sc.nextInt();
		
		output1 = input/4;
		output2 = input%4; // output = input/4*10 + input%4;
		
		System.out.print(output1);
		System.out.print(output2);
		
		
	}
}
