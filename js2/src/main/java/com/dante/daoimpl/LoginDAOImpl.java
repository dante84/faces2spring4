package com.dante.daoimpl;

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

	   public boolean verificaLogin(String nombre,String apellido){
		   
		      Map<String,Object> valores = loginSP.execute(nombre,apellido);
		      
		      for( Entry<String,Object> entry: valores.entrySet() ){
		    	   System.out.println( entry.getKey() + " || " + entry.getValue() );
		      }
		   		   
		      return false;
		   
	   }
	   
}
