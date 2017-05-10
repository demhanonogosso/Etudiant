/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle.continu;

import static java.nio.file.Files.size;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

/**
 *
 * @author user
 */
public class Test {
     //1er question et 2e question
    Vector listeEtudiant= new Vector();
    public void AjouterEtudiant(String matricule, String nom, String prenom, String etablissement, char sexe ){
        Etudiant kodeh= new Etudiant( matricule,  nom,  prenom,  etablissement,  sexe);
        this.listeEtudiant.add(kodeh);
       
    }
 //3e question
    public void supressionEtudiant(String matricule ){
       
       for( int i=0; i< listeEtudiant.size(); i++){
           //Etudiant etudiant = new Etudiant();
           Etudiant kodeh = (Etudiant)listeEtudiant.get(i);
           if (kodeh.getmatricule()==matricule){
               listeEtudiant.remove(i);
               break;
           }
       
       }
        System.out.println("etudiant non trouvé");
    }
    
    //4e et 5e question
    public int AffichageEtudiant(char sexe ){
         int Nbre=0;
        for( int i=0; i< listeEtudiant.size(); i++){
           
           //Etudiant etudiant = new Etudiant();
           Etudiant kodeh = (Etudiant)listeEtudiant.get(i);
           if (kodeh.getsexe()== sexe){
           Nbre++;
           }
       
       }
    return Nbre;
    
    }
    //6e question
     public void AffichageNomEtudiant(String etablissement, char sexe ){
       
       for( int i=0; i< listeEtudiant.size(); i++){
           //Etudiant etudiant = new Etudiant();
           Etudiant kodeh = (Etudiant)listeEtudiant.get(i);
           if (kodeh.getsexe()==sexe && kodeh.getetablissement()==etablissement){
              System.out.println(kodeh.nom+" "+kodeh.prenom+" "+kodeh.matricule+" " );
               
           }
       }
    }
//7e question
       public void AffichageHeureEtudiant(String matricule){
       
       for( int i=0; i< listeEtudiant.size(); i++){
           //Etudiant etudiant = new Etudiant();
           Etudiant kodeh = (Etudiant)listeEtudiant.get(i);
           if (kodeh.getmatricule()==matricule ){
               LinkedList presence = new LinkedList();
               presence = kodeh.getpresence();
               
              int heure = 0;
              for( int j=0; j< presence.size(); j++){
                  Mois mois = (Mois)presence.get(j);
                  heure += mois.heure;
              }
              System.out.println("Nombre d'heure: " + heure);
              break;
           }
       }
    }
    
    
    public void ajouterHeure(String matricule, int heure, String mois){
       
       for( int i=0; i< listeEtudiant.size(); i++){
           //Etudiant etudiant = new Etudiant();
           Etudiant kodeh = (Etudiant)listeEtudiant.get(i);
           if (kodeh.getmatricule()==matricule){
               LinkedList presence = kodeh.getpresence();
               for( int j=0; j< presence.size(); j++){
                  Mois mois_cible = (Mois)presence.get(j);
                  if(mois_cible.nom == mois){
                      mois_cible.Ajouter(heure);
                      break;
                  }
              }
               break;
           }
       }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Test test = new Test();
       test.AjouterEtudiant("12a456fs", "bobo1", "junior", "fs", 'm');
       test.AjouterEtudiant("12b456fs", "bobo2", "junior", "fs", 'm');
       test.AjouterEtudiant("12c456fs", "bibi", "junior", "fs", 'f');
       test.ajouterHeure("12c456fs", 8, "janvier");
       System.out.print("Nombre heure absence bibi: ");
       test.AffichageHeureEtudiant("12c456fs");
       System.out.println("Nombre etudiant masculin: " + test.AffichageEtudiant('m'));
       System.out.println("Nombre etudiant feminin: " + test.AffichageEtudiant('f'));
       test.AffichageNomEtudiant("fs", 'm');
    }
    
}
