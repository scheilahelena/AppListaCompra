/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import entidades.Produto;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Scheila
 */
public class ProdutoDaoImp implements ProdutoDao{

    @Override
    public void save(Produto produto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(produto);
        t.commit();
    }

    @Override
    public Produto getProduto(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Produto) session.load(Produto.class, id);
    }

    @Override
    public List<Produto>list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Produto").list();
        t.commit();
        return lista;
    }

    @Override
    public void remove(Produto produto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(produto);
        t.commit();
    }

    @Override
    public void update(Produto produto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(produto);
        t.commit();
    }
    
}
