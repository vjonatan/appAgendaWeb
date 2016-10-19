package com.enlawebdekaaf.app.dao;

import javax.persistence.EntityManager;

import com.enlawebdekaaf.app.daointerface.IDaoUsuario;
import com.enlawebdekaaf.app.entity.Tusuario;

public class DaoUsuario implements IDaoUsuario {

	@Override
	public boolean insert(EntityManager em, Tusuario usuario) throws Exception {
		
		em.persist(usuario);
		
		return true;
	}

	@Override
	public Tusuario getById(EntityManager em, Tusuario usuario) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(EntityManager em, Tusuario usuario) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
