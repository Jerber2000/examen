package com.examen.Controllers;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.Dao.IDaoCliente;
import com.examen.Entity.Cliente;

@RestController
@RequestMapping (value ="/api")

public class ClienteController {
	@Autowired
	private IDaoCliente daoCliente ;

	@GetMapping(value = "/cliente", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Cliente> listarClientes(){
		return daoCliente.listar();
	}
	
	@PostMapping(value = "/cliente", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Cliente guardarCliente(@RequestBody Cliente cliente) {
		return daoCliente.guardar(cliente);
	}
	
	@PutMapping(value = "/cliente", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Cliente actualizarCliente(@RequestBody Cliente cliente) {
		return daoCliente.actualizar(cliente);
	}
	
	@GetMapping(value = "/cliente/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Cliente listarPorId(@PathVariable int id) {
		return daoCliente.listarPorId(id);
	}
}
