package com.sangita1;

import java.util.Scanner;

public class Calculator {

	static Object calculation(int num1, int num2, String op)
	{
		Object rs = null;
		
		switch(op)
		{
			case "+" : 	rs = (num1+num2);
							break;
			case "-" : 	rs = (num1-num2);
							break;
			case "*" : 	rs = (num1*num2);
							break;
			case "/" :  rs = (num2==0)?null:(num1/num2);
							break;		
			case "%" : 	rs = (num1%num2);
							break;
			default : return rs;
		}
		
		return rs;
		
	}
	
	public static void main(String[] args) {
		
		int num1, num2;
		
		String op, flag="Y";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n\nOperator Menu: "
				+ "\n Addition:\t '+'"
				+ "\n Subtraction:\t '-'"
				+ "\n Product:\t '*'"
				+ "\n Quotient:\t '/'"
				+ "\n Modulus:\t '%'");
		
		while(flag.equals("Y"))
		{
			
			System.out.println("\nEnter first number: ");
			num1 = scanner.nextInt();
		
			System.out.println("\nEnter the operator: ");
			op = scanner.next();
		
			System.out.println("\nEnter second number: ");
			num2 = scanner.nextInt();
			
			Object result = calculation(num1, num2, op);
			if(result == null)
				System.out.println("\n\nINVALID operation");
			else
				System.out.println("\n\n" + num1 + " " + op + " " + num2 + " = " + result +"\n\n");
			
			System.out.println("\n\nDo you wish to continue? Y/N");
			flag = scanner.next();
			
		}
		
	
		scanner.close();
	}

}
