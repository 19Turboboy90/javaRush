package com.JavaSyntaxPro.level_6.lecture_6;

/*

В методе main(String[]) выведи на экран все числа из трехмерного массива multiArray.

Требования:
•	В классе Solution должна быть публичная статическая переменная multiArray типа int[][][].
•	В методе main(String[]) выведи на экран все числа из multiArray.
 */
public class Task_3 {
    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
//        for (int[][] array_2 : multiArray) {
//            for (int[] array_1 : array_2) {
//                for (int item : array_1) {
//                    System.out.println(item + " ");
//                }
//            }
//        }

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    System.out.print(multiArray[i][j][k] + " ");
                }
                System.out.println("");
            }
            System.out.println("______");
        }
    }
}
