package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Exports {
	
	@Id
	private long Id;
	private String loadingpoint , unloadingpoint , producttype , date;
	private long weight;
	public Exports(long Id , String loadingpoint, String unloadingpoint, String producttype, String date, long weight) {
		super();
		this.Id = Id;
		this.loadingpoint = loadingpoint;
		this.unloadingpoint = unloadingpoint;
		this.producttype = producttype;
		this.date = date;
		this.weight = weight;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public Exports() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLoadingpoint() {
		return loadingpoint;
	}
	public void setLoadingpoint(String loadingpoint) {
		this.loadingpoint = loadingpoint;
	}
	public String getUnloadingpoint() {
		return unloadingpoint;
	}
	public void setUnloadingpoint(String unloadingpoint) {
		this.unloadingpoint = unloadingpoint;
	}
	public String getProducttype() {
		return producttype;
	}
	@Override
	public String toString() {
		return "MyExports [loadingpoint=" + loadingpoint + ", unloadingpoint=" + unloadingpoint + ", producttype="
				+ producttype + ", date=" + date + ", weight=" + weight + "]";
	}
	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public long getWeight() {
		return weight;
	}
	public void setWeight(long weight) {
		this.weight = weight;
	}
	

}
