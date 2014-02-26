/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import entidades.ListaIt;
import entidades.ListaItId;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Scheila
 */
public class ListaItDaoImp implements ListaItDao{

    @Override
    public void save(ListaIt listaItem, ListaItId idLista) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        listaItem.setId(idLista);    
        session.save(listaItem);
        t.commit();
    }

    @Override
    public ListaIt getListaItens(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (ListaIt) session.load(ListaIt.class, id);
    }

    @Override
    public List<ListaIt> list(int idLista) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from ListaIt where idLista="+idLista).list();
        t.commit();
        return lista;
    }

    @Override
    public void remove(ListaIt listaItem) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(listaItem);
        t.commit();
    }

    @Override
    public void update(ListaIt listaItem) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(listaItem);
        t.commit();
    }
    
}
