package com.Shivansh.balancedbrackets.main;

import com.Shivansh.balancedbrackets.service.BalancingBrackets;

public class Driver{
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
	        BalancingBrackets balancingbrackets = new BalancingBrackets();
	        String bracketExpression = "([[{}]])";
	        boolean result;
	        result = balancingbrackets.checkingBracketsBalanced(bracketExpression);
	        if(result)
	        	System.out.println("the enntered String has Balanced Brackets");
	        else
	        	System.out.println("The entered String has not contain Balanced Brackets");		
		}

}



