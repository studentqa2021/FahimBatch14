package com.test.run;

import com.myprogram.ActualTestCode;

public class TestExecution {
	
	public static void main(String[] args) {
		ActualTestCode obj = new ActualTestCode(4,5,6);
		obj.GetSalary();
		obj.GetIncome();
		obj.GetSum();
		obj.GetMultiplication();
		
		//ActualTestCode.GetMoney(); //(ClassName.MethodName)
	}
}
