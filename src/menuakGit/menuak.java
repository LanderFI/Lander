package menuakGit;

import java.util.Scanner;

public class menuak {

	public static void main(String[] args) {
		int aukera, zenb1, zenb2;
		
		double batura, kenketa, biderketa, zatiketa;
		
		System.out.println("Sartu zenbaki bat");
		Scanner scan = new Scanner(System.in);
		zenb1 = Integer.parseInt(scan.nextLine());
		System.out.println("Sartu zenbaki bat");
		Scanner scan1 = new Scanner(System.in);
		zenb2 = Integer.parseInt(scan1.nextLine());
		
		batura = zenb1+zenb2;
		kenketa = zenb1-zenb2;
		biderketa = zenb1*zenb2;
		zatiketa = zenb1/zenb2;
		
		
		System.out.println("Aukeratu aukera bat \n0- Batura\n1- Kenketa\n2- Biderketa\n3- Zatiketa");
		
		aukera  = Integer.parseInt(scan.nextLine());
		
		switch(aukera){
		case 0:
			System.out.println("Batura: "  + batura);
			break;
		case 1:
			System.out.println("Kenketa: " + kenketa);
			break;
		case 2:
			System.out.println("Biderketa: " + biderketa);
			break;
		case 3:
			System.out.println("Zatiketa: " + zatiketa);
			break;
		default:
			System.out.println("Agur");
			break;
		}
		

	}

}
