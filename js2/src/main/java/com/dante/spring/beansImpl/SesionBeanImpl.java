package com.dante.spring.beansImpl;

import java.io.Serializable;

import comdante.spring.beans.SesionBean;

public class SesionBeanImpl implements SesionBean,Serializable {
	 	   
	   private static final long serialVersionUID = 1L;
	   
	   private String usuario;
	   private String apellido;
	   
	   public String getUsuario() { return usuario;	}
	   
	   public void setUsuario(String usuario) { this.usuario = usuario; }
	   
	   public String getApellido() { return apellido; }
	   
	   public void setApellido(String apellido) { this.apellido = apellido; }	   	  

}
