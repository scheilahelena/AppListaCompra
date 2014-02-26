/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;


import entidades.Produto;
import java.util.List;

/**
 *
 * @author Scheila
 */
public interface ProdutoDao {
    
    public void save(Produto produto);
    public Produto getProduto(int id);
    public List<Produto> list();
    public void remove(Produto produto);
    public void update(Produto produto);
    
}
