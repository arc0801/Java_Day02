package com.arc.operator;

import java.util.Scanner;

public class Operator_5 {

	public static void main(String [] args) {
		//10% +10%
		//100000
		//81000
		
	Scanner sc = new Scanner(System.in);
	int money = 0;
	int pay = 0;
	int dc1 = 0;
	int dc2 = 0;
		
	System.out.println("물건값");	
	money = sc.nextInt();
	
	dc1 = (int)(money*0.1);
	dc2 = (int)(dc1*0.1);
	
	pay = money - dc1 - dc2;
		
	System.out.println(pay);
		
	
	
	
	
	
	
	}
	
	
	
}
