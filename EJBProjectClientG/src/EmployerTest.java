import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import dao.IDao;
import entities.Filiere;
import entities.Role;
import entities.User;
import entities.student;
import jakarta.ejb.Stateless;

public class EmployerTest {
	
	public static IDao<student> lookUpStudentRemote() throws NamingException {
		final Hashtable jndiProperties = new Hashtable();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
		jndiProperties.put(Context.PROVIDER_URL, "http-remoting://127.0.0.1:8080");
		final Context context = new InitialContext(jndiProperties);

		return (IDao<student>) context.lookup("ejb:EARPROJECTE/EJBProject/G6StudS!dao.IDao");

	}
	
	public static IDao<Filiere> lookUpFiliereRemote() throws NamingException {
		final Hashtable jndiProperties = new Hashtable();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
		jndiProperties.put(Context.PROVIDER_URL, "http-remoting://127.0.0.1:8080");
		final Context context = new InitialContext(jndiProperties);

		return (IDao<Filiere>) context.lookup("ejb:EARPROJECTE/EJBProject/G6FiliereS!dao.IDao");

	}
	
	public static IDao<Role> lookUpRoleRemote() throws NamingException {
		final Hashtable jndiProperties = new Hashtable();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
		jndiProperties.put(Context.PROVIDER_URL, "http-remoting://127.0.0.1:8080");
		final Context context = new InitialContext(jndiProperties);

		return (IDao<Role>) context.lookup("ejb:EARPROJECTE/EJBProject/G6RoleS!dao.IDao");

	}
	
