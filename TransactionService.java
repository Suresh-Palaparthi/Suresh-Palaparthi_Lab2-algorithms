package com.suresh.transaction.service;

import java.util.Scanner;

public class TransactionService {
	
	public void checkTransaction(int[] arr, int targetNo) {
		
		Scanner s = new Scanner(System.in);
		
		while (targetNo-- != 0) {
			
			int flag = 0;
			
			int target;
			
			System.out.println("enter the target value");
			target = s.nextInt();
			
			int sum=0;
			
			for (int i=0;i<arr.length, i++)
				
				sum += arr[i];
					
				if (sum >= target) {
					
					System.out.println("Target is reached after "+(i+1)+ "transactions");
					
					flag = 1;
					
					break;
				}
			
		}
	}

}
