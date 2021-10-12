package main.java.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="EMPRUNT")
public class Emprunt {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;	
	
	@ManyToMany
	@JoinTable(name="COMPO",
	joinColumns=@JoinColumn(name="ID_EMP", referencedColumnName="ID"),
	inverseJoinColumns=@JoinColumn(name="ID_LIV", referencedColumnName="ID")
	)
	
	private Set<Livre> livres;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_DEBUT")
	private Date dateDebut;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_FIN")
	private Date dateFIN;	
	
	@Column(name="DELAI")
	private Integer Delai;
	
	

	//*********Fin des annotations*******************
	
	public Emprunt() {
		super();
	}

	public Emprunt(Date dateDebut, Date dateFIN, int delai) {
		super();
		this.dateDebut = dateDebut;
		this.dateFIN = dateFIN;
		Delai = delai;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFIN() {
		return dateFIN;
	}

	public void setDateFIN(Date dateFIN) {
		this.dateFIN = dateFIN;
	}

	public int getDelai() {
		return Delai;
	}

	public void setDelai(int delai) {
		Delai = delai;
	}

	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", dateDebut=" + dateDebut + ", dateFIN=" + dateFIN + ", Delai=" + Delai + "]";
	} 
	
	

}
