package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Soru04 {
	public static void main(String[] args) {
		/*Rastgele kullanici adi olusturan JAVA kodu yaziniz.
		 *  1. Kullanicidan ismini isteyelim +
		 *  2. Kullanici adindaki bosluklari silelim. +
		 *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
		 *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
		 *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Isminizi girin");
		String isim = scan.nextLine().trim();
		
		
			List<String> veriTabanindakiIsimler = new ArrayList<>();
			veriTabanindakiIsimler.add("Ayse");
			veriTabanindakiIsimler.add("Ahmet");
			veriTabanindakiIsimler.add("Hasan");
			veriTabanindakiIsimler.add("Ali");
			veriTabanindakiIsimler.add("Mehmet");
			veriTabanindakiIsimler.add("Derya");
			
			if (veriTabanindakiIsimler.contains(isim)) {
				System.out.println("Bu isim daha onceden alinmis.");
				int rastgeleSayi= new Random().nextInt(100000);
				String newIsim=isim+rastgeleSayi;
				System.out.println("Isim onerisi: "+newIsim);
			}else {
				System.out.println("Isminiz basariyla eklendi");
			}
			
	scan.close();}

}
