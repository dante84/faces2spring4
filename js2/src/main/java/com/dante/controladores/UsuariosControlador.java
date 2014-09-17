package com.dante.controladores;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name="uc")
@RequestScoped
public class UsuariosControlador implements Serializable {
	 	  
	   private static final long serialVersionUID = 1L;
	   
	   private String comboValor;
	 
	   public String getComboValor() { return comboValor; }

	   public void setComboValor(String comboValor) { this.comboValor = comboValor; }

	   public void goUsuarios(){
		    
		      System.out.println("En irUsuarios");  
		      
		      String ruta = "usuarios";
		      		      	   	   	          
	   }
	   
	   public void test(ActionEvent ae){
		      System.out.println("En uc.test");
		      System.out.println(ae.getSource().toString()); 
	   }
	   
	   
}
