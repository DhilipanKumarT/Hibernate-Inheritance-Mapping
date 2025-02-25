package com.model;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class Hbutil
{
	private static StandardServiceRegistry registry=null;
	private static SessionFactory sf=null;
	public static SessionFactory getSesFactory()
	{
		if(sf==null) 
		{
			try 
			{	
			registry=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			MetadataSources mds=new MetadataSources(registry);
			Metadata md=mds.getMetadataBuilder().build();
			sf=md.buildSessionFactory();
		}
		catch(Exception e)
		{	
		 e.printStackTrace();		}
		}
		return sf;
	}
}