package interfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.usuario;

@Repository
public interface Iusuario  extends CrudRepository<usuario, Integer>{
	
	List<usuario>find(String nombre);
	List<usuario>findByApellidoPaterno(String apellido);

	

}
