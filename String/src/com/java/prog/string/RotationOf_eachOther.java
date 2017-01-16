package com.java.prog.string;
/**
 * @author atishpatra
 * A Program to check if strings are rotations of each other or not
 */
public class RotationOf_eachOther {
	public static void main(String[] args){
//		String first = "AACD";
//		String second = "ACDA";
		String first = "ABCD";
		String second = "DCBA";
		
		if((rotation_eachother(first, second)) == true)
		    System.out.println("Strings are rotations of each other");
        else
            System.out.printf("Strings are not rotations of each other");
	}

	private static boolean rotation_eachother(String first, String second) {
		if(first == null || second == null)
			return false;
		return (first.length() == second.length() &&
					((first+first).indexOf(second) != -1));
	}
}
