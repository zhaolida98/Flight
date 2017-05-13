package basic;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PassagerManger pm = new PassagerManger();
		AdminManger am = new AdminManger();
		System.out.println("Choose the function you want(0~3):");
		int a = input.nextInt();
		switch(a){  
		case 0 :
			System.out.println("Enter the passager's name:");
			String na1 = input.nextLine();
			System.out.println("Enter the passager's passcode:");
			String pa1 = input.nextLine();
			Passager pas1 = new Passager(na1,pa1);
			pm.passagerenter(pas1);
		case 1 :
			System.out.println("Enter the admin's name:");
			String am1 = input.nextLine();
			System.out.println("Enter the admin's password:");
			String ap1 = input.nextLine();
			Admin ad1 = new Admin(am1,ap1);
			am.adminenter(ad1);
		case 2 :
			System.out.println("Enter the user's name:");
			String na2 = input.nextLine();
			System.out.println("Enter the passcode:");
			String pa2 = input.nextLine();
			Passager pas2 = new Passager(na2,pa2);
			pm.passagerrej(pas2);
		case 3 :
			basic.search;
		default :
		    System.out.println("Please Enter The right number!");}}}
		
		


