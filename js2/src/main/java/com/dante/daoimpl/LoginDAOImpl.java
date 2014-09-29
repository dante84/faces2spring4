package com.dante.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import com.dante.dao.LoginDAO;
import com.dante.spsImpl.LoginSPImpl;

public class LoginDAOImpl implements LoginDAO,Serializable{
	
	   private static final long serialVersionUID = 1L;
	   
	   private LoginSPImpl loginSP;
	
	   public void setLoginSP(LoginSPImpl loginSP) { this.loginSP = loginSP; }
	  

	   public ArrayList<Object> verificaLogin(String nombre,String apellido){
		   
		      Map<String,Object> valores = loginSP.execute(nombre,apellido);
		      
		      ArrayList<Object> lista = new ArrayList<Object>();
		      
		      for( Entry<String,Object> entry: valores.entrySet() ){
		    	   lista.add(entry.getValue());
		      }
		      		      		   		  
		      return lista;
		   
	   }
	   
}
