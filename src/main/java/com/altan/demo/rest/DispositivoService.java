package com.altan.demo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.altan.demo.model.Dispositivo;

@RestController
@RequestMapping("/api")
public class DispositivoService {
	
	@RequestMapping(path="/device/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getDispositivo(@PathVariable("id") long numeroSerie){
		
		Dispositivo dispositivo = new Dispositivo();
		dispositivo.setDescripcion("Lo nuevo de Apple");
		dispositivo.setMarca("Apple");
		dispositivo.setModelo("Iphone X");
		dispositivo.setNumeroSerie(numeroSerie);
		return ResponseEntity.ok(dispositivo);
	}
}