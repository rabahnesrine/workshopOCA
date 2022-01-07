package model;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		
		 Etudiant e1 = new Etudiant();
		/*	System.out.println("tapez un nom :");

	     	 e1.nom=s.nextLine();
			System.out.println("tapez un age :");
			 e1.age=s.nextInt();

			System.out.println("tapez moyenne :");
			 e1.moyenne=s.nextDouble();

			System.out.println("tapez adresse :");
            e1.adresse=s.next();
*/

				 
				 
				 
				 
				 
		 Etudiant e2= new Etudiant("nesrine",25,17,"Metouia Gabes");
e1.setNom("nourarabeh");
e1.setAge(50);
e1.setMoyenne(18);

e1.info();

e2.info();
	}

	
}
