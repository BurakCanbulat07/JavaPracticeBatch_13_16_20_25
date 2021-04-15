package day05;

import java.util.Scanner;

public class Soru01 {
	public static void main(String[] args) {
		/* Kullanicidan int array uzunlugunu isteyin
		 * Arrayin uzunlugu kadar kullanicidan array elemanlarini girmesini isteyin
		 * Array elemanlarini toplamini return eden metod yazin
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Olusturmak istediginiz array in uzunlugunu girin");
		int sayi = scan.nextInt();
		
		int arr[] = new int[sayi];
		
		System.out.println("Uzunluk kadar eleman girin");
		
		for(int i=0; i< sayi;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Array in elemanlari toplami: "+toplam(arr));
		
	scan.close();}

	public static int toplam(int array[]) {

		int toplam=0;
		for (int i : array) {
			toplam+=i;
		}
		return toplam;
	}

}
