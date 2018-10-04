import java.util.Scanner;
public class Project1{
	public static void main(String[] args){
		System.out.println("======================================================================");
		System.out.println("SELAMAT DATANG DI MINI PROJECT PENCARI LUAS DAN KELILING BANGUN DATAR");
		System.out.println("29-9-2019                                                  AnandaDwiP©");
		System.out.println("======================================================================");
		System.out.println("");
		System.out.println("");
		menu();
		}
	public static void luaspersegi(){
	Scanner xy = new Scanner(System.in);
	
	int luas,sisi;
    char jawab;
	
	System.out.println("=========================");
	System.out.println("ANDA MENCARI LUAS PERSEGI");
	System.out.println("29-9-2018     AnandaDwiP©");
	System.out.println("=========================");
	System.out.println("");
	System.out.print("Masukkan sisi: ");
	sisi = xy.nextInt();
	luas = sisi*sisi;
	System.out.println("Luas Persegi adalah: " + luas);
	System.out.println("");
	perulangan();

}
    public static void luaspersegiPanjang(){
	Scanner xy = new Scanner(System.in);
	int panjang, lebar, luas;
	char jawab;
	
	System.out.println("=================================");
	System.out.println("ANDA MENCARI LUAS PERSEGI PANJANG");
	System.out.println("29-9-2018             AnandaDwiP©");
	System.out.println("=================================");
	System.out.println("");
	System.out.print("Masukkan panjang: ");
	panjang = xy.nextInt();
	System.out.print("Masukkan lebar: ");
	lebar = xy.nextInt();
	luas = panjang*lebar;
	System.out.println("Luas Persegi Panjang adalah: " + luas);
	System.out.println("");
	perulangan();
	
	}
	public static void luassegitiga(){
		Scanner xy = new Scanner(System.in);
		float alas, tinggi, luasS;
		char jawab;
		
		System.out.println("==========================");
		System.out.println("ANDA MENCARI LUAS SEGITIGA");
		System.out.println("29-9-2018      AnandaDwiP©");
		System.out.println("==========================");
		System.out.println("");
		System.out.print("Masukkan alas: ");
		alas = xy.nextFloat();
		System.out.print("Masukkan tinggi: ");
		tinggi = xy.nextFloat();
		luasS = 0.5f *alas * tinggi;
		System.out.println("Luas Segitiga adalah: " + luasS);
		perulangan();
		
	}
	public static void luasbelahKetupat(){
		Scanner xy = new Scanner(System.in);
		float luasB, diagonal1, diagonal2;
		char jawab;
		
		System.out.println("===============================");
		System.out.println("ANDA MENCARI LUAS BELAH KETUPAT");
		System.out.println("29-9-2018           AnandaDwiP©");
		System.out.println("===============================");
		System.out.println("");
		System.out.print("Masukkan diagonal 1: ");
		diagonal1 = xy.nextFloat();
		System.out.print("Masukkan diagonal 2: ");
		diagonal2 = xy.nextFloat();
		luasB = 0.5f *diagonal1 * diagonal2;
		System.out.println("Luas Segitiga adalah: " + luasB);
		perulangan();
		
	}
	public static void menu(){
		Scanner xy = new Scanner(System.in);
		 
		int angka, angka1;
		char jawab;
		
		System.out.println("--------------------------------------------");
		System.out.println("|MAU MENCARI APA ?                          |");
		System.out.println("|>masukkan keyword 1 untuk mencari LUAS     |");
		System.out.println("|>masukkan keyword 2 untuk mencari KELILING |");
		System.out.println("-------------------------------------------");
		System.out.println("");
		System.out.print("Masukkan keyword: ");
		angka1 = xy.nextInt();
		
		if(angka1>=3 || angka1<=0) {
			System.out.println("MAAF KEYWORD YANG ANDA MASUKKAN SALAH");
			System.out.println("");
			perulangan();
		}else if(angka1 == 1){
			menu1();
		}else if(angka1 == 2) {
			menu2();
		}
	}
	public static void perulangan() {
		Scanner xy = new Scanner(System.in);
		char jawab;
		
		System.out.print("Ingin melakukan perhitungan lagi [y/t]: ");
		jawab = xy.next().charAt(0);

		switch(jawab){
			case 'y' : 
				menu();
				break;

			case 't' :
				System.out.println("");
				System.out.println("TERIMAKASIH TELAH MENGGUNAKAN MINI PROJECT INI");
				break;
			default : 
				System.out.println("MAAF KEYWORD YANG ANDA MASUKKAN SALAH");
				System.out.println("");
				perulangan();
			}
	}
	public static void kelilingpersegi() {

		Scanner xy = new Scanner(System.in);
		
		int keliling,sisi;
		
		System.out.println("=============================");
		System.out.println("ANDA MENCARI KELILING PERSEGI");
		System.out.println("29-9-2018         AnandaDwiP©");
		System.out.println("=============================");
		System.out.println("");
		System.out.print("Masukkan sisi: ");
		sisi = xy.nextInt();
		keliling = (sisi+sisi)*2;
		System.out.println("Luas Persegi adalah: " + keliling);
		System.out.println("");
		perulangan();

	}
	public static void kelilingPersegiPanjang() {
		Scanner xy = new Scanner(System.in);
		int panjang, lebar, keliling;
		
		System.out.println("=====================================");
		System.out.println("ANDA MENCARI KELILING PERSEGI PANJANG");
		System.out.println("29-9-2018                 AnandaDwiP©");
		System.out.println("=====================================");
		System.out.println("");
		System.out.print("Masukkan panjang: ");
		panjang = xy.nextInt();
		System.out.print("Masukkan lebar: ");
		lebar = xy.nextInt();
		keliling = 2*(panjang+lebar);
		System.out.println("Luas Persegi Panjang adalah: " + keliling);
		System.out.println("");
		perulangan();
		
	}
	public static void kelilingsegitiga() {
		Scanner xy = new Scanner(System.in);
		float sisi1, sisi2, sisi3, keliling;
		
		System.out.println("==============================");
		System.out.println("ANDA MENCARI KELILING SEGITIGA");
		System.out.println("29-9-2018          AnandaDwiP©");
		System.out.println("==============================");
		System.out.println("");
		System.out.print("Masukkan sisi a: ");
		sisi1 = xy.nextFloat();
		System.out.print("Masukkan sisi b: ");
		sisi2 = xy.nextFloat();
		System.out.print("Masukkan sisi c: ");
		sisi3 = xy.nextFloat();
		keliling = sisi1 + sisi2 + sisi3;
		System.out.println("Luas Segitiga adalah: " + keliling);
		perulangan();
	}
	public static void KelilingBelahKetupat() { 
		Scanner xy = new Scanner(System.in);
		int sisi, keliling;
		
		System.out.println("===================================");
		System.out.println("ANDA MENCARI KELILING BELAH KETUPAT");
		System.out.println("29-9-2018               AnandaDwiP©");
		System.out.println("===================================");
		System.out.println("");
		System.out.print("Masukkan sisi: ");
		sisi = xy.nextInt();
		keliling = 4*sisi;
		System.out.println("Luas Segitiga adalah: " + keliling);
		perulangan();
	}
	public static void menu1() { 
		Scanner xy = new Scanner(System.in);
		int angka;
		
		System.out.println("-------------------------------------------");
		System.out.println("|PILIH BANGUN DATAR ?                      |");
		System.out.println("|>masukkan keyword 1 untuk PERSEGI         |");
		System.out.println("|>masukkan keyword 2 untuk PERSEGI PANJANG |");
		System.out.println("|>masukkan keyword 3 untuk SEGITIGA        |");
		System.out.println("|>masukkan keyword 4 untuk BELAH KETUPAT   |");
		System.out.println("-------------------------------------------");
		System.out.println("");
		System.out.print("Masukkan keyword: ");
		angka = xy.nextInt();
		
		if(angka == 1) {
			luaspersegi();
		}else if(angka == 2) {
			luaspersegiPanjang();
		}else if(angka == 3) {
			luassegitiga();
		}else if( angka == 4) {
			luasbelahKetupat();
		}else {
			System.out.println("MAAF KEYWORD YANG ANDA MASUKKAN SALAH");
			System.out.println("");
			perulangan();
		}
	}
	public static void menu2() {
		Scanner xy = new Scanner(System.in);
		int angka;
		
		System.out.println("-------------------------------------------");
		System.out.println("|PILIH BANGUN DATAR ?                      |");
		System.out.println("|>masukkan keyword 1 untuk PERSEGI         |");
		System.out.println("|>masukkan keyword 2 untuk PERSEGI PANJANG |");
		System.out.println("|>masukkan keyword 3 untuk SEGITIGA        |");
		System.out.println("|>masukkan keyword 4 untuk BELAH KETUPAT   |");
		System.out.println("-------------------------------------------");
		System.out.println("");
		System.out.print("Masukkan keyword: ");
		angka = xy.nextInt();
		
		if(angka == 1) {
			kelilingpersegi();
		}else if(angka == 2) {
			kelilingPersegiPanjang();
		}else if(angka == 3) {
			kelilingsegitiga();
		}else if( angka == 4) {
			KelilingBelahKetupat();
		}
		
	}
}
