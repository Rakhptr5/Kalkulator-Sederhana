/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekfungsi;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Projekfungsi {
static Scanner totalAritmatika = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Masukkan Bilangan yang akan ditambah: ");
        tambah();
        System.out.println("Masukkan Bilangan yang akan dikurang: ");
        kurang();
        System.out.println("Masukkan Bilangan yang akan dikali: ");
        kali();
        System.out.println("Masukkan Bilangan yang akan dibagi: ");
        bagi();
    }

    public static int tambah() {
        int bilangan1, bilangan2;

        bilangan1 = totalAritmatika.nextInt();

        bilangan2 = totalAritmatika.nextInt();
        int hasil = bilangan1 + bilangan2;

        System.out.println("hasilnya adalah " + hasil);
        return hasil;
    }

    public static int kurang() {
        int bilangan1, bilangan2;

        bilangan1 = totalAritmatika.nextInt();

        bilangan2 = totalAritmatika.nextInt();
        int hasil = bilangan1 - bilangan2;

        System.out.println("hasilnya adalah " + hasil);
        return hasil;
    }

    public static int kali() {
        int bilangan1, bilangan2;

        bilangan1 = totalAritmatika.nextInt();

        bilangan2 = totalAritmatika.nextInt();
        int hasil = bilangan1 * bilangan2;

        System.out.println("hasilnya adalah " + hasil);
        return hasil;
    }

    public static int bagi() {
        int bilangan1, bilangan2;

        bilangan1 = totalAritmatika.nextInt();

        bilangan2 = totalAritmatika.nextInt();
        int hasil = bilangan1 / bilangan2;

        System.out.println("hasilnya adalah " + hasil);
        return hasil;
    }
}
