/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.entites;

/**
 *
 * @author VAIO
 */
public class Client {
    
    private int id_client;
    private int cin_client;
    private int telephonne_client;
    private String adresse_client;
    private String nom_client;
    private String prenom_client;
    private String mail_client;
    private String pseudo_client;
    private String pwd_client;

    public int getId_client() {
        return id_client;
    }

    public int getCin_client() {
        return cin_client;
    }

    public int getTelephonne_client() {
        return telephonne_client;
    }

    public String getAdresse_client() {
        return adresse_client;
    }

    public String getNom_client() {
        return nom_client;
    }

    public String getPrenom_client() {
        return prenom_client;
    }

    public String getMail_client() {
        return mail_client;
    }

    public String getPseudo_client() {
        return pseudo_client;
    }

    public String getPwd_client() {
        return pwd_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public void setCin_client(int cin_client) {
        this.cin_client = cin_client;
    }

    public void setTelephonne_client(int telephonne_client) {
        this.telephonne_client = telephonne_client;
    }

    public void setAdresse_client(String adresse_client) {
        this.adresse_client = adresse_client;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    public void setPrenom_client(String prenom_client) {
        this.prenom_client = prenom_client;
    }

    public void setMail_client(String mail_client) {
        this.mail_client = mail_client;
    }

    public void setPseudo_client(String pseudo_client) {
        this.pseudo_client = pseudo_client;
    }

    public void setPwd_client(String pwd_client) {
        this.pwd_client = pwd_client;
    }
           

    
}
