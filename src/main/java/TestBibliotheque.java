package main.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import main.java.entities.Emprunt;

public class TestBibliotheque {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_jpatp3");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		//*******************
		TypedQuery<Emprunt> requete = em.createQuery("select e from Emprunt e where e.id=2", Emprunt.class);   
		Emprunt res = requete.getSingleResult();
		System.out.println(res);
		//*******************
		et.commit();
		em.close();

	}

}
