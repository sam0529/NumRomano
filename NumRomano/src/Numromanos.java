

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author masuel
 */
public class Numromanos {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String un = "", de = "", ce = "", mi = "";
        int u, d, c, m, num;

        System.out.print("Ingrese un numero: ");//peticion de numero
        num = sca.nextInt();//entrada de numero

        m = num / 1000;//miles
        c = (num % 1000) / 100;//centenas
        d = ((num % 1000) % 100) / 10;//decenas
        u = (((num % 1000) % 100) % 10);//unidades

        switch (m) {
            case 1:
                mi += "M";
                break;
            case 2:
                mi += "MM";
                break;
            case 3:
                mi += "MMM";
                break;
        }

        switch (c) {
            case 1:
                ce += "C";
                break;
            case 2:
                ce += "CC";
                break;
            case 3:
                ce += "CCC";
                break;
            case 4:
                ce += "CD";
                break;
            case 5:
                ce += "D";
                break;
            case 6:
                ce += "DC";
                break;
            case 7:
                ce += "DCC";
                break;
            case 8:
                ce += "DCCC";
                break;
            case 9:
                ce += "CM";
                break;
        }

        switch (d) {
            case 1:
                de += "X";
                break;
            case 2:
                de += "XX";
                break;
            case 3:
                de += "XXX";
                break;
            case 4:
                de += "XL";
                break;
            case 5:
                de += "L";
                break;
            case 6:
                de += "LX";
                break;
            case 7:
                de += "LXX";
                break;
            case 8:
                de += "LXXX";
                break;
            case 9:
                de += "XC";
                break;
        }

        switch (u) {
            case 1:
                un += "I";
                break;
            case 2:
                un += "II";
                break;
            case 3:
                un += "III";
                break;
            case 4:
                un += "IV";
                break;
            case 5:
                un += "V";
                break;
            case 6:
                un += "VI";
                break;
            case 7:
                un += "VII";
                break;
            case 8:
                un += "VIII";
                break;
            case 9:
                un += "IX";
                break;
        }

        System.out.println("Su numero " + num + " en romano es: " + mi + ce + de + un);

    }
}
