package com.examen.Dao;

import java.util.List;

import com.examen.Entity.Cliente;

public interface IDaoCliente {
	public List<Cliente> listar();
	public Cliente guardar (Cliente cliente);
	public Cliente actualizar(Cliente cliente);
	public Cliente listarPorId(int id);

}
