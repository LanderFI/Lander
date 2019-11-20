package menuakGit;

import java.util.Scanner;

public class menuak {

	public static void main(String[] args) {
		int aukera, zenb1, zenb2;
		
		
		
		
		System.out.println("Sartu zenbaki bat");
		Scanner scan = new Scanner(System.in);
		zenb1 = Integer.parseInt(scan.nextLine());
		System.out.println("Sartu zenbaki bat");
		Scanner scan1 = new Scanner(System.in);
		zenb2 = Integer.parseInt(scan1.nextLine());
	
		
		
		
		
		
		
		
		
		System.out.println("Aukeratu aukera bat \n0- Batura\n1- Kenketa\n2- Biderketa\n3- Zatiketa\n4- Lehengo zenbakiaren faktoriala");
		
		aukera  = Integer.parseInt(scan.nextLine());
		
		switch(aukera){
		case 0:
			batura(zenb1, zenb2);
			break;
		case 1:
			kenketa(zenb1, zenb2);
			break;
		case 2:
			biderketa(zenb1, zenb2);
			break;
		case 3:
			zatiketa(zenb1, zenb2);
			break;
		case 4:
			faktoriala(zenb1);
			break;
		default:
			System.out.println("Txarto aukeratu duzu");
			break;
		}
		

	}

	private static void faktoriala(int zenb1) {
		int faktoriala = zenb1;
		for(int i = 1; i < zenb1; i++){
			faktoriala = faktoriala*i;
		}
		System.out.println("Faktoriala: " + faktoriala);
	}

	private static void zatiketa(int zenb1, int zenb2) {
		int zatiketa;
		zatiketa = zenb1 / zenb2;
		System.out.println("Zatiketa: " + zatiketa);
		
	}

	private static void biderketa(int zenb1, int zenb2) {
		int biderketa;
		biderketa = zenb1 * zenb2;
		System.out.println("Biderketa: " + biderketa);
		
	}

	private static void kenketa(int zenb1, int zenb2) {
		int kenketa;
		kenketa = zenb1 - zenb2;
		System.out.println("Kenketa: " + kenketa);
		
	}

	private static void batura(int zenb1, int zenb2) {
		int batura;
		batura=zenb1+ zenb2;
		System.out.println("Batura: " + batura);
		
	}

}
