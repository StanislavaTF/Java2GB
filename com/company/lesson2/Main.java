package com.company.lesson2;

public class Main {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] y = {
                {"1", "2", "4", "5"},
                {"0", "1", "1", "1"}
        };
        negativeTestSizeArray(y);
        String[][] n = {{"1", "2", "4", "5"},
            {"0", "1", "1", "1"},
            {"1", "2", "4", "5"},
            {"0", "1", "1", "1"}}
        ;
        sumOfArrayElements(n);
        String[][] m = {{"1", "2", "4", "5"},
                {"0", "1", "1", "1"},
                {"1", "text", "4", "5"},
                {"0", "1", "1", "1"}}
                ;
        sumOfArrayElements(m);
    }




    public static void negativeTestSizeArray(String[][] array) throws MyArrayDataException {

        try {
            arrayProcessor(array);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        System.out.println("Array of incorrect size");
    }

    public static void arrayProcessor(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length == 4 && array[0].length == 4) {
            System.out.println(array);
        } else throw new MyArraySizeException();
    }

        public static void sumOfArrayElements(String [][] array) throws NumberFormatException, MyArrayDataException {


        int summ = 0;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        summ += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                        throw new MyArrayDataException(String.format("Impossible to complete:" + "element i: " + i + " "+"element j:"  + j ));
                    }
                }
            }

            System.out.println("Array of correct");
            System.out.println("Sum of array elements:" + summ);
        }

}