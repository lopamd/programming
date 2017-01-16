package com.java.prog.array;
//Equilibrium index of an array
public class Equilibrium_index {
	public static void main(String[] args){
		int[] input = {-7, 1, 5, 2, -4, 3, 0};
		int size = input.length;
		System.out.print("The equilibrium index : ");
		equilibrium(input , size);
	}

	private static int equilibrium(int[] input, int size) {
		if(size == 1)
			return input[0];
		if(size == 0)
			return -1;
		int sum = 0;
		int leftsum = 0;
		for(int i = 0 ; i < size ; i++){
			sum = sum + input[i];
		}
		
		for(int i = 0 ; i < size ; i++){
			sum = sum - input[i]; //right sum
			if(sum == leftsum)
				System.out.print(i + " ");
			leftsum = leftsum + input[i];
		}
		return -1;
	}
}
