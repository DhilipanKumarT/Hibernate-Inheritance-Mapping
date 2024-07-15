package com.model;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TPCeg
{
  public static void main(String[] args)
  {
	  try(Session ses=Hbutil.getSesFactory().openSession())
			  {
		           Transaction tr = ses.beginTransaction();
		           user e1=new user("Dhilipan");
		           RegUser e2=new RegUser(5500,"1 YEAR", "Dhilipan");
		           Traine e3=new Traine(2050, "6 months", "ARVINTH");
		           ses.persist(e1);
		           ses.persist(e2);
		           ses.persist(e3);
		           tr.commit();
		           ses.close();
			  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }
  
}
