/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma_project.entities;

/**
 *
 * @author yassine
 */
public class Pharmacie {
    private int Id;
    private  String Nom;
    private String Nom_pharmacien;
    private String Adress;
    private String A_mail;
    private int N_tel;
    private int Garde;
    protected int passwd;
    private String Gouvernorat;
    private String Delegation;
    private int CNAM;
    private String Pseudo;
    private int Fax;

    public int getPasswd() {
        return passwd;
    }

    public void setPasswd(int passwd) {
        this.passwd = passwd;
    }

    public String getGouvernorat() {
        return Gouvernorat;
    }

    public void setGouvernorat(String Gouvernorat) {
        this.Gouvernorat = Gouvernorat;
    }

    public String getDelegation() {
        return Delegation;
    }

    public void setDelegation(String Delegation) {
        this.Delegation = Delegation;
    }

    public int getCNAM() {
        return CNAM;
    }

    public void setCNAM(int CNAM) {
        this.CNAM = CNAM;
    }

    public String getPseudo() {
        return Pseudo;
    }

    public void setPseudo(String Pseudo) {
        this.Pseudo = Pseudo;
    }

    public int getFax() {
        return Fax;
    }

    public void setFax(int Fax) {
        this.Fax = Fax;
    }
    
  /*  public Pharmacie(int id,String nom,String nom_gerant,String adress,String a_mail,int n_tel,int garde)
    {
        Id=id;
        Nom=nom;
        Nom_gerant=nom_gerant;
        Adress=adress;
        A_mail=a_mail;
        N_tel=n_tel;
        Garde=garde;
    }*/

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getNom_pharmacien() {
        return Nom_pharmacien;
    }

    public void setNom_pharmacien(String Nom_pharmacien) {
        this.Nom_pharmacien = Nom_pharmacien;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public String getA_mail() {
        return A_mail;
    }

    public void setA_mail(String A_mail) {
        this.A_mail = A_mail;
    }

    public int getN_tel() {
        return N_tel;
    }

    public void setN_tel(int N_tel) {
        this.N_tel = N_tel;
    }

    public int getGarde() {
        return Garde;
    }

    public void setGarde(int Garde) {
        this.Garde = Garde;
    }

    @Override
    public String toString() {
        return "Pharmacie{" +  ", Nom=" + Nom + ", Nom_pharmacien=" + Nom_pharmacien + ", Adress=" + Adress + ", A_mail=" + A_mail + ", N_tel=" + N_tel + ", Garde=" + Garde +  ", Gouvernorat=" + Gouvernorat + ", Delegation=" + Delegation + ", CNAM=" + CNAM +  ", Fax=" + Fax + '}';
    }
    
}
