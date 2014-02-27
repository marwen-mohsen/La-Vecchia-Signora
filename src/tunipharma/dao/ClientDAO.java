/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tunipharma.entites.Client;
import tunipharma.util.Connexion;

/**
 *
 * @author VAIO
 */
public class ClientDAO {
   
     public List<Client> DisplayAllClient(){


        List<Client> listeclient = new ArrayList<Client>();

        String requete = "select * from client";
        try {
           Statement statement = Connexion.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Client client =new Client();
                  client.setId_client(resultat.getInt(1));
                client.setNom_client(resultat.getString(2));
                client.setPrenom_client(resultat.getString(3));
                client.setCin_client(resultat.getInt(4));
                client.setAdresse_client(resultat.getString(5));
                client.setMail_client(resultat.getString(6));
                client.setTelephonne_client(resultat.getInt(7));
                client.setPseudo_client(resultat.getString(8));
                client.setPwd_client(resultat.getString(9));

                listeclient.add(client);
            }
            return listeclient;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des clients "+ex.getMessage());
            return null;
        }
    }
    
     
     public Client findClientByPseudo(String pseudo){
    Client client = new Client();
     String requete = "select * from client where Pseudo=?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setString(1, pseudo);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                client.setId_client(resultat.getInt(1));
                client.setNom_client(resultat.getString(2));
                client.setPrenom_client(resultat.getString(3));
                client.setCin_client(resultat.getInt(4));
                client.setAdresse_client(resultat.getString(5));
                client.setMail_client(resultat.getString(6));
                client.setTelephonne_client(resultat.getInt(7));
                client.setPseudo_client(resultat.getString(8));
                client.setPwd_client(resultat.getString(9));
            }
            return client;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du Client "+ex.getMessage());
            return null;
        }
    }
     public void insertClient1(Client c ){
        
        String requete = "insert into client (Nom, Prenom, Cin,Adresse,Mail,Telephonne,Pseudo,Mot_de_passe) values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setString(1, c.getNom_client());
            ps.setString(2, c.getPrenom_client());
            ps.setInt(3, c.getCin_client());
            ps.setString(4, c.getAdresse_client());
            ps.setString(5, c.getMail_client());
            ps.setInt(6, c.getTelephonne_client());
            ps.setString(7, c.getPseudo_client());
            ps.setString(8, c.getPwd_client());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        
        }
     } 
        
       public void insertClient(Client cl){
           // ClientDAO clientdao=new ClientDAO();

         String requete = "insert into client ( Mail,Pseudo) values (?,?)";
        try { //cl=clientdao.findClientByPseudo(cl.getPseudo_client());
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
           
            ps.setString(1, cl.getMail_client());
         
            ps.setString(2, cl.getPseudo_client());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
       public void deleteClient(int id){
          String requete="delete from client where id=?";
          try{
              PreparedStatement ps= Connexion.getInstance().prepareStatement(requete);
              ps.setInt(1, id);
              ps.executeUpdate();
              System.out.println("supression terminé");
              
          }
          catch(SQLException ex){
              System.out.println("probleme de supression"+ex.getMessage());
              
          }}
}
