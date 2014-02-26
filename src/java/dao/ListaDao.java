/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import entidades.Lista;
import java.util.List;

/**
 *
 * @author Scheila
 */
public interface ListaDao {
    
    public void save(Lista lista);
    public Lista getLista(int id);
    public List<Lista> list();
    public void remove(Lista lista);
    public void update(Lista lista);
    
}
