package entidades;
// Generated 25/02/2014 20:18:16 by Hibernate Tools 3.6.0



/**
 * ListaItId generated by hbm2java
 */
public class ListaItId  implements java.io.Serializable {


     private int idlista;
     private int nuseq;

    public ListaItId() {
    }

    public ListaItId(int idlista, int nuseq) {
       this.idlista = idlista;
       this.nuseq = nuseq;
    }
   
    public int getIdlista() {
        return this.idlista;
    }
    
    public void setIdlista(int idlista) {
        this.idlista = idlista;
    }
    public int getNuseq() {
        return this.nuseq;
    }
    
    public void setNuseq(int nuseq) {
        this.nuseq = nuseq;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ListaItId) ) return false;
		 ListaItId castOther = ( ListaItId ) other; 
         
		 return (this.getIdlista()==castOther.getIdlista())
 && (this.getNuseq()==castOther.getNuseq());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdlista();
         result = 37 * result + this.getNuseq();
         return result;
   }   


}

