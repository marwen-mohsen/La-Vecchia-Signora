/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma_project.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import tunipharma_project.entities.Client;
import tunipharma_project.entities.Pharmacie;
import tunipharma_project.util.MyConnection;

/**
 *
 * @author yassine
 */
public class ClientDAO implements DAO<Client> {

    @Override
    public void Create(Client a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Update(Client a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Client findById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Client> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(int a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public Client findByPseudo(String pseudo)
    { 
        
        Client client=new Client();   
        String requete="select * from client where Pseudo =?";
                try{
       PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
       ps .setString(1, pseudo);
      ResultSet resultat=ps.executeQuery();
      while (resultat.next())
      {
          client.setId_client(resultat.getInt(1));
          client.setPrenom(resultat.getString(2));
          client.setCIN(resultat.getInt(3));
          client.setMail(resultat.getString(4));
          client.setTel(resultat.getInt(5));
          client.setAdress(resultat.getString(7));
          client.setPseudo(resultat.getString(8));
          client.setPasswd(resultat.getInt(9));
          
      }
          return client;
      }
      catch(SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du pseudo "+ex.getMessage());
            return null;
        }
          
      }
            
    
}
