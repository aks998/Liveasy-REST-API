package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.ExportDao;
import com.springrest.springrest.entities.Exports;

@Service
public class ExportServicesimpl implements ExportServices {
	@Autowired
	public ExportDao exportDao;
	
	
	public ExportServicesimpl() {
		
	}


	public List<Exports> getexports() {
		return exportDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Exports getexport(long Id) {
		return exportDao.getOne(Id);
	}

	@Override
	public Exports addexport(Exports E) {
		exportDao.save(E);
		return E;
	}

	@Override
	public Exports updateexports(Exports E) {
		// TODO Auto-generated method stub
		exportDao.save(E);
		return E;
	}

	@Override
	public void deleteexports(long parseLong) {
		// TODO Auto-generated method stub
		Exports entity = exportDao.getOne(parseLong);
		exportDao.delete(entity);
	}
	

}
