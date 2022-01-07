package model;

public class Etudiant {
private  String nom ;
private int age ;
private double moyenne;
private String adresse;
 
 public Etudiant() {}
 public Etudiant(String n,int a,double moy,String adr) {
	 this.nom=n;
	 this.age=a;
	 this.moyenne=moy;
	 this.adresse=adr;}
 
 public void info() {
	 System.out.println("le nom de l'etudiant : "+nom +" il a : " +age +"ans , le moyenne :" + moyenne +" son adresse est:"
 + adresse);
 }
 public String getNom() {return this.nom;}
 public void setNom(String nom) { if(nom.length()>=8 && nom.length()<=30) {this.nom= nom;}
 else  System.out.println("nom invalide"); }
 public int getAge() {
	 return this.age;}
 public void setAge(int age) {
	 if(age>18 && age<28) {
		 this.age= age;}
	 else System.out.println("age invalide");}
 
 public double getMoyenne() {return this.moyenne;}
 public void setMoyenne(double moy) { if(moy>0 && moy<20) {this.moyenne= moy;}
 else System.out.println("moy invalide"); }
 public String getAdresse() {return this.adresse;}
 public void setAdresse(String adr) {this.adresse= adr;}


 
 
}
