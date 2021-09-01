package com.yash.MavenEmbeddedHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;




public class SaveData {  
public static void main(String[] args) {  
      
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate_config.xml").build();
    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

SessionFactory factory = meta.getSessionFactoryBuilder().build();
Session session = factory.openSession();
Transaction t = session.beginTransaction(); 
          
Employee e1=new Employee();  
   //e1.setId(1);  
    e1.setFirstName("Shailesh");  
    e1.setLastName("Pawar");  

Address addr = new Address();    
     // addr.setEmpid(1);
      addr.setStreet("pune road");
      addr.setCity("pune");
      addr.setPincode("212121");
      addr.setState("Mh");
      e1.setAddress(addr);
      addr.setEmp(e1);
     
    session.save(e1);
   session.update(e1);
   
/**
 Transaction t = null;
    SessionFactory factory = meta.getSessionFactoryBuilder().build();
	Session session = factory.openSession();
try {
	
	 t = session.beginTransaction(); 
	Address address = new Address("OMR Road", "Chennai", "TN", "600097");
	Employee e1=new Employee(1,"Eswar","patil", address);
	session.save(e1);
	t.commit();
} catch (HibernateException e) {
	t.rollback();
	e.printStackTrace();
} finally {
	session.close();
} */
   // session.delete(e1);
	t.commit();
   System.out.println("successfully saved");  
	//factory.close();
   session.close();  
  //   e1 = null;
    //  session = factory.openSession();
      //session.beginTransaction();
      
    // e1 = (Employee) session.get(Employee.class, 1);
     //System.out.println(e1.getId()+" "+e1.getFirstName()+" "+e1.getLastName()+""+e1.getAddress()); 
     
      }  
} 