package com.suresh.transaction.main;

import java.util.Scanner;

public class TransactionDriver {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter size of array");
		
		int size = s.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("enter array values");
		
		for (int =0; i < size; i++)
			
			arr[i] = s.nextInt();
		System.out.println("enter total no. of targets that are needed");
		int targetNo = s.nextInt();
		
		TransactionService transactionservice = new TransactionService();
		
		transactionService.checkTransaction = (arr, TargetNo );
		
		s.close();
	}

}
