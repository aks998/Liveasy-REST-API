package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Exports;

public interface ExportServices {
	
	public List<Exports> getexports();
	
	public Exports getexport(long Id);
	
	public Exports addexport(Exports E);
	
	public Exports updateexports(Exports E);
	
	public void deleteexports(long parseLong);
	

}
