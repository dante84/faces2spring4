package com.dante.controladores;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.dante.daoimpl.LoginDAOImpl;

@ManagedBean(name = "lc")
@RequestScoped
public class LoginControlador { 
	
	   private String nombre;
	   private String apellido;
	
	   @ManagedProperty(value="#{loginDAOImpl}")
	   private LoginDAOImpl loginDAOImpl;
	   	
	   public String getNombre() { return nombre; }

	   public void setNombre(String nombre) { this.nombre = nombre; }

	   public String getApellido() { return apellido; }
	 
	   public void setApellido(String apellido) { this.apellido = apellido; }

	   public void setLoginDAOImpl(LoginDAOImpl loginDAOImpl) { this.loginDAOImpl = loginDAOImpl; }

	   public String logueo(){
		   		       
		      if( loginDAOImpl.verificaLogin(nombre, apellido) ){ return "WEB-INF/xhtml/inicio"; }
		      else{ 
		    	    FacesContext.getCurrentInstance().addMessage("",new FacesMessage("No existes","En la base lelele"));
		    	    return ""; 
		      }
		   
	   }

}
