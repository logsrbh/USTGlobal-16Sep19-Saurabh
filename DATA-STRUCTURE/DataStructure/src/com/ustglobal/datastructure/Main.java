package com.ustglobal.datastructure;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

import com.ustglobal.datastructure.search.BInarySearch;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of Array");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the element ");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		buubleCountingDuration(arr);
		selectionCountingDuration(arr);
		insertionCountingDuration(arr);
		
		/*
		 * QuickSort qs = new QuickSort(); int n =arr.length; qs.sort(arr, 0,n-1);
		 */

	}
	public static void buubleCountingDuration(int[] arr) {
		Instant start = Instant.now();
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(arr);
		Instant end =Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds =  duration/1000.0;
		System.out.println("Bubble Sort time "+seconds +" seconds");
	}
	public static void selectionCountingDuration(int[] arr) {
		Instant start = Instant.now();
		SelectionSort ss = new SelectionSort();
		ss.sort(arr);
		Instant end =Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds =  duration/1000.0;
		System.out.println("Selection Sort time "+seconds +" seconds");
	}
	public static void insertionCountingDuration(int[] arr) {
		Instant start = Instant.now();
		InsertionSort is =new InsertionSort();
		is.sort(arr);
		Instant end =Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds =  duration/1000.0;
		System.out.println("Insertion Sort time "+seconds +" seconds");
	}
	
	

	

}
