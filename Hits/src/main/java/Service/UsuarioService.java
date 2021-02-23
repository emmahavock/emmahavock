package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import interfaceService.IUsuarioService;

import interfaces.Iusuario;
import model.usuario;

@Service
public class UsuarioService implements IUsuarioService{

	@Autowired
	private Iusuario data;
	private IUsuarioService usuarioService;
	@Override
	public List<usuario> listar() {
		// TODO Auto-generated method stub
		return (List<usuario>)data.findAll();
	}

	@Override
	public void delete(int id) {
			data.deleteById(id);		
	}

	@Override
	public List<usuario> findName(String nombre) {
		return usuarioService.findName(nombre);
	}

	@Override
	public List<usuario> findApellido(String apellido) {
		return usuarioService.findApellido(apellido);
	}
	
	
}
