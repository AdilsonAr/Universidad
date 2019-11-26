/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojos.Carrera;
import com.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author KGB
 */
public class DaoCarrera {
    
    public void insertarCarrera(Carrera ca)
    {
        Session session =null;
        try
        {
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(ca);
            session.getTransaction().commit();
        }
        
        catch(Exception e)
        {
            session.getTransaction().rollback();
        }
        finally
        {
            if(session!=null)
            {
                session.close();
            }
        }
    }
    
    public void eliminarCarrera(Carrera ca)
    {
        Session session=null;
        try
        {
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(ca);           
            session.getTransaction().commit();                       
        }
        
        catch(Exception e)
        {
            session.getTransaction().rollback();
        }
        
        finally
        {
            if(session!=null)
            {
                session.close();
            }
        }
    }
    
    public void editarCarrera(Carrera ca)
    {
        Session session=null;
        try
        {
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(ca);
            session.getTransaction().commit();
        }
        
        catch(Exception e)
        {
            session.getTransaction().rollback();
        }
        
        finally
        {
            if(session!=null)
            {
                session.close();
            }
        }
    }
    
    public List<Carrera> mostrarCarrera()
    {
        List<Carrera> lista =null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction t =session.beginTransaction();
        String hql="FROM Carrera";
        try
        {
            lista=session.createQuery(hql).list();
            t.commit();
            session.close();
        }
        
        catch(Exception e)
        {
            t.rollback();
        }
                
        return lista;
    }
}
