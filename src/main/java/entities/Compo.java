package main.java.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMPO")
public class Compo {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	
	@Column(name="ID_LIV")
	private Integer idLiv;
	
	@Column(name="ID_EMP")
	private Integer idEmp;

	public Compo() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdLiv() {
		return idLiv;
	}

	public void setIdLiv(Integer idLiv) {
		this.idLiv = idLiv;
	}

	public Integer getIdEmp() {
		return idEmp;
	}

	public void setIdEmp(Integer idEmp) {
		this.idEmp = idEmp;
	}

	@Override
	public String toString() {
		return "Compo [id=" + id + ", idLiv=" + idLiv + ", idEmp=" + idEmp + "]";
	}
	
	

}
