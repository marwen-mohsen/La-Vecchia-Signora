/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma_project.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tunipharma_project.entities.Pharmacie;
import tunipharma_project.util.MyConnection;

/**
 *
 * @author yassine
 */
public class PharmacieDAO implements DAO<Pharmacie> {

    @Override
    public void Create(Pharmacie p) {
        //throw new UnsupportedOperationException("Not supported yet.");
         String requete = "insert into pharmacie (id_pharmacien,Nom_Pharmacie,Proprietaire,Gouvernorat,Delegation,Adresse,Telephonne,Fax,Mail,Pseudo,Password,CNAM,grade) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, p.getId());
            ps.setString(2, p.getNom());
            ps.setString(3, p.getNom_pharmacien());
            ps.setString(4, p.getGouvernorat());
            ps.setString(5, p.getDelegation());
            ps.setString(6, p.getAdress());
            ps.setInt(7, p.getN_tel());
            ps.setInt(8,p.getFax());
            ps.setString(9, p.getA_mail());
            ps.setString(10,p.getPseudo());
            ps.setInt(11, p.getPasswd());
            ps.setInt(12,p.getCNAM());
            ps.setInt(13, p.getGarde());
            
            
            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
    }
    }

    @Override
    public void Update(Pharmacie a) {
         String requete = "update pharmacie set type_vet_stock=?, nombre_articles=?, id_depot=? where numero_stock=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
//            ps.setString(1, a.getType_vet_stock());
//            ps.setInt(2, a.getNombre_articles());
//            ps.setInt(3, a.getDepot().getId_dep());
//            ps.setInt(4, a.getNumero_stock());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    @Override
    public Pharmacie findById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Pharmacie> findAll() {
        //throw new UnsupportedOperationException("Not supported yet.");
        
             List<Pharmacie> listepharmacie = new ArrayList<Pharmacie>();

        String requete = "select * from pharmacie";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            while(resultat.next()){
                Pharmacie a =new Pharmacie();
                a.setId(resultat.getInt(1));
                a.setNom(resultat.getString(2));
                a.setNom_pharmacien(resultat.getString(3));
                a.setGouvernorat(resultat.getString(4));
                a.setDelegation(resultat.getString(5));
                a.setAdress(resultat.getString(6)); 
                a.setN_tel(resultat.getInt(7));
                a.setFax(resultat.getInt(8));
                a.setA_mail(resultat.getString(9));
                a.setCNAM(resultat.getInt(12));
                a.setGarde(resultat.getInt(13));
               
    

                listepharmacie.add(a);
            }
            return listepharmacie;
        } 
        catch (SQLException ex) {
          
            System.out.println("erreur lors du chargement des pharmaciens "+ex.getMessage());
            return null;
        }
    }
   public List<Pharmacie> findByGarde(int grade)
    { 
        
       List<Pharmacie> listpharmacie=new ArrayList<Pharmacie>() ;   
        String requete="select * from pharmacie where grade =?";
                try{
       PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
       ps .setInt(1, grade);
      ResultSet resultat=ps.executeQuery();
      while (resultat.next())
      {
          Pharmacie pharmacie=new Pharmacie();
          pharmacie.setId(resultat.getInt(1));
          pharmacie.setNom(resultat.getString(2));
          pharmacie.setNom_pharmacien(resultat.getString(3));
          pharmacie.setGouvernorat(resultat.getString(4));
          pharmacie.setDelegation(resultat.getString(5));
          pharmacie.setAdress(resultat.getString(6));
          pharmacie.setN_tel(resultat.getInt(7));
          pharmacie.setFax(resultat.getInt(8));
          pharmacie.setA_mail(resultat.getString(9));
          pharmacie.setPseudo(resultat.getString(10));
          pharmacie.setPasswd(resultat.getInt(11));
          pharmacie.setCNAM(resultat.getInt(12));
          pharmacie.setGarde(resultat.getInt(13));
          listpharmacie.add(pharmacie);
      }
           
          return listpharmacie;
      }
      catch(SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
          
      }

    @Override
    public boolean delete(int a) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String requete = "delete from Pharmacie where id_pharmacien=?";
        //Pharmacie pharmacie=new Pharmacie();
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, a);
            ps.executeUpdate();
            System.out.println("pharmacie supprimée");
            return true;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
            return false;
        }
    }
   
    /*public List<produit> detaille_pharmacien (int id)
    {
        String requete="select from Produit p ,Pharmacie ph where p.id_ph=ph.id_ph and ph.id_ph=' '";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet resultat = statement.executeQuery(requete);
            }
             }
            */
            
            
        
    
}
           
