package com.example.outsourcers.modelo;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Cliente")
public class Cliente {

	private long id;
	private String nombre;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
