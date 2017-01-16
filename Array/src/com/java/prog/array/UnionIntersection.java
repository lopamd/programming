package com.java.prog.array;
class UnionItersection
{
	public static void print_union(int[] arr1, int[] arr2){
		int m = arr1.length;
		int n = arr2.length;
		int i = 0 , j = 0;
		while(i < m && j < n)
		{
			if(arr1[i] < arr2[j]){
				System.out.print(" " + arr1[i]);
				i++;
				continue;
			}else{
				if(arr1[i] == arr2[j]){
					System.out.print(" " + arr1[i]);
					i++;
					j++;
					continue;
				}else{
					System.out.print(" " + arr2[j]);
					j++;
					continue;
				}
			}
		}
		while(i < m){
			System.out.print(" " + arr1[i]);
			break;
		}
		while(j < n){
			System.out.print(" " + arr2[j]);
			break;
		}
	}
	
	public static void print_intersection(int[] arr1, int[] arr2){
		int m = arr1.length;
		int n = arr2.length;
		int i = 0, j =0;
		while(i < m && j < n){
			if(arr1[i] < arr2[j]){
				i++;
			}else{
				if(arr1[i] > arr2[j]){
					j++;
				}else{
					System.out.print(arr1[i] + " ");
					i++;
					j++;
				}
			}
		}
	}
 
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] input1 = {1, 2, 4, 5, 6};
		int[] input2 = {2, 4, 5, 11};
		System.out.print("The union of 2 arrays is    : ");
		print_union(input1, input2);
		System.out.print("\n" + "Intersection of 2 arrays is : ");

		print_intersection(input1, input2);
	}
}
