package com.suresh.traveller.main;

import java.util.Scanner;

import com.suresh.traveller.service.MergeSortImplementation;

public class TravellerDriver {
	
	public static void main(String[] args) {
		
		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		NotesCount notesCount = new NotesCount();
		
		System.out.println("enter size of currency denominations");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("enter currency denominations value");
		for (int i = 0; i < size; i++) {
			notes[i]=sc.nextInt();
		}
		
		System.out.println("enter amount you want to pay");
		int amount =sc.nextInt();
		mergeSortImplementation.sort(notes,0,notes.length-1);
		notesCount.notesCountImplementation(notes, amount);
		sc.close();
	}

}
