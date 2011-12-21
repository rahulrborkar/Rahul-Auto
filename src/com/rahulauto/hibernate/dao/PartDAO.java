package com.rahulauto.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.zkoss.zkplus.hibernate.HibernateUtil;

import com.rahulauto.hibernate.entities.Part;


public class PartDAO {

	Session currentSession() {
		return HibernateUtil.currentSession();
	}

	public void saveOrUpdate(Part part) {
		Session sess =  currentSession();        
		sess.saveOrUpdate(part);
	}

	public void delete(Part part) {
		Session sess =  currentSession();
		sess.delete(part);
	}

	public Part findById(String id) {
		Session sess =  currentSession();
		return (Part) sess.load(Part.class, id);
	}

	public List<Part> findAll() {
		Session sess =  currentSession();
		return sess.createQuery("from Part").list();
	}

}
