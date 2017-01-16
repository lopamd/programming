package com.java.prog.matrix;

public class Min_Cost_Path2 {
	public static void main(String[] args) {
		 int cost[][] = { {1, 2, 3},
				 		  {4, 8, 2},
				 		  {1, 5, 3} };
		 System.out.println("Minimum cost for path : " + minimum_cost(cost, 2, 2));
	}

	public static int minimum_cost(int[][] cost, int i, int j) {
		int R = cost.length;
		int C = cost[0].length;
		int r,c;
		int total_cost[][] = new int[R][C];
		total_cost[0][0] = cost[0][0];
		/*Initialize first Row of total_cost matrix*/
		for(c = 1; c <= j; c++){
			total_cost[0][c] = total_cost[0][c - 1] + cost[0][c];
		}
		
		/*Initialize first Column of total_cost matrix*/
		for(r =  1; r <= i; r++){
			total_cost[r][0] = total_cost[r - 1][0] + cost[r][0];
		}
		
		/*construct Rest of the total_cost matrix*/
		for(r = 1; r <= i; r++){
			for(c = 1; c <= j; c++){
				total_cost[r][c] = cost[r][c] + min(total_cost[r - 1][c - 1], total_cost[r - 1][c],
													total_cost[r][c - 1]);
			}
		}
		return total_cost[i][j];
	}
	public static int min(int a, int b, int c){
		return a <= b && a <= c ? a : ((b <= a && b <= c) ? b : c);
	}
}
