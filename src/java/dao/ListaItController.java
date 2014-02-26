/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;


import entidades.ListaIt;
import entidades.ListaItId;
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
public class ListaItController {
    private ListaIt item;
    private ListaItId id;
    private DataModel listaItens;
   

    /**
     * Creates a new instance of ListaController
     */
    public ListaItController() {
    }
    
    public DataModel getListarItensLista(int idLista ) {
            List<ListaIt> listagem = new ListaItDaoImp().list(idLista);
            listaItens = new ListDataModel(listagem);
            return listaItens;
        }
        public ListaIt getItemLista() {
            return item;            
        }
        
        public ListaItId getIdItemLista() {           
            return id;
        }
        
        public void setListaCompra(ListaIt item, ListaItId id) {
            this.item = item;
            this.id = id;
        }
        
        
        public String prepararAdicionarItemLista(){
            item = new ListaIt();
            id   = new ListaItId();
            return "gerenciarItens";
        }
        public String prepararAlterarItem(){
            item = (ListaIt)(listaItens.getRowData());
            id   = (ListaItId)(listaItens.getRowData());
            return "gerenciarItens";
        }
        public String excluirItemCompra(){
            ListaIt listaTemp = (ListaIt)(listaItens.getRowData());
            ListaItDao dao = new ListaItDaoImp();
            dao.remove(listaTemp);
            return "gerenciarListasCompras";
        }
        public String adicionarItemLista(){
            ListaItDao dao = new ListaItDaoImp();
            dao.save(item, id);
            return "gerenciarListasCompras";
        }
        public String alterarItemLista(){
            ListaItDao dao = new ListaItDaoImp();
            dao.update(item);
            return "gerenciarListasCompras";
        }
        
        
    
}
