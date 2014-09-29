package com.dante.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dante.beans.UsuarioBean;

public class UsuarioMapper implements RowMapper<UsuarioBean>{

	   public UsuarioBean mapRow(ResultSet rs, int numero) throws SQLException {
		
		      UsuarioBean usuarioBean = new UsuarioBean();
		      
		      usuarioBean.setNombre(rs.getString(0));
		      usuarioBean.setApellido(rs.getString(1));

		      return usuarioBean;
		     
	   }

}
