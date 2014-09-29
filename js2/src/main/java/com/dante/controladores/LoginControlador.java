package com.dante.controladores;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.dante.daoimpl.LoginDAOImpl;

@ManagedBean(name = "lc")
@SessionScoped
public class LoginControlador implements Serializable{ 
		   
	   private static final long serialVersionUID = 1L;
	   
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
		    		      		    
		   	  Object[] arreglo = loginDAOImpl.verificaLogin(nombre, apellido).toArray();
		      if( arreglo.length > -1 ){ return "WEB-INF/xhtml/inicio"; }
		      else{ 
		    	    FacesContext.getCurrentInstance().addMessage("",new FacesMessage("No existes","En la base lelele"));
		    	    return "index"; 
		      }
		   
	   }

}
