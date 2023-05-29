package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TbWallet;

public class WalletDao {
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("WS_WALLET");
		if(entityManager==null)
			entityManager=emf.createEntityManager();
		return entityManager;
	}
	public TbWallet getById(int id) {
		return getEntityManager().find(TbWallet.class, id);
	}
	
	

}
