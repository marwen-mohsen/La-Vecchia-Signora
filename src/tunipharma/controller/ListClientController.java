/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tunipharma.dao.ClientDAO;
import tunipharma.entites.Client;

/**
 *
 * @author VAIO
 */
public class ListClientController extends AbstractTableModel {

    String[] headers = {"Id", "Nom", "Prenom", "Cin","Adresse","Mail","Telephonne","Pseudo","Mot_de_passe"};
    List<Client> listClient = new ArrayList<Client>();

    public ListClientController() {

        ClientDAO stockDAO = new ClientDAO();
        listClient = stockDAO.DisplayAllClient();
    }

    public int getRowCount() {
        return listClient.size();
    }

    public int getColumnCount() {
        return headers.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listClient.get(rowIndex).getId_client();
            case 1:
                return listClient.get(rowIndex).getNom_client();
            case 2:
                return listClient.get(rowIndex).getPrenom_client();
            case 3:
                return listClient.get(rowIndex).getCin_client();
            case 4:
                return listClient.get(rowIndex).getAdresse_client();
            case 5:
                return listClient.get(rowIndex).getMail_client();
            case 6:
                return listClient.get(rowIndex).getTelephonne_client();
            case 7:
                return listClient.get(rowIndex).getPseudo_client();
            case 8:
                return listClient.get(rowIndex).getPwd_client();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return headers[column];
    }
    
    
}
