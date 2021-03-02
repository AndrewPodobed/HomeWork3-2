package com.company;

public class Main {

    public static void main(String[] args) {
            int month = 1;
            if (month == 1 | month == 2 | month ==12) {
                System.out.println("Зима");
            }
            else if (2 < month && month < 6){
                System.out.println("Весна");
            }
            else if (5 < month && month < 9) {
                System.out.println("Лето");
            }
            else if (8 < month && month < 12) {
                System.out.println("Осень");
            }
            else if ( month > 12 | month <= 0){
                System.out.println("Вы ввели недопустимое значение! Введите номер месяца (от 1 до 12)");
            }

            switch (month){
                case 12 :
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Вы ввели недопустимое значение! Введите номер месяца (от 1 до 12)");
            }

            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            for (int i = array.length - 1; i >= 0; i--){
                System.out.print(array[i] + " ");

            }
            System.out.println(" ");

            int[][] squareArray = new int[2][3];
            squareArray[0][0] = 1;
            squareArray[0][1] = 2;
            squareArray[0][2] = 3;
            squareArray[1][0] = 6;
            squareArray[1][1] = 5;
            squareArray[1][2] = 4;
            int max = squareArray[0][0];
            for (int i = 0; i < squareArray.length; i++) {
                for (int j = 0; j < squareArray[i].length; j++) {

                    System.out.print(squareArray[i][j] + "[" + i + "][" + j + "]" + " ");
                }
                System.out.println(" ");
            }
        }
    }
