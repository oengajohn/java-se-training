package com.systechafrica.arrays;

import java.util.logging.Logger;

public class WorkingWithArrays {
    private static final Logger LOGGER = Logger.getLogger(WorkingWithArrays.class.getName());

    public void singleDimensionalArray() {
        int[] numbers = { 45, 10, 26, 35, 40, 59 }; // int numbers[]

        int ages[] = { 45, 10, 26, 35, 40, 59 }; // c/c++ array is also valid in java not commonly used

        String[] nickNames = { "mhusika", "Ntate", "Yokana" };

        for (int i = 0; i < numbers.length; i++) {
            LOGGER.info("" + numbers[i]);
        }

        LOGGER.info(nickNames[0]);
        LOGGER.info(nickNames[1]);
        LOGGER.info(nickNames[2]);

        int[] a = { 1, 2, 3, 4, 5 }; //
        for (int i = 0; i < a.length; i = i + 1) {
            if (a[i] % 2 != 0) {
                LOGGER.info("" + a[i]); //
            }
        }

    }

    public void multiDimensionalArray() {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // length of multi dimension array we count the number of elements in the parent
        // array
        int length = matrix.length;
        LOGGER.info("Length of multi dimension array: " + length);
        LOGGER.info("Number 8 => : " + matrix[2][2]);

        String[][] matrix3 = new String[3][3]; // ? indicates a multi dimension array with length of 3 and individual
        // ? arrays with length of 3
        int[][] matrix4;
        matrix4 = new int[5][];
        // Setting values for the array

        int[][] matrix2 = new int[3][3]; // ? indicates a multi dimension array with length of 3
        //row 1
        matrix2[0][0] = 10;
        matrix2[0][1] = 15;
        //row 2
        matrix2[1][2] = 15;
        //row 3
        matrix2[2][0] = 20;
        matrix2[2][2] = 30;

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                LOGGER.info (matrix2[i][j]+ " ");
            }
            LOGGER.info ( " \n");
        }




    }

    public static void main(String[] args) {
        WorkingWithArrays app = new WorkingWithArrays();
        // app.singleDimensionalArray();
        app.multiDimensionalArray();
    }

}
