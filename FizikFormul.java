/*
 * Ad Soyad: [Lalise Adem Wado]
 * Ogrenci No: [240541610]
 * Tarih: [11/13/2025]
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;
public class FizikFormul {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        //Hiz hesplama.
        System.out.print("Yerdegistirme giriniz(m): ");
        double yerdegistirme = input.nextDouble();
        System.out.print("Zaman giriniz(s): ");
        double zaman = input.nextDouble();
        System.out.printf("Hiz: %.2fm/s\n", calculateVelocity(yerdegistirme,zaman));
        //Ivme Hesaplama.
        System.out.print("Ilk hizini giriniz(m/s): ");
        double ilkHiz = input.nextDouble();
        System.out.print("Son hizini giriniz(m/s): ");
        double sonHiz = input.nextDouble();
        System.out.printf("Ivme: %.2fm/s^2\n" ,calculateAcceleration(ilkHiz,sonHiz,zaman));
        //Kuvvet Hesaplama
        double ivme = calculateAcceleration(ilkHiz, sonHiz, zaman);
        System.out.print("kutle giriniz(kg): ");
        double kutle = input.nextDouble();
        System.out.printf("Kuvvet: %.2fN\n" , calculateForce(kutle , ivme));
        //Is Hesaplama.
        double kuvvet = calculateForce(kutle , ivme);
        System.out.print("Mesafe girninz(m): ");
        double yer_degistirme = input.nextDouble();
        System.out.printf("Is: %.2fJ\n" ,calculateWork(kuvvet,yer_degistirme));
        //Guc hesaplama
        double is = calculateWork(kuvvet, yer_degistirme);
        System.out.print("Zaman giriniz(s): ");
        double zaman2 = input.nextDouble();
        System.out.printf("Guc %.2fJ\n" , calculatePower(is,zaman2));
        //Kinetik Enerji hesaplama.
        System.out.print("kutle giriniz(kg): ");
        double kutle2 = input.nextDouble();
        System.out.print("surat giriniz(m/s): ");
        double surat= input.nextDouble();
        System.out.printf("Kinetik Enerji: %.2fJ\n" , calculateKineticEnergy(kutle2,surat));
        //Potansiyel Enerji hesaplama
        final double GRAVITY = 9.8;
        System.out.print("Yuksekligi giriniz(m): ");
        double yukseklik = input.nextDouble();
        System.out.printf("Potansiyel Enerji: %.2fJ\n", calculatePotentialEnergy(kutle2,GRAVITY,yukseklik));
        input.close();33

    }
    public static double calculateVelocity(double yerdegistirme , double zaman){
        return yerdegistirme/zaman;
    }
    public static double calculateAcceleration(double ilkHiz, double sonHiz, double zaman){
        return (sonHiz - ilkHiz)/zaman;
    }
    public static double calculateForce(double kutle , double ivme){
        return kutle * ivme;
    }
    public static double calculateWork(double kuvvet, double yer_degistirme){
        return kuvvet * yer_degistirme;
    }
    public static double calculatePower(double is , double zaman2){
        return is/zaman2;
    }
    public static double calculateKineticEnergy(double kutle2 , double surat){
        return 0.5 * kutle2 * Math.pow(surat,2);
    }
    public static double calculatePotentialEnergy(double kutle2 , double GRAVITY,double yukseklik){
        return kutle2 * GRAVITY * yukseklik;
    }

}
