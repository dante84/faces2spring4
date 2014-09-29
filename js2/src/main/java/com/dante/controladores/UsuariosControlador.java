package com.dante.controladores;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import com.dante.daoimpl.LoginDAOImpl;

@ManagedBean(name="uc")
@SessionScoped
public class UsuariosControlador implements Serializable {
	 	  
	   private static final long serialVersionUID = 1L;
	   
	   private Object comboValor;
	   private Object[] usuarios;
	   
	   @ManagedProperty(value="#{loginDAOImpl}")
	   private LoginDAOImpl loginDAOImpl;
	 
	   public Object getComboValor() { return comboValor; }

	   public void setComboValor(Object comboValor) { this.comboValor = comboValor; }
	   	   
	   public Object[] getUsuarios() { return usuarios; }

	   public void setUsuarios(Object[] usuarios) { this.usuarios = usuarios; }

	   public void setLoginDAOImpl(LoginDAOImpl loginDAOImpl) { this.loginDAOImpl = loginDAOImpl; }

	   public String goUsuarios(){
		    
		      System.out.println("En irUsuarios");  
		      
		      String ruta = "usuarios";	
		      setUsuarios(loginDAOImpl.verificaLogin("Daniel","Meza").toArray());
		      
		      return ruta;
		      		      	   	   	          
	   }
	   
	   public void test(ActionEvent ae){
		   
		      System.out.println("En uc.test");
		      System.out.println(ae.getSource().toString());
		      
	   }
	   
	   
}
