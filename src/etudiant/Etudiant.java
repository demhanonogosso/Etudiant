package controle.continu;

import java.util.LinkedList;

public class Etudiant {
    String matricule, nom, prenom, etablissement;
    char sexe;
    LinkedList presence;
    
  Etudiant(){
      matricule= null;
      nom=null;
      prenom=null;
      etablissement=null;
      sexe=' ';
  }
  
  Etudiant(String matricule, String nom, String prenom, String etablissement, char sexe){
      this.matricule= matricule;
      this.nom=nom;
      this.prenom=prenom;
      this.etablissement=etablissement;
      this.sexe=sexe;
      this.presence = new LinkedList();
      
              
        Mois janvier= new Mois("janvier", 00);
        Mois fevrier= new Mois("fevrier", 00);
        Mois mars= new Mois("mars", 00);
        Mois avril= new Mois("avril", 00);
        Mois mai= new Mois("mai", 00);
        Mois juin= new Mois("juin", 00);
        Mois juillet= new Mois("juillet", 00);
        Mois aout= new Mois("aout", 00);
        Mois septembre= new Mois("septembre", 00);
        Mois octobre= new Mois("octobre", 00);
        Mois novembre= new Mois("novembre", 00);
        Mois decembre= new Mois("decembre", 00);

        
     this.presence.add(janvier);
     this.presence.add(fevrier);
     this.presence.add(mars);
     this.presence.add(avril);
     this.presence.add(mai);
     this.presence.add(juin);
     this.presence.add(juillet);
     this.presence.add(aout);
     this.presence.add(septembre);
     this.presence.add(octobre);
     this.presence.add(novembre);
     this.presence.add(decembre);


  }
 public String getmatricule() {  
         return this.matricule;
   }
 public char getsexe() {  
         return this.sexe;
 }
 public String getetablissement() {  
         return this.etablissement;
 }
 public LinkedList getpresence() {  
         return this.presence;
   }
}
