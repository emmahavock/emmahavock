package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="usuario")
public class usuario {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public int idUSuario;
	public int idPerfil;
	public String nombre;
	public String apPaterno;
	public String apMaterno;
	
	
	
	
	
	public int getIdUSuario() {
		return idUSuario;
	}
	public void setIdUSuario(int idUSuario) {
		this.idUSuario = idUSuario;
	}
	public int getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApPaterno() {
		return apPaterno;
	}
	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}
	public String getApMaterno() {
		return apMaterno;
	}
	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}
	
	
	
	
	
}
