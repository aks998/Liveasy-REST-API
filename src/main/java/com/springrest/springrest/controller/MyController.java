package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Exports;
import com.springrest.springrest.services.ExportServices;

@RestController
public class MyController {
	
	private ExportServices export;
	
	@GetMapping("/exporting")
	public List<Exports> getexports() {
		return this.export.getexports();
	}
	
	@GetMapping("/exporting/{ExportId}")
	public Exports getexport(@PathVariable String ExportId) 
	{
		return this.export.getexport(Long.parseLong(ExportId));
	}
	
	@PostMapping("/exporting")
	public Exports addexport(@RequestBody Exports E) {
		return this.export.addexport(E);
	}
	
	@PutMapping("/exporting") 
	public Exports updateexports(@RequestBody Exports E) {
		return this.export.updateexports(E);
	}
	
	@DeleteMapping("/exporting/{Id}")
	public ResponseEntity<HttpStatus> deleteexports(@PathVariable String Id) 
	{
		try {
			this.export.deleteexports(Long.parseLong(Id));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); 
		}
	}
	
	

}
