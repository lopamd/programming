package com.java.prog.bit;
/**
 * (mask^n) - mask  OR (mask + n)^mask 
 *Operator >> called Signed right shift, shift all the bits to right a specified number of times. 
 *Important is >> fills leftmost sign bit (Most Significant Bit MSB) to leftmost bit the after shift. 
 *This is called sign extension and serves to preserve the sign of negative numbers when you shift them right.
 *And below is, how >> works? When you do -5 >> 3

                        this 3 bits are shifted 
                         out and loss
 MSB                   (___________)      
+----+----+----+---+---+---+---+---+
|  1 |  1 | 1  | 1 | 1 | 0 | 1 | 1 |   
+----+----+----+---+---+---+---+---+
  | \                 \  
  |  ------------|     ----------|
  |              |               |
  ▼              ▼               ▼
+----+----+----+---+---+---+---+---+
|  1 |  1 | 1  | 1 | 1 | 1 | 1 | 1 |
+----+----+----+---+---+---+---+---+
(______________)
 The sign is        
 propagated
 */
public class Absolute_Value_without_Branching {
	public static void main(String[] args) {
		int n = -89;
		System.out.println("The absolute value of "+ n + " is " + get_absolute_value(n));
	}

	public static int get_absolute_value(int n) {
		int mask = (n >> (Integer.SIZE - 1));
		int xor = mask ^ n;
		int result = xor - mask;
		return result;
	}
}
