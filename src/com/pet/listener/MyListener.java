package com.pet.listener;

import java.io.Reader;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

@WebListener
public class MyListener implements ServletContextListener {
	protected SqlSessionFactory sfactory;

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

		ServletContextListener.super.contextDestroyed(sce);
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		try {
			Reader reader = Resources.getResourceAsReader("mybatis_config.xml");
			sfactory = new SqlSessionFactoryBuilder().build(reader);
			sce.getServletContext().setAttribute("SF", sfactory);
		} catch (Exception e) {
		}

	}

}
