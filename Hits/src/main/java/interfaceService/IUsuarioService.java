package interfaceService;

import java.util.List;

import model.usuario;

public interface IUsuarioService {
	public List<usuario>listar();
	public void delete (int id);
	List<usuario> findName(String  nombre);
	List<usuario> findApellido(String  apellido);


}
