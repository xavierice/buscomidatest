package edu.cibertec.buscomida.mantenimiento.persistence;

import java.io.Serializable;
import javax.persistence.*;

import org.primefaces.model.StreamedContent;

import edu.cibertec.buscomida.seguridad.persistence.UsuarioEntity;
import edu.cibertec.buscomida.util.persistence.MembresiaEntity;

import java.util.Set;

/**
 * The persistent class for the restaurante database table.
 * 
 */
@Entity
@Table(name = "restaurante")
public class RestauranteEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_rest")
	private int idRest;

	private String descripcion;

	private String email;

	private String estado;

	private String foto;

	@Column(name = "nombre_mostrar")
	private String nombreMostrar;

	private String razon;

	private String ruc;

	// bi-directional many-to-one association to Membresia
	@OneToMany(mappedBy = "restaurante")
	private Set<MembresiaEntity> membresias;

	// bi-directional many-to-one association to Plato
	@OneToMany(mappedBy = "restaurante")
	private Set<PlatoEntity> platos;

	// bi-directional many-to-one association to Sucursal
	@OneToMany(mappedBy = "restaurante")
	private Set<SucursalEntity> sucursals;

	// bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy = "restaurante")
	private Set<UsuarioEntity> usuarios;

	@Transient
	private byte[] fotoRestaurante;

	public RestauranteEntity() {
	}

	public byte[] getFotoRestaurante() {
		return fotoRestaurante;
	}

	public void setFotoRestaurante(byte[] fotoRestaurante) {
		this.fotoRestaurante = fotoRestaurante;
	}

	public int getIdRest() {
		return this.idRest;
	}

	public void setIdRest(int idRest) {
		this.idRest = idRest;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombreMostrar() {
		return this.nombreMostrar;
	}

	public void setNombreMostrar(String nombreMostrar) {
		this.nombreMostrar = nombreMostrar;
	}

	public String getRazon() {
		return this.razon;
	}

	public void setRazon(String razon) {
		this.razon = razon;
	}

	public String getRuc() {
		return this.ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public Set<MembresiaEntity> getMembresias() {
		return this.membresias;
	}

	public void setMembresias(Set<MembresiaEntity> membresias) {
		this.membresias = membresias;
	}

	public Set<PlatoEntity> getPlatos() {
		return this.platos;
	}

	public void setPlatos(Set<PlatoEntity> platos) {
		this.platos = platos;
	}

	public Set<SucursalEntity> getSucursals() {
		return this.sucursals;
	}

	public void setSucursals(Set<SucursalEntity> sucursals) {
		this.sucursals = sucursals;
	}

	public Set<UsuarioEntity> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set<UsuarioEntity> usuarios) {
		this.usuarios = usuarios;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

}