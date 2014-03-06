/*<<
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma_project.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tunipharma_project.entities.Produit;
import tunipharma_project.util.MyConnection;

/**
 *
 * @author yassine
 */
public class ProduitDAO implements DAO<Produit> {

    @Override
    public void Create(Produit a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Update(Produit a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Produit findById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Produit> findAll() {
        //throw new UnsupportedOperationException("Not supported yet.");
         List<Produit> Listproduit =new ArrayList<Produit>();
        String requete="select * from produit ";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet resultat = ps.executeQuery(requete);
            //PharmacieDAO pharmacieDAO=new PharmacieDAO();
            while(resultat.next())
            {
            Produit p=new Produit();
            p.setId_ph(resultat.getInt(1));
            p.setNom(resultat.getString(2));
            p.setType(resultat.getString(3));
           // p.setPharmacie(resultat.getString(4));
            p.setCode_produit(resultat.getInt(5));
            p.setValiditer(resultat.getInt(6));
            p.setF_prix(resultat.getInt(7));
            p.setRemise(resultat.getInt(8));
            p.setPrix(resultat.getInt(9));
            Listproduit.add(p);
            }
                return Listproduit;
        }
        catch (SQLException ex){
          
            System.out.println("erreur lors du chargement des produits "+ex.getMessage());
            return null;
        }
    }

   
   /* public List<Produit> detaille_pharmacien (int id)
    {
        List<Produit> Listproduit =new ArrayList<Produit>();
        String requete="select from produit p ,pharmacie ph where p.id_ph=ph.id_ph and ph.id_ph=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet resultat = ps.executeQuery(requete);
            //PharmacieDAO pharmacieDAO=new PharmacieDAO();
            while(resultat.next())
            {
                Produit p=new Produit();
            p.setId_ph(resultat.getInt(1));
            p.setGatigorie(resultat.getString(2));
            p.setLaboratoire(resultat.getString(3));
            p.setType(resultat.getString(4));
            Listproduit.add(p);
            }
                return Listproduit;
        }
        catch (SQLException ex){
          
            System.out.println("erreur lors du chargement des produits "+ex.getMessage());
            return null;
        }
                
                
                
            }*/

    @Override
    public boolean delete(int a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
            }
            
    
    