	public static IDao<User> lookUpUserRemote() throws NamingException {
		final Hashtable jndiProperties = new Hashtable();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
		jndiProperties.put(Context.PROVIDER_URL, "http-remoting://127.0.0.1:8080");
		final Context context = new InitialContext(jndiProperties);

		return (IDao<User>) context.lookup("ejb:EARPROJECTE/EJBProject/G6UserS!dao.IDao");

	}
	
	
	public static void main(String[] args) {
		try {
			IDao<student> dao = lookUpStudentRemote();
			
			IDao<Role> dao2 = lookUpRoleRemote();	
			IDao<User> dao4 = lookUpUserRemote();
			
			
			IDao<Filiere> dao1 = lookUpFiliereRemote();
			
			/*--------------------------Creation de Filiere--------------------------------*/		
			 	//Filiere s=dao1.create(new Filiere("asma123","informatique"));
			 //   	                        
			 /*-------------------------------------------------------------------------------*/
		     
			
			 /*--------------------------Creation de Students--------------------------------*/		
			 		//dao.create(new student("asma123", "asma@gmail.com", "asma","elouali","0654363704",s));                         //
			    	//dao.create(new student("sdf123", "maryame@gmail.com", "maryame","elouali","0654363704",s));                           //
			 //   	dao.create(new student("ALAMI", "Kamal", 8000));                          //
			 /*-------------------------------------------------------------------------------*/
					
		    /*-------------------------Delete de student------------------------------------*/			
		    	 //  student k = dao.findById(2);                                              
		                                                                                   
			      //   if (k != null) {                                                        
			                                                                                
			        //    student managedEntity = dao.update(k);                              
			        //    System.out.println(dao.delete(managedEntity).getFirstName());
			      //   }                                                                  
			                                                                                 
		     /*-------------------------------------------------------------------------------*/ 
					
		     /*--------------------------Update  de l'emploie----------------------------------*/
			//		Employe updatedEmploye = new Employe("Hanane", "kamali", 9000);            //
			//		updatedEmploye.setId(1);                                                   //
			//		dao.update(updatedEmploye);                                                //
			//	                                                                              //
			/*--------------------------------------------------------------------------------*/
					
					
					
					
					
					 /*--------------------------Creation de l'etudiant -------------------------------*/	
					 //       dao1.create(new Etudiant("RAMI", "Samik","aze12"));                        //	 
					 // 	  dao1.create(new Etudiant("Asma", "elouali","AZEE1234"));                   //	 
					 //   	  dao1.create(new Etudiant("hajar", "elouali","Azdf124"));                   //
					 /*--------------------------------------------------------------------------------*/
							
					 /*-------------------------Delete de l'emploie------------------------------------*/			
					 /*		                                                                           */
					 /*                Etudiant s = dao1.findById(3);                                    */
					 /*                                                                                */
					 /*                if (s != null) {                                                */
					 /*                                                                                */
					 /*                  Etudiant managedEntity = dao.update(s);                        */
					 /*                  System.out.println(dao.delete(managedEntity).getNom());       //                                                       */
					 /*                                                                                */
					 /*                                                                                */
					 /*                }                                                               */
					 /*                                                                                */
					 /*                                                                                */
					 /*		                                                                           */
					 /*--------------------------------------------------------------------------------*/ 
							
					 /*--------------------------Update  de l'etudiant---------------------------------*/
					 	                                                                               //
				     //			Role updatedEtudiant = new Etudiant("sanae", "kasa", "A45FG");     //    
					 //		    updatedEtudiant.setId(4);                                              //    
					 //      	dao1.update(updatedEtudiant);                                           //   
					                                                                                //	
					 /*-------------------------------------------------------------------------------*/		
							
							
							
					 /*-------------------------l'affichage des emploies ------------------------------*/		
					 /*		                                                                           */
					 /*		  for(Employe e : dao.findAll())                                           */
					 /*			System.out.println(e.getNom());                                        */
					 /*		                                                                           */
					 /*--------------------------------------------------------------------------------*/
					 
			    	 /*-------------------------l'affichage des students ------------------------------*/		
					 /*		                                                                           */
					 		  for(student e : dao.findAll())                                           
					 			System.out.println(e.getFirstName());                                        
					 /*		                                                                           */
					 /*--------------------------------------------------------------------------------*/
					 		  for(Filiere e : dao1.findAll())                                           
						 			System.out.println(e.getName()); 
			 /*--------------------------Creation de l'etudiant -------------------------------*/	
			 //       dao2.create(new Role("RAMI", "Samik","aze12"));                        //	 
			 // 	  dao2.create(new Role("Asma", "elouali","AZEE1234"));                   //	 
			 //   	  dao2.create(new Role("hajar", "elouali","Azdf124"));                   //
			 /*--------------------------------------------------------------------------------*/
					
			 /*-------------------------Delete de l'emploie------------------------------------*/			
			 /*		                                                                           */
			 /*                Etudiant s = dao1.findById(3);                                    */
			 /*                                                                                */
			 /*                if (s != null) {                                                */
			 /*                                                                                */
			 /*                  Etudiant managedEntity = dao.update(s);                        */
			 /*                  System.out.println(dao.delete(managedEntity).getNom());       //                                                       */
			 /*                                                                                */
			 /*                                                                                */
			 /*                }                                                               */
			 /*                                                                                */
			 /*                                                                                */
			 /*		                                                                           */
			 /*--------------------------------------------------------------------------------*/ 
					
			 /*--------------------------Update  de l'etudiant---------------------------------*/
			 	                                                                               //
		     //			Etudiant updatedEtudiant = new Etudiant("sanae", "kasa", "A45FG");     //    
			 //		    updatedEtudiant.setId(4);                                              //    
			 //       	dao1.update(updatedEtudiant);                                           //   
			                                                                                //	
			 /*-------------------------------------------------------------------------------*/		
					
					
					
			 /*-------------------------l'affichage des emploies ------------------------------*/		
			 /*		                                                                           */
			 /*		  for(Employe e : dao.findAll())                                           */
			 /*			System.out.println(e.getNom());                                        */
			 /*		                                                                           */
			 /*--------------------------------------------------------------------------------*/
			 
			 /*-------------------------l'affichage des etudiants------------------------------*/
			 /*	     for(Etudiant e1 : dao1.findAll())                                         */
			 /*			System.out.println(e1.getCne());                                       */
			 /*--------------------------------------------------------------------------------*/
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
