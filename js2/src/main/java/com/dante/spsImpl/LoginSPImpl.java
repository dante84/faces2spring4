package com.dante.spsImpl;

import java.sql.Types;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import com.dante.mappers.UsuarioMapper;
import com.dante.sps.LoginSP;

public class LoginSPImpl extends StoredProcedure implements LoginSP{
	
	   public LoginSPImpl(){}
	   
	   public LoginSPImpl(DataSource ds){
		   
		      super(ds,"verificaLogin");
		      
//		      declareParameter(new SqlParameter("usuario",Types.VARCHAR));
//		      declareParameter(new SqlParameter("ap",Types.VARCHAR));
		   
		      compile();    
		    		     
	   }
	   
	   public Map<String,Object> execute(String usuario,String apellido){
		      
		      System.out.println("En el execute " + usuario + " || " + apellido);
		   
		      Map<String, Object> rs = super.execute();
		      
		      return rs;
		      
	   }

}
