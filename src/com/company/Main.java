package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // 1.3.​ Parašykite programą, kuri paprašytų įvesti vartotojo du skaičius ir atspausdinti jų
        // skirtumą bei sumą
        // 1.4.​ Papildyti 1.3​. programą sumos ir skirtumo skaičiavimai turi būti skirtinguose metoduose.
        // 1.5.​ Papildykite 1.4.​ programą ir realizuokite overload funkcionalumą sumai ir skirtumui.
        // Vienas sumos metodas turi priimti ir grąžinti int tipo reikšmę, o kitas float. Taip pat ir su
        // skirtumu.
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite du skaicius: ");
        float sk1 = sc.nextFloat();
        float sk2 = sc.nextFloat();
        System.out.println("Suma= " + suma(sk1, sk2));
        System.out.println("Skirtumas= " + skirtumas(sk1, sk2));
    }
    private static int suma(int a, int b) {
        return a + b;
    }
    private static int skirtumas(int a, int b) {
        return a - b;
    }
    private static float suma(float a, float b) {
        return a + b;
    }
    private static float skirtumas(float a, float b) {
        return a - b;
    }
}
