package edu.cibertec.buscomida.util.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="correlativo")
public class CorrelativoEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="tabla")
	private String tabla;
	
	@Column(name="id")
	private int id;

	public String getTabla() {
		return tabla;
	}
	public void setTabla(String tabla) {
		this.tabla = tabla;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
