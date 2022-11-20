import java.util.Scanner;
public class Ders {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Tersine cevirmek istediginiz sayiyi yaziniz = ");
		int sayi = scan.nextInt();
		System.out.print("Girmis oldugunuz sayinin tersine cevrilmis hali = ");
		
		while(sayi > 0) {
			System.out.print(sayi % 10);
			sayi /= 10;
		}
		
	}
	
}
