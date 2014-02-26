/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import entidades.Lista;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Scheila
 */
public class ListaDaoImp implements ListaDao{

    @Override
    public void save(Lista lista) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(lista);
        t.commit();
    }

    @Override
    public Lista getLista(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Lista) session.load(Lista.class, id);
    }

    @Override
    public List<Lista> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Lista").list();
        t.commit();
        return lista;
    }

    @Override
    public void remove(Lista lista) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(lista);
        t.commit();
    }

    @Override
    public void update(Lista lista) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(lista);
        t.commit();
    }
    
}
