package com.cursoTeste.Views;

import java.util.Scanner;

public class Leitor {

    private static  Scanner teclado = new Scanner(System.in);

    //Leitor de longs
    public static long leitorLongs(String msg) {
        System.out.println(msg);
        return leitorLongs();
    }
    public static long leitorLongs() {
        return teclado.nextLong();
    }


    //Leitor double
    public static double leitorDouble(String msg) {
        System.out.println(msg);
        return leitorDouble();
    }
    public static double leitorDouble() {
        return teclado.nextDouble();
    }

    //Leitor Character
    public static char leitorChar(String msg) {
        System.out.println(msg);
        return leitorChar();
    }
    public static char leitorChar() {
        return teclado.next().charAt(0);
    }

    //Leitor de Inteiros
    public static int leitorInt(String msg) {
        System.out.println(msg);
        return leitorInt();
    }
    public static int leitorInt() {
        return teclado.nextInt();
    }

    //Leitor de String
    public static String leitorString(String msg) {
        System.out.println(msg);
        return leitorString();
    }
    public static String leitorString() {
        return teclado.next();
    }
}
