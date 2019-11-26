/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojos.Facultad;
import com.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author KGB
 */
public class DaoFacultad {
    
    public void insertarFacultad(Facultad fa)
    {
        Session session =null;
        try
        {
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(fa);
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
    
    public void eliminarFacultad(Facultad fa)
    {
        Session session=null;
        try
        {
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(fa);
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
    
    public void editarFacultad(Facultad fa)
    {
        Session session=null;
        try
        {
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(fa);
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
    
    public List<Facultad> mostrarFacultad()
    {
        List<Facultad> lista =null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction t =session.beginTransaction();
        String hql="FROM Facultad";
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
