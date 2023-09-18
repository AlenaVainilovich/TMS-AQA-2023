package HW4;

import java.util.Random;

/*
Умножение двух матриц. Создайте два массива целых чисел размером 3х3 (две матрицы).
Напишите программу для умножения двух матриц.

Справочное инфо:
Для умножения двух матриц A и B, необходимо выполнить следующие шаги:
1. Проверьте совместимость: Матрица A должна иметь число столбцов, равное числу строк матрицы B.
В противном случае операция умножения не определена.
2. Создайте новую матрицу C: Результирующая матрица будет иметь количество строк, равное количеству строк матрицы A,
и количество столбцов, равное количеству столбцов матрицы B.
3. Вычислите элементы матрицы C: Элемент C[i][j] получается путем умножения строки i матрицы A на столбец j матрицы B
и суммирования произведений.
 */
public class HW4_3dop {
    public static void main(String[] args) {
        int[][] matrixA = new int[3][3];
        int[][] matrixB = new int[3][3];
        Random rnd = new Random();

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixA[i][j] = rnd.nextInt(10);
                matrixB[i][j] = rnd.nextInt(10);

                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.print("\t");

            for (int j = 0; j < matrixB[i].length; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }

        int rowsMatrixA = matrixA.length;
        int colsMatrixA = matrixA[0].length;
        int rowsMatrixB = matrixB.length;
        int colsMatrixB = matrixB[0].length;

        if (colsMatrixA != rowsMatrixB) {
            System.out.println("Матрицы несовместимы для умножения.");
            return;
        }

        int[][] matrixC = new int[rowsMatrixA][colsMatrixB];
        for (int i = 0; i < rowsMatrixA; i++) {
            for (int j = 0; j < colsMatrixB; j++) {
                int newElement = 0;
                for (int k = 0; k < colsMatrixA; k++) {
                    newElement += matrixA[i][k] * matrixB[k][j];
                }
                matrixC[i][j] = newElement;
            }
        }

        System.out.println("Перемноженная матрица:");
        for (int i = 0; i < rowsMatrixA; i++) {
            for (int j = 0; j < colsMatrixB; j++) {
                System.out.print(matrixC[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

