package com.enlawebdekaaf.app.daointerface;

import javax.persistence.EntityManager;

import com.enlawebdekaaf.app.entity.Tusuario;

public interface IDaoUsuario {
	
	public boolean insert(EntityManager em, Tusuario usuario) throws Exception;
	
	public Tusuario getById(EntityManager em, Tusuario usuario) throws Exception;
	
	public boolean update(EntityManager em, Tusuario usuario) throws Exception;
	//*//
}
