/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma_project.entities;

//import java.util.Date;

/**
 *
 * @author yassine
 */
public class Produit {
    private int Id_ph;
    private int Code_produit;
    private String Nom;
    //private String Gatigorie; 
    private String Laboratoire;
    private String Type; //specification
    private int Validiter;
    private float F_prix;
    private int Remise;
    private float Prix;

    public int getCode_produit() {
        return Code_produit;
    }

    public int getId_ph() {
        return Id_ph;
    }

    public void setId_ph(int Id_ph) {
        this.Id_ph = Id_ph;
    }

    public float getF_prix() {
        return F_prix;
    }

    public void setF_prix(float F_prix) {
        this.F_prix = F_prix;
    }

    public void setCode_produit(int Code_produit) {
        this.Code_produit = Code_produit;
    }

    public int getValiditer() {
        return Validiter;
    }

    public void setValiditer(int Validiter) {
        this.Validiter = Validiter;
    }

    public float F_prix() {
        return F_prix;
    }

    public void setF_prix(int F_prix) {
        this.F_prix = F_prix;
    }

    public int getRemise() {
        return Remise;
    }

    public void setRemise(int Remise) {
        this.Remise = Remise;
    }

    public float getPrix() {
        return Prix;
    }

    public void setPrix(int Prix) {
        this.Prix = Prix;
    }
    
    
    

    /*public int getId_ph() {
        return Id_ph;
    }

    public void setId_ph(int Id_ph) {
        this.Id_ph = Id_ph;
    }*/

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    /*public String getGatigorie() {
        return Gatigorie;
    }

    public void setGatigorie(String Gatigorie) {
        this.Gatigorie = Gatigorie;
    }*/

    public String getLaboratoire() {
        return Laboratoire;
    }

    public void setLaboratoire(String Laboratoire) {
        this.Laboratoire = Laboratoire;
    }

    public String getType() {
        return Type;
    }

 public void setType(String Type) {
        this.Type = Type;
    }
    /*public float prix_reduit()
    {
        if (Remise==0)
        {
           F_prix= Prix;
        }
        else
        {
            F_prix=(Prix*Remise)/100;
        }
        return F_prix;
    }*/
    
    
}
