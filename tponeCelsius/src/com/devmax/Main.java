package com.devmax;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Definissons notre scanner
        Scanner sc = new Scanner(System.in);

//        Initialisation des variables
        double aConvertir, convertit = 0;
        char reponse = ' ', mode = ' ';

        System.out.println("Début du convertisseur");
        do { // Tant que reponse = O
            do { // Tant que la réponse n'est pas 1 ou 2
                mode = ' ';
                System.out.println("Choisissez le mode de conversion : ");
                System.out.println("1 - Convertisseur Celsius - Fahrenheit");
                System.out.println("2 - Convertisseur Fahrenheit - Celsius ");
                mode = sc.nextLine().charAt(0);
            } while (mode!='1' && mode!='2');
        } while (reponse=='o');

    }
    public static double arrondi(double A, int B) {
        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }
}
