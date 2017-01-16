package com.java.prog.string;
/**
 * @author atishpatra
 *
 */
public class String_permutation {
	public static void main(String[] args){
		String input = "ABC";
		permute(input, 0, input.length()-1);
	}

	private static void permute(String input, int left, int right) {
		int i;
		StringBuilder sb = new StringBuilder(input);
		if(left == right)
			System.out.println(sb);
		else{
			for(i = left ; i <= right ; i++)
			{
				//System.out.println("i value1 :"+ i + " left value : " + left);
				swap(sb, left, i);
				//System.out.println("***************" + sb);
				//System.out.println("i value2 :"+ i + " left value : " + left);
				permute(sb.toString(), left + 1, right);
				//System.out.println("i value3 :"+ i + " left value : " + left);
				swap(sb, left, i); // backtracking
				//System.out.println("i value4 :"+ i + " left value : " + left);
				//System.out.println("_______________" + sb);
			}
		}
		
	}

	private static void swap(StringBuilder input, int i, int j) {
		char temp = input.charAt(i);
		input.setCharAt(i, input.charAt(j));
		input.setCharAt(j, temp);	
	}
}
