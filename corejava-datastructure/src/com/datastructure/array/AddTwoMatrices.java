package com.datastructure.array;

public class AddTwoMatrices {
	public static void main(String[] args) {
		//2 X 3 matrices 2Rows 3Column
		int[][] matrices1 = { {1,2,3},
							  {4,5,6}
		};
		int[][] matrices2 = { {11,12,13},
							  {24,25,26}
		};
		int[][] result    = { {0,0,0},
				              {0,0,0}
		};
		
		for(int i = 0; i<matrices1.length ; i++) {
			for(int j= 0; j < matrices1[i].length; j++) {
				result[i][j] = matrices1[i][j] + matrices2[i][j];
				System.out.print(result[i][j] +" ");
			}
			System.out.println();
		}
//		for(int i = 0; i<result.length ; i++) {
//			for(int j= 0; j < result[i].length; j++) {
//				System.out.print(result[i][j] +" ");
//			}
//			System.out.println();
//		}
		
		
		
		
	}
}
