package com.java.prog.matrix;
/**
 *Dynamic Programming | Set 6 (Min Cost Path)
 */
public class Min_Cost_Path1 {
	public static void main(String[] args) {
		  int cost[][] = { 	{1, 2, 3},
                  			{4, 8, 2},
                  			{1, 5, 3} 
                  		};
		  System.out.println("Minimum cost for path : " + min_cost(cost, 1, 2));
	}

	public static int min_cost(int[][] cost, int i, int j) {
		if(i < 0 || j < 0)
			return Integer.MAX_VALUE;
		else if(i == 0 && j == 0)
			return cost[i][j];
		else
			return cost[i][j] + min(min_cost(cost, i - 1, j - 1),min_cost(cost, i, j - 1),min_cost(cost, i - 1, j));
	}
	
	public static int min(int a, int b, int c){
		return a <= b && a <= c ? a : ((b <= a && b <= c) ? b : c);
	}
}
