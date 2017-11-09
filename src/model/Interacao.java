package model;



import java.util.*;

import javax.persistence.*;

@Entity
public class Interacao {

	@Id
	private int id;
	
	@Column(length=100)
	private String idContacto;
	
	@Column(length=40)
	private String tipo;//email,carta,reunião...
	
	@Column(length=40)
	private Date data;
	
	
	@Column(length=100)
	private String assunto;
	
	@Column(length=100)
	private String departamento;
	
	@Column(length=100)
	private String resultado;
	
	@Column(length=100)
	private String created_by;
	
	@Column(length=100)
	private String updated_by;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(String idContacto) {
		this.idContacto = idContacto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	
	
	
}
