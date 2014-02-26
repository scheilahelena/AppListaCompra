package entidades;
// Generated 25/02/2014 20:18:16 by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Produto generated by hbm2java
 */
public class Produto  implements java.io.Serializable {


     private int idproduto;
     private String deproduto;
     private BigDecimal vlpro;
     private Set<ListaIt> listaIts = new HashSet<ListaIt>(0);

    public Produto() {
    }

	
    public Produto(int idproduto, String deproduto) {
        this.idproduto = idproduto;
        this.deproduto = deproduto;
    }
    public Produto(int idproduto, String deproduto, BigDecimal vlpro, Set<ListaIt> listaIts) {
       this.idproduto = idproduto;
       this.deproduto = deproduto;
       this.vlpro = vlpro;
       this.listaIts = listaIts;
    }
   
    public int getIdproduto() {
        return this.idproduto;
    }
    
    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }
    public String getDeproduto() {
        return this.deproduto;
    }
    
    public void setDeproduto(String deproduto) {
        this.deproduto = deproduto;
    }
    public BigDecimal getVlpro() {
        return this.vlpro;
    }
    
    public void setVlpro(BigDecimal vlpro) {
        this.vlpro = vlpro;
    }
    public Set<ListaIt> getListaIts() {
        return this.listaIts;
    }
    
    public void setListaIts(Set<ListaIt> listaIts) {
        this.listaIts = listaIts;
    }




}

