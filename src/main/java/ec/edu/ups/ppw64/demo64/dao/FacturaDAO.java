package ec.edu.ups.ppw64.demo64.dao;

import java.util.List;

import ec.edu.ups.ppw64.demo64.model.CabecerasFacturas;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class FacturaDAO {
	
	@PersistenceContext
	private EntityManager em;

	public void insert(CabecerasFacturas factura) {
		em.persist(factura);
	}
		
	public void update(CabecerasFacturas factura) {
		em.merge(factura);	
	}

	public void remove(int codigo) {
		CabecerasFacturas factura = em.find(CabecerasFacturas.class, codigo);
		em.refresh(factura);
	}
	
	public CabecerasFacturas read(int codigo) {
		CabecerasFacturas factura = em.find(CabecerasFacturas.class, codigo);
		return factura;
	}
	
	public List<CabecerasFacturas> getAll(){
		String jpql = "SELECT f FROM CabecerasFacturas f";
		Query q = em.createQuery(jpql, CabecerasFacturas.class);
		return q.getResultList();
	}
	
	public List<CabecerasFacturas> getFacturasPorCodigoUsuario(int codigoUsuario) {
        return em.createQuery("SELECT f FROM CabecerasFacturas f WHERE f.usuario.codigo = :codigoUsuario", CabecerasFacturas.class)
                .setParameter("codigoUsuario", codigoUsuario)
                .getResultList();
    }

}




