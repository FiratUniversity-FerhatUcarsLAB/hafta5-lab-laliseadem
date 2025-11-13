/*
 * Ad Soyad: [Lalise Adem wado]
 * Ogrenci No: [240541610]
 * Tarih: [11/13/2025]
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kare hesaplaması
        System.out.print("Karenin kenar uzunluğunu giriniz(cm): ");
        double uzunluk = scan.nextDouble();
        System.out.printf("Karenin Alanı: %.2fcm^2\n" , calculateSquareArea(uzunluk));
        System.out.printf("Karenin Çevresi: %.2fcm\n" , calculateSquarePerimeter(uzunluk));

        // Dikdörtgen hesaplaması
        System.out.print("Dikdörtgenin uzun kenarını giriniz(cm): ");
        double uzunKenar = scan.nextDouble();
        System.out.print("Dikdörtgenin kısa kenarını giriniz(cm): ");
        double kisaKenar = scan.nextDouble();
        System.out.printf("Dikdörtgenin Alanı: %.2fcm^2\n" , calculateRectangleArea(uzunKenar, kisaKenar));
        System.out.printf("Dikdörtgenin Çevresi: %.2fcm\n" , calculateRectanglePerimeter(uzunKenar, kisaKenar));

        //daire
        System.out.print("yarcapi giriniz(cm): ");
        double radius = scan.nextDouble();
        System.out.printf("Dairenin Alanı: %.2fcm^2\n" , calculateCircleArea(radius));
        System.out.printf("Dairenin Çevresi: %.2fcm\n" , calculateCircleCircumference(radius));

        //ucgen
        System.out.print("ucgenin tabni giriniz(cm): ");
        double taban = scan.nextDouble();
        System.out.print("ucgenun yuksekligini giriniz(cm): ");
        double yukseklik = scan.nextDouble();
        System.out.print("Ucgenin hipotnusunu giriniz(cm): ");
        double hipotnus = scan.nextDouble();
        System.out.printf("ucgenin Alani: %.2fcm^2\n" , calculateTriangleArea(taban,yukseklik));
        System.out.printf("ucgenin Cevresi: %.2fcm\n" , calculateTrianglePerimeter(taban,yukseklik,hipotnus));
        scan.close();
    }
    public static double calculateSquareArea(double uzunluk) {
        return Math.pow(uzunluk, 2);
    }
    public static double calculateSquarePerimeter(double uzunluk) {
        return 4 * uzunluk;
    }
    public static double calculateRectangleArea(double kisaKenar, double uzunKenar){
        return kisaKenar * uzunKenar;
    }
    public static double calculateRectanglePerimeter(double kisaKenar, double uzunKener){
        return 2 * (kisaKenar + uzunKener);
    }
    public static double calculateCircleArea(double yaricap){
        return Math.PI * Math.pow(yaricap,2);
    }
    public static double calculateCircleCircumference(double yaricap) {
        return 2 * Math.PI * yaricap;
    }
    public static double calculateTriangleArea(double taban, double yukseklik){
        return (taban + yukseklik)/2;
    }
    public static double calculateTrianglePerimeter(double taban , double yukseklik , double hipotnus ){
        return taban + yukseklik + hipotnus;
    }
}
