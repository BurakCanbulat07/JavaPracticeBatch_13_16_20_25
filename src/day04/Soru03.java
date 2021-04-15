package day04;

import java.util.Scanner;

public class Soru03 {

	/*
	 * Girilen sayinin  Amstrong sayi olup olmadigini yazdiran java programi yaziniz
	    Ornek, 153 bir Armstrong sayidir. cunku 153= 1 + 125 + 27, which is equal to 1^3+5^3+3^3.
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		armstrong(sayi);
		//ILK SORU||||

		
		System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		for(int i=1; i<=1000;i++) {
			if(armstrong(i)==true) {
				System.out.println(i);
			}
		}
		
	scan.close();}	
	
	
	public static boolean armstrong(int sayi) {
		boolean sonuc=false;
		int sayicik=sayi;
		
		int kontrol=0;
	while(sayi>9) {
			kontrol+=((sayi%10)*(sayi%10)*(sayi%10));
			sayi/=10;
	}
	
	kontrol+=(sayi*sayi*sayi);
	
	if (kontrol==sayicik) {
		sonuc=true;
	}else {
		sonuc=false;
	}
	
	return sonuc;

	}
}
