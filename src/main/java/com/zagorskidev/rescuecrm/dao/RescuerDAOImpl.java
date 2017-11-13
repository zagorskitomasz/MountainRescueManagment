package com.zagorskidev.rescuecrm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zagorskidev.rescuecrm.entity.Rescuer;

@Repository
@Transactional
public class RescuerDAOImpl extends AbstractDAO<Rescuer> implements RescuerDAO {

	@Override
	public List<Rescuer> getSpecific(String state) {
		
		Session currentSession = getSessionFactory().getCurrentSession();
		Query<Rescuer> query = currentSession
				.createQuery("from Rescuer where state=:itemState order by lastName", Rescuer.class)
				.setParameter("itemState", state);
		return query.getResultList();
	}
	
	@Override
	public List<Rescuer> getAll() {
		
		Session currentSession = getSessionFactory().getCurrentSession();
		Query<Rescuer> query = currentSession
				.createQuery("from Rescuer order by id desc", Rescuer.class);
		return query.getResultList();
	}
}
