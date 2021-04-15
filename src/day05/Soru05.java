package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Soru05 {
	public static void main(String[] args) {
		/* verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
		  * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */
		int arr[]={5,2,9,7,8,2,3,4};
		
		Arrays.sort(arr);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi girin");
		int sayi = scan.nextInt();
		
		for (int i = 0; i < sayi; i++) {
			System.out.print((arr[arr.length-1-i])+" ");
		}
	scan.close();}

}
