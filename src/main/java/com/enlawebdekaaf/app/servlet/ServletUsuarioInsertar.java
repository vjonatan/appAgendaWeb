package com.enlawebdekaaf.app.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.enlawebdekaaf.app.ejb.EjbUsuario;
import com.enlawebdekaaf.app.ejbinterface.IEjbUsuario;

/**
 * Servlet implementation class ServletUsuarioInsertar
 */
@WebServlet("/ServletUsuarioInsertar")
public class ServletUsuarioInsertar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
		
	private IEjbUsuario iEjbUsuario;
	
    public ServletUsuarioInsertar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("usuario/insertar.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			
			iEjbUsuario = new EjbUsuario();
			
			iEjbUsuario.getUsuario().setApellido(request.getParameter("txtApellido"));
			iEjbUsuario.getUsuario().setNombre(request.getParameter("txtNombre"));
			iEjbUsuario.getUsuario().setApellido(request.getParameter("txtApellido"));
			iEjbUsuario.getUsuario().setFechaNacimiento(request.getParameter("dateFechaNac"));
			iEjbUsuario.getUsuario().setCorreoElectronico(request.getParameter("txtCorreoElectronico"));
			iEjbUsuario.getUsuario().setContrasenia(request.getParameter("passContrasenia"));
			
			iEjbUsuario.insert();
			
			request.getRequestDispatcher("usuario/insertar.jsp").forward(request, response);
			
		}catch(Exception ex){
			
			System.out.println("Error:" + ex.getMessage());
			
		}
	}

}
