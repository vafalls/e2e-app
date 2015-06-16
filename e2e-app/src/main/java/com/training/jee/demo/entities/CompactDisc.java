package com.training.jee.demo.entities;

import java.io.Serializable;

public class CompactDisc implements Serializable {
	
	private Integer id;
	private Double price;
	private Integer tracks;
	private String title;
	private String artist;
	
	
	public CompactDisc() {
		super();
	}
	public CompactDisc(Integer id, String title, String artist, Double price,
			Integer tracks) {
		super();
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.tracks = tracks;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getTracks() {
		return tracks;
	}
	public void setTracks(Integer tracks) {
		this.tracks = tracks;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	

}
