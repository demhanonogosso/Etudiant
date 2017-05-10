/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tchafros
 */

import java.sql.* ;
//import java.io.* ;
//import com.mysql.jdbc.driver.* ;
//import com.mysql.jdbc.driver.* ;

public class Database {
    
public  static  void main (String[] args) {    

try {
Class.forName("com.mysql.jdbc.Driver").newInstance();
//Driver pilote = (Driver)c.newInstance() ;
//DriverManager.registerDriver(pilote);
} catch (Exception e) {
      System.out.println(e.getMessage());
}


String url = "jdbc:mysql://localhost:3306/etude";
String user= "root";
String pwd="";
 try {
Connection con = DriverManager.getConnection(url,user,pwd);
String requete = "INSERT INTO etudiant values ('5', '03Q16','nom.getText()','N')";
String requete1 = "SELECT * from etudiant";
Statement stmt = con.createStatement();
int i=stmt.executeUpdate(requete);
ResultSet rs=stmt.executeQuery(requete1);
System.out.println(i);

while (rs.next()) {
int Id = rs.getInt("Id");
String matricule = rs.getString("Matricule");
String nom = rs.getString("Nom");
String sexe = rs.getString("Sexe");
System.out.println(Id+""+matricule + " " + nom +""+sexe);
}
} catch (SQLException e) {
     String message = e.getMessage();
     System.out.println(message);
}

 
 
}
}
