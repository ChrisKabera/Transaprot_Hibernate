/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransDataBase;

import Tsans.Model.Trans;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author GRACE
 */
public class TransDB {
    
    
    public void saveTrans(Trans t){
        
  Session session=NewHibernateUtil.getSessionFactory().openSession();
  session.beginTransaction();
  session.save(t);
  session.getTransaction().commit();
  session.close();    
    } 
    
    public List<Trans> DisplayTrans(){
     List<Trans> ls=new ArrayList<>();
     Session session=NewHibernateUtil.getSessionFactory().openSession();
     //session.beginTransaction();
     
     Query q=session.createQuery("from Nybggbus");
     ls=q.list();
     session.close();
    return ls;
    }
    
}
