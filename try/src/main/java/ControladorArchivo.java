
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.apache.commons.io.FileUtils;
import org.primefaces.model.UploadedFile;

@ManagedBean(name="CArchivo")
@RequestScoped
public class ControladorArchivo {
	
	   private UploadedFile uf;

	   public UploadedFile getUf() { return uf;	}

	   public void setUf(UploadedFile uf) { this.uf = uf; }
	   
	   public void procesaArchivo(){
		    
		      System.out.println(uf.getFileName());
		      
		      try {
				   InputStream is = uf.getInputstream();
				   File archivo = new File("C:\\Users\\daniel\\Desktop\\" + uf.getFileName().trim());
				   
				   FileUtils.copyInputStreamToFile(is,archivo);
				   
			  } catch (IOException e) {	e.printStackTrace(); }
		      
	   }

}
