/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import entidades.ListaIt;
import entidades.ListaItId;

import java.util.List;

/**
 *
 * @author Scheila
 */
public interface ListaItDao {
    
    public void save(ListaIt listaItem, ListaItId idLista);
    public ListaIt getListaItens(int id);
    public List<ListaIt> list(int idLista);
    public void remove(ListaIt listaItem);
    public void update(ListaIt listaItem);
    
}
