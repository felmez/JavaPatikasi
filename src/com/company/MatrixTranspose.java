package com.company;

public class MatrixTranspose {
    static final int M = 2, N = 3;

    public static void transpose(int A[][], int B[][]) {
        int i, j;
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                B[i][j] = A[j][i];
            }
        }

        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void matrix(int A[][]) {
        for (int[] ints : A) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int A[][] = {
                {2, 3, 4},
                {5, 6, 7}
        };

        int B[][] = new int[N][M], i, j;


        System.out.println("The Matrix");
        matrix(A);
        System.out.println("===");

        System.out.println("The Transpose");
        transpose(A, B);
        System.out.println("===");

    }
}
