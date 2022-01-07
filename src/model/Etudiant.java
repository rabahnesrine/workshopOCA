package model;

public class Etudiant {
String nom ;
int age ;
double moyenne;
 String adresse;
 
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
 public void setNom(String nom) {this.nom= nom;}

 public int getAge() {return this.age;}
 public void setAge(int age) {this.age= age;}

 public double getMoyenne() {return this.moyenne;}
 public void setMoyenne(double moy) {this.moyenne= moy;}

 public String getAdresse() {return this.adresse;}
 public void setAdresse(String adr) {this.adresse= adr;}


 
 
}
