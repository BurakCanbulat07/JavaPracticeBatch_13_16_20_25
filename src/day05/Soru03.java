package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru03 {
	public static void main(String[] args) {
		/* Kullanicidan int  list uzunlugunu isteyin
		 * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
		 * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
		 *n= 5 icin
		 *input{1,2,2,3,4}
		 *output{2}
		 *
		 */
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Liste uzunlugu girin");
		int uzunluk = scan.nextInt();
		
		List<Integer> list=new ArrayList<>();
		
		System.out.println("Uzunluk kadar eleman girin");
		
		for(int i=0; i< uzunluk;i++) {
			list.add(scan.nextInt());
		}
		
		ciftGirilen(list);
	scan.close();}

	private static void ciftGirilen(List<Integer> list) {
		List<Integer> ciftler = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			for (int j = i+1; j < list.size(); j++) {
				if (list.get(i)==list.get(j)&&!ciftler.contains(list.get(i))) {
						ciftler.add(list.get(i));
				}
			}
			
		}
		System.out.println(ciftler);
	}

}
