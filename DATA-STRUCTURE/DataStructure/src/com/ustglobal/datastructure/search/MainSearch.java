package com.ustglobal.datastructure.search;

import java.time.Duration;
import java.time.Instant;

import com.ustglobal.datastructure.search.BInarySearch;

public class MainSearch {

	public static void main(String[] args) {
		
		binarySearchDuration();
		LinearSearchDuration();
		
	}
	
	public static void binarySearchDuration() {
		Instant start = Instant.now();
		BInarySearch ob = new BInarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
        Instant end =Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds =  duration/1000.0;
		System.out.println("Binary Search time "+seconds +" seconds");
    } 
	
	public static void LinearSearchDuration() {
		Instant start = Instant.now();
		LinearSearch ob = new LinearSearch(); 
		int arr[] = { 2, 3, 4, 10, 40 };  
	    int x = 10; 
	      
	    int result = ob.search(arr, x); 
	    if(result == -1) 
	        System.out.println("Element is not present in array"); 
	    else
	        System.out.println("Element is present at index " + result); 
	
        Instant end =Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds =  duration/1000.0;
		System.out.println("Linear Search time "+seconds +" seconds");
    } 
	
	
	
	
}
