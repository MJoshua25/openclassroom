package com.devmax;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Definissons notre scanner
        Scanner sc = new Scanner(System.in);

        
    }
    public static double arrondi(double A, int B) {
        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }
}
