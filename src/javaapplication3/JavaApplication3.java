
package javaapplication3;

import entity.NewHibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author kazakoff
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        
        s.close();
        

    }
    
}
