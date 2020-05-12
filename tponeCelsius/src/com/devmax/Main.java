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

                if(mode!='1' && mode!='2')
                    System.out.println("Mode inconnu, veuillez faire un choix valide");
            } while (mode!='1' && mode!='2');

//            Saisie de la température à convertir
            System.out.println("Température à convertir :");
            aConvertir = sc.nextDouble();
//            Vider la ligne lue
            sc.nextLine();

//            Convertion
            if (mode =='1'){
                convertit = ((9.0/5.0) * aConvertir) + 32.0;
                System.out.print(aConvertir + "°C correspond à : ");
                System.out.println(arrondi(convertit, 2) + " °F.");
            }
            else{
                convertit = ((aConvertir - 32) *5 )/9;
                System.out.print(aConvertir + "°F correspond à :");
                System.out.println(arrondi(convertit, 2) + " °C.");
            }
//            Nouvelle convertion
            do {
                System.out.println("Souhaitez-vous convertir une autre température ? (O/N)");
                reponse = sc.nextLine().charAt(0);
            } while (reponse != 'O' && reponse != 'N');
        } while (reponse=='O');

        System.out.println("Au revoir !");

        //Fin de programme
    }
    public static double arrondi(double A, int B) {
        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }
}
