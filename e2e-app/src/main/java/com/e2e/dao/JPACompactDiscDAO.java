package com.e2e.dao;

import java.util.Collection;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.persistence.*;

import com.e2e.entities.CompactDisc;

@Stateless
public class JPACompactDiscDAO implements CompactDiscDAO{
	
	@PersistenceContext
	private EntityManager em;
	
	public Collection<CompactDisc> getAllDiscs() {
		Query query = em.createQuery("from CompactDisc");
		List<CompactDisc> discs = query.getResultList(); 
		return discs;
	}

	public void addCompactDisc(CompactDisc disc) {
		Query query = em.createQuery("from CompactDisc");
		List<CompactDisc> discs = query.getResultList(); 
		if (!discs.contains(disc)){
			em.persist(disc);
		}
	}

}
