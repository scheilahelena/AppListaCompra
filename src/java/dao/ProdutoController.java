/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import entidades.Produto;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Scheila
 */
@ManagedBean
@SessionScoped
public class ProdutoController {
    private Produto produto;
    private DataModel listaProdutos;

    /**
     * Creates a new instance of ListaController
     */
    public ProdutoController() {
    }
    
       public DataModel getListarProdutos() {
            List<Produto> listagem = new ProdutoDaoImp().list();
            listaProdutos = new ListDataModel(listagem);
            return listaProdutos;
        }
    
    
    
        public Produto getProdutos() {
            return produto;
        }
        public void setProdutos(Produto produto) {
            this.produto = produto;
        }
        public String prepararAdicionarProduto(){
            produto = new Produto();
            return "gerenciarProdutos";
        }
        public String prepararAlterarProduto(){
            produto = (Produto)(listaProdutos.getRowData());
            return "gerenciarProdutos";
        }
        public String excluirProduto(){
            Produto listaTemp = (Produto)(listaProdutos.getRowData());
            ProdutoDao dao = new ProdutoDaoImp();
            dao.remove(listaTemp);
            return "gerenciarProdutos";
        }
        public String adicionarProduto(){
            ProdutoDao dao = new ProdutoDaoImp();
            dao.save(produto);
            return "gerenciarProdutos";
        }
        public String alterarProduto(){
            ProdutoDao dao = new ProdutoDaoImp();
            dao.update(produto);
            return "gerenciarProdutos";
        }
        
       
    
}
