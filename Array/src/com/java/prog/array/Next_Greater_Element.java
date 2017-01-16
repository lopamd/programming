package com.java.prog.array;
import java.util.Stack;

public class Next_Greater_Element {
	public static void printNextGreaterElement(int[] input){
		if(input == null)
			return;
		if(input.length ==1){
			System.out.println("-1");
			return;
		}
		int len = input.length;
		Stack<Integer> arrStack = new Stack<Integer>();
		arrStack.push(input[0]);
		for(int i = 1; i < len; i++){
			while(!arrStack.isEmpty() && arrStack.peek() < input[i]){
				System.out.println("The next greater element in the right of "+arrStack.pop()+"is : "+ input[i]);
			}
			arrStack.push(input[i]);
		}
		while(!arrStack.isEmpty()){
			System.out.println("The next greater element in the right of "+arrStack.pop()+"is : "+ -1);
		}
		
	}
	public static void main(String[] args) {
		int[] input = { 25, 23, 54, 12, 20, 7, 27 };
		printNextGreaterElement(input);
	}
}
