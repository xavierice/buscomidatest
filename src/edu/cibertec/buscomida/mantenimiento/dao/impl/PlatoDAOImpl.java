package edu.cibertec.buscomida.mantenimiento.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.cibertec.buscomida.mantenimiento.dao.PlatoDAO;
import edu.cibertec.buscomida.mantenimiento.persistence.PlatoEntity;

public class PlatoDAOImpl implements PlatoDAO {

	public boolean grabar(PlatoEntity plato) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean modificar(PlatoEntity plato) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean anular(PlatoEntity plato) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public List listarPlatos(String condicionPlato, String condicionDistrito,
			String condicionPrecio) throws Exception {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Buscomida");
		;
		EntityManager em = emf.createEntityManager();
		Query q;
		List listPlatos;
		System.out.println("ValorEnListaBBBr:" + condicionPlato);
		// if (condicionPlato == "") {
		// System.out.println("En vacio");
		// q =
		// em.createQuery("SELECT a FROM PlatoEntity a ORDER by a.votopromedio desc");
		// listPlatos = q.getResultList();
		// } else {
		System.out.println("RP" + condicionPrecio);
		if (condicionPrecio==null||condicionPrecio.equals("000")) {
			System.out.println("En no vacio");
			q = em.createQuery("SELECT a FROM PlatoEntity a where a.nombremostrar LIKE :condicionPlato ORDER by a.votopromedio desc");
			q.setParameter("condicionPlato", "%" + condicionPlato + "%");
			listPlatos = q.getResultList();
		} else {
			System.out.println("En no vacio");
			q = em.createQuery("SELECT a FROM PlatoEntity a join a.rangoprecio r where a.nombremostrar LIKE :condicionPlato AND r.idRango = :condicionPrecio ORDER by a.votopromedio desc");
			q.setParameter("condicionPlato", "%" + condicionPlato + "%");
			q.setParameter("condicionPrecio", Integer.parseInt(condicionPrecio));
			listPlatos = q.getResultList();

		}
		// }
		System.out.println("HOLA MUNDO77332");
		// Query q =
		// em.createQuery("SELECT a FROM PlatoEntity a where a.nombremostrar LIKE :condicionPlato ORDER by a.votopromedio desc");

		// q.setParameter("condicionPlato", "%"+query+"%");
		// Query q =
		// em.createQuery("SELECT c FROM PlatoEntity c where c.nombremostrar LIKE :nombre");
		// q.setParameter("nombre", "%"+query+"%");
		// q.setParameter("condicionDistrito", "%"+condicionDistrito+"%");
		// List listPlatos = q.getResultList();
		System.out.println("Cantidad de Platos :" + listPlatos.size());
		return listPlatos;
	}

	public PlatoEntity buscarPLato(int idPlato) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
