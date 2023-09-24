package com.examen.Dao.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.examen.Dao.IDaoCliente;
import com.examen.Entity.Cliente;

@Repository
@Transactional

public class DaoCliente  implements IDaoCliente{
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Cliente> listar() {
		try {
			List<Cliente> listadoClientes = em.createQuery("FROM Cliente", Cliente.class).getResultList();
			return listadoClientes;
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}


	@Override
	public Cliente actualizar(Cliente cliente) {
		try {
			em.merge(cliente);
			return cliente;
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public Cliente listarPorId(int id) {
		try {
			Cliente cliente = em.find(Cliente.class, id);
			return cliente;
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}


	@Override
	public Cliente guardar(Cliente cliente) {
		try {
			em.persist(cliente);
			return cliente;
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	


}
