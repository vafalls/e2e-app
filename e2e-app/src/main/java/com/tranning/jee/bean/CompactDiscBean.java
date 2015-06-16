package com.tranning.jee.bean;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;

import com.training.jee.demo.entities.CompactDisc;

@Stateless
public class CompactDiscBean implements CompactDiscLocal {

	public CompactDiscBean() {
		// TODO Auto-generated constructor stub
	}
	
	private static Map<Integer, CompactDisc> library;
	
	static {
		library = new HashMap<Integer, CompactDisc>();
		library.put(1,  new CompactDisc(1, "Europe", "Final Countdown", 30.99, 8));
		library.put(1,  new CompactDisc(1, "Abba", "Abba Gold", 31.99, 12));
		library.put(1,  new CompactDisc(1, "Spice Girls", "Spice World", 42.99, 9));
		
	}


	public Collection<CompactDisc> getDiscs() {
		// TODO Auto-generated method stub
		return library.values();
	}

}
