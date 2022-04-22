package com.resource;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbResource {

		public static SessionFactory getSessionFactory() {
			Configuration con = new Configuration();
			con.configure("hibernate.cfg.xml");
			SessionFactory sf = con.buildSessionFactory();
			return sf;
		}
}
