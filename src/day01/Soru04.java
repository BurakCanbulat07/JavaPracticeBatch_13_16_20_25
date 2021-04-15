package day01;

import java.util.Scanner;

public class Soru04 {
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Gunde kac saat uyursunuz aceba");
		 double uyku=scan.nextDouble();
		 
		 double ay=(uyku*30)/24;
		 System.out.println("1 ayda uyudugunuz toplam gun sayisi: "+ay);
		 
		 double yil=(uyku*365)/24;
		 System.out.println("1 yilda uyudugunuz toplam gun sayisi: "+yil);
		 
		 double kirkYil = yil*40;
		 System.out.println("40 yilda uyudugunuz toplam gun sayisi: "+kirkYil);
		 
		 scan.close();
	}

}
