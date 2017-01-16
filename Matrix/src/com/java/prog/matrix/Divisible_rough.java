package com.java.prog.matrix;

import java.util.ArrayList;


public class Divisible_rough {
	public static void main(String[] args) {
		int arr[] = {1 ,7, 2, 4};
		int k = 3;
		get_max_subset(arr,4, k);

    }
    	 public static void get_max_subset(int[] arr, int n, int k){
	        int j;
	        ArrayList<Integer> source = new ArrayList<Integer>();
	        for(int i = 0; i < n; i++){
	        	source.add(arr[i]);
	        }
	        ArrayList<Integer> destination = new ArrayList<Integer>();
	        destination = source;
            if(arr == null || n == 0 || k == 0){
            	System.out.println(0);
                return;
            }
            if(n == 1 || k == 1 || arr.length == 1 || (arr.length != n)){
            	System.out.println(0);
            	return;
            }
	        for(int i = 0; i < source.size(); i++){
	        	for(j = i + 1; j < destination.size(); j++){
	        	 if((source.get(i) + destination.get(j)) % k == 0 || source.get(i) == destination.get(j)){
	                	 destination.remove(j);
//		                	 source.remove(j);
	        	 }
	        	}
	        }
	        System.out.println(destination.size());
	    }
}
