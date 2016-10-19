package com.enlawebdekaaf.app.ejbinterface;

import java.util.List;

import javax.ejb.Local;

import com.enlawebdekaaf.app.entity.Tusuario;

@Local
public interface IEjbUsuario {
	
	public boolean insert();
	
	public void setUsuario(Tusuario usuario);
	
	public Tusuario getUsuario();
	
	public void setListaUsuario(List<Tusuario> listaUsuario);
	
	public List<Tusuario> getListaUsuario();
	
}
