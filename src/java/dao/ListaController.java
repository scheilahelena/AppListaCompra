/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import entidades.Lista;
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
public class ListaController {
    private Lista lista;
    private DataModel listaListaCompras;
    private int selectedItemIndex;

    /**
     * Creates a new instance of ListaController
     */
    public ListaController() {
    }
    
    public DataModel getListarListasCompras() {
            List<Lista> listagem = new ListaDaoImp().list();
            listaListaCompras = new ListDataModel(listagem);
            return listaListaCompras;
        }
    
        public Lista getListaCompra() {
            return lista;
        }
        public void setListaCompra(Lista lista) {
            this.lista = lista;
        }
        public String prepararAdicionarListaCompra(){
            lista = new Lista();
            return "gerenciarListasCompras";
        }
        public String prepararAlterarListaCompra(){
            lista = (Lista)(listaListaCompras.getRowData());
            return "gerenciarListasCompras";
        }
        public String excluirListaCompra(){
            Lista listaTemp = (Lista)(listaListaCompras.getRowData());
            ListaDao dao = new ListaDaoImp();
            dao.remove(listaTemp);
            return "index";
        }
        public String adicionarListaCompra(){
            ListaDao dao = new ListaDaoImp();
            dao.save(lista);
            return "index";
        }
        public String alterarListaCompra(){
            ListaDao dao = new ListaDaoImp();
            dao.update(lista);
            return "index";
        }
        
        public Lista getSelected() {
            if (lista == null) {
                lista = new Lista();
                selectedItemIndex = -1;
            }
            return lista;
        }
    
}
