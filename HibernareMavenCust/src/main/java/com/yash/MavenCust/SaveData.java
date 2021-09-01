package com.yash.MavenCust;
 

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
          
    Employee1 e1=new Employee1();  
    e1.setId(921);  
    e1.setFirstName("sneha1");  
    e1.setLastName("Pune1");  
      
    session.save(e1);
   // session.update(e1);
   // session.delete(e1);
	t.commit();
    System.out.println("successfully saved");  
	//factory.close();
    session.close();  
     e1 = null;
      session = factory.openSession();
      session.beginTransaction();
      
     e1 = (Employee1) session.get(Employee1.class, 1);
     System.out.println(e1.getId()+" "+e1.getFirstName()+" "+e1.getLastName());
     
      }  
} 