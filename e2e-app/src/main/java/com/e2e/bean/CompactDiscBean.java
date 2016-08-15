package com.e2e.bean;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.e2e.dao.CompactDiscDAO;
import com.e2e.dao.JPACompactDiscDAO;
import com.e2e.entities.CompactDisc;

@Stateless
public class CompactDiscBean implements CompactDiscLocal {

	@Inject
	private CompactDiscDAO cd_dao;
	
	public Collection<CompactDisc> getDiscs() {
		// TODO Auto-generated method stub
		
		return cd_dao.getAllDiscs();
	}
	
	public void addNewDisc(String posted_string) {
		// TODO Auto-generated method stub
		System.out.println("now in the bean "+posted_string);
		//cd_dao.addCompactDisc(null);
	}

}
