package com.e2e.bean;

import java.util.Collection;

import com.e2e.entities.CompactDisc;

public interface CompactDiscLocal {
	public Collection<CompactDisc> getDiscs();
	public void addNewDisc(String posted_string);
}
