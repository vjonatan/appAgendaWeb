package com.enlawebdekaaf.app.ejb;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.enlawebdekaaf.app.dao.DaoUsuario;
import com.enlawebdekaaf.app.daointerface.IDaoUsuario;
import com.enlawebdekaaf.app.ejbinterface.IEjbUsuario;
import com.enlawebdekaaf.app.entity.Tusuario;
import com.enlawebdekaaf.appAgendaWeb.MiHelper;

@Stateless
public class EjbUsuario implements IEjbUsuario {
	
	private EntityManagerFactory emf = null;
	private EntityManager em =  null;
	private EntityTransaction et = null;
	
	private List<Tusuario> listaUsuario;
	private Tusuario usuario;
	
	public EjbUsuario() {
		
		usuario = new Tusuario();
		
	}

	@Override
	public boolean insert() {
		
		try{
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			String fechaActual = sdf.format(new Date());
			
			usuario.setFechaRegistro(fechaActual);
			usuario.setFechaModificacion(fechaActual);
			
			usuario.setContrasenia(new MiHelper().encrypt(usuario.getContrasenia()));
			
			IDaoUsuario iDaoUsuario = new DaoUsuario();
			
			emf = Persistence.createEntityManagerFactory("appAgendaWeb");
			em = emf.createEntityManager();
			et = em.getTransaction();
			
			et.begin();
			iDaoUsuario.insert(em, usuario);
			et.commit();
			
			return true;
			
		}catch(Exception ex){
			
			if(et != null)
			{
				et.rollback();
			}
			
			System.out.println("Error: " + ex.getMessage());
			
			return false;
		
		}finally{
			
			if(em != null)
			{
				em.close();
				em = null;
			}
			if(emf != null)
			{
				emf.close();
				emf = null;
			}
			
			et = null;
		
		}

	}
	
	@Override
	public List<Tusuario> getListaUsuario() {
		return listaUsuario;
	}
	
	@Override
	public void setListaUsuario(List<Tusuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}
	
	@Override
	public Tusuario getUsuario() {
		return usuario;
	}

	@Override
	public void setUsuario(Tusuario usuario) {
		this.usuario = usuario;
	}
	
}
