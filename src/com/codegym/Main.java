package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height;
        System.out.printf("\n\n nhap vao chieu cao cua tam giac: ");
        height = sc.nextInt();
        for (int i = 1; i <= height; i ++) {
            for ( int j = 1; j <= i; j ++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-----------------------");
        int m,n;
        m = sc.nextInt();
        n= sc.nextInt();
        for (int i = 0; i < m; i ++){
            for (int j = 0; j < n; j ++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("------------------------");

    }
}
