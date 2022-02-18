package com.syntax.class10;

public class Hw2DarrayMinNumb {
	public static void main(String[]args) {
  /*From an 2D array of integer elements find the 
	* minimum number   
   */
	int[][] numbers = {
            {3, 2, 5},
            {1, 4, 4, 8, 13},
            {9, 1, 0, 2},
            {0, 2, 6, 3, -1, -8}
};
	      int minValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] < minValue) {
                    minValue = numbers[j][i];
                }
              }
           }
   System.out.println("The Min Number of 2D array is:" + minValue);
      }
}

