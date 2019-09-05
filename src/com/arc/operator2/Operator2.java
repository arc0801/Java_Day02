package com.arc.operator2;

public class Operator2 {

	public static void main(String [] args) {
		int count=1;
		//누적함수
		count = count + 1; //2
		count = count + 1; //3
		count = count + 1;
		count = 1;
		
		++count; // count = count+1;
		System.out.println(count); //2
		
		count++; // count = count+1;
		System.out.println(count); //3
		
		
		
		count = 1;
		int result=0;
		result = ++count;
		
		System.out.println("=======================");
		System.out.println("count : "+count); //2
		System.out.println("result : "+result); //2
		
		count = 1;
		result = 0;
		result = count++;
		
		System.out.println("=======================");
		System.out.println("count : "+count); //2
		System.out.println("result : "+result); //1
		
		count = 1;
		System.out.println(count++); //1
		System.out.println(count); //2
		
		count=1;
		result=0;
		result=++count + count++ + ++count;
		System.out.println(result);
		
	}
	
}
