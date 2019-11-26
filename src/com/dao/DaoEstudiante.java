/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojos.Estudiante;
import com.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author KGB
 */
public class DaoEstudiante {
    
    public void insertarEstudiante(Estudiante es)
    {
        Session session =null;
        try
        {
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(es);
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
    
    public void eliminarEstudiante(Estudiante es)
    {
        Session session=null;
        try
        {
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(es);
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
    
    public void editarEstudiante(Estudiante es)
    {
        Session session=null;
        try
        {
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(es);
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
    
    public List<Estudiante> mostrarEstudiante()
    {
        List<Estudiante> lista =null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction t =session.beginTransaction();
        String hql="FROM Estudiante";
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
