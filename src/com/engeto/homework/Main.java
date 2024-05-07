package com.engeto.homework;

import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDate;

public class Main {

    public static void ukol1() {
        System.out.println("Hello world!");
    }
    public static void ukol2() {
        String user = "Karel";
        System.out.println(user);
    }

    public static void ukol3() {
        int lessonNumber = 10;
        System.out.println(lessonNumber);
    }

    public static void ukol4() {
        double price = 10.0;
        System.out.println(price);
    }

    public static void ukol5() {
        BigDecimal priceBig = BigDecimal.ZERO; // Nastavíme do proměnné hodnotu 0
        // Desetkrát přičteme hodnotu jedna desetina (0,1):
        for (int i = 0; i < 10; i++) {
            priceBig = priceBig.add(BigDecimal.valueOf(0.1));
               // operátor "+=" znamená: přičti ke stávající
               // hodnotě navíc 0.1
        }
        System.out.println(priceBig);
        // Má vypsat "1.0". Ale vypíše "0.9999" !!!
    }

    public static void ukol6() {
        BigDecimal priceBig = BigDecimal.ZERO;
        priceBig = priceBig.add(BigDecimal.valueOf(0.1));
        System.out.println(priceBig);
    }

    public static void ukol7() {
        int enginePower = 120;
        System.out.println("Výkon motoru je: "+enginePower+" kW.");
    }

    public static void ukol8() {
        int shirtSize = 37;
        System.out.println("Velikost košile je: "+ shirtSize+ ".");
    }

    public static void ukol9() {
        System.out.println("Metoda *skoro* bez chybičky!");
    }

    public static class Biomrkev {
        String firstNameLastName = "Emil Skočdopole", cityOfResidence = "Senohrábky", plateNumber = "8SA 5826", ipAddress = "192.168.1.1";
        double numberOfContracts = 5, salesInTons = 138, consumptionOfGasoline = 5.7;
        LocalDate dateOfBirth = LocalDate.of(1999,2,1);
        InetAddress ipAddressTest; // pouze zkouška Inet

        {
            try {
                ipAddressTest = InetAddress.getByName("192.168.1.1");
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            }
        }


        double salesPerContractAVG = salesInTons / numberOfContracts;
    }

    public static void main(String[] args) {
        Biomrkev Biomrkev = new Biomrkev();
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou "
                +"zkratkou <Ctrl>+</> - použij lomítko "
                +"na numerické klávesnici.");
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();

        System.out.println("Průměrné prodané množství biomrkve na kontrakt je: "+Biomrkev.salesPerContractAVG+ " tun.");






    }
}