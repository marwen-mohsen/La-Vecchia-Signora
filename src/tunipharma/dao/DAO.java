/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma_project.DAO;

import java.util.List;

/**
 *
 * @author yassine
 */
public interface DAO<T> {
    void Create(T a);
    void Update(T a);
    T findById(int id);
    List<T> findAll();
    boolean delete(int a);
    
    
}
