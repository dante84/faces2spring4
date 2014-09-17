package com.dante.daoimpl;

import java.awt.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import com.dante.dao.LoginDAO;
import com.dante.spring.beansImpl.SesionBeanImpl;
import com.dante.spsImpl.LoginSPImpl;

public class LoginDAOImpl implements LoginDAO{
	
	   private SesionBeanImpl sesionBean;
	   private LoginSPImpl loginSP;
	
	   public void setSesionBean(SesionBeanImpl sesionBean) { this.sesionBean = sesionBean; }

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
