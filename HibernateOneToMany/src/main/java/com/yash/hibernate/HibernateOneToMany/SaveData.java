package com.yash.hibernate.HibernateOneToMany;

import java.util.ArrayList;

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
          

     
Address addr1 = new Address();    
      addr1.setStreet("fs road");
      addr1.setCity("pune");
      addr1.setPincode("212121");
      addr1.setState("Mh");
     
      Address addr2 = new Address();    
      addr2.setStreet("fc road");
      addr2.setCity("pune");
      addr2.setPincode("212121");
      addr2.setState("Mh");
      
      Address addr3 = new Address();    
      addr3.setStreet("rm road");
      addr3.setCity("pune");
      addr3.setPincode("212121");
      addr3.setState("Mh");
      
      Address addr4 = new Address();    
      addr4.setStreet("jk road");
      addr4.setCity("pune");
      addr4.setPincode("212121");
      addr4.setState("Mh");
      
      ArrayList<Address> list1 = new ArrayList<Address>();
      list1.add(addr1); 
      list1.add(addr2);
     
      ArrayList<Address> list2 = new ArrayList<Address>();
      list2.add(addr3);
      list2.add(addr4);
      
      
    
      
      
     
      Employee e1=new Employee();  
      //e1.setId(3);  
       e1.setFirstName("akshay");  
       e1.setLastName("patil");  
       e1.setAddresses(list1);
     
       Employee e3=new Employee();  
       //e2.setId();  
        e3.setFirstName("usha");  
        e3.setLastName("more");  
        e3.setAddresses(list2);
     
      /**
       Employee e2=new Employee();  
       //e1.setId(3);  
        e2.setFirstName("Harshada");  
        e2.setLastName("B.");  
        e2.setAddresses(list2);
       
        
        Employee e4=new Employee();  
        //e2.setId();  
         e4.setFirstName("Shailesh");  
         e4.setLastName("Pawar");  
         e4.setAddresses(list2);
      */
    
     
    
       
     
   session.save(e1);
  // session.save(e2);
   session.save(e3);
   //session.save(e4);
  // session.delete(e1);
  // session.update(e1);
 //  session.update(e2);
  // session.update(e3);
  // session.update(e4);
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