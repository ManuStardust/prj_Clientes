package com.example.manuelagalzerano.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.manuelagalzerano.entities.Cliente;
import com.example.manuelagalzerano.repositories.ClienteRepository;

@Service
public class ClienteService {
	private final ClienteRepository clienteRepository;

	@Autowired
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);

	}

	public Cliente getClienteById(Long idcCliente) {
		return clienteRepository.findById(idcCliente).orElse(null);

	}

	public List<Cliente> getAllCliente() {
		return clienteRepository.findAll();
	}

	public void deleteCliente(Long idcCliente) {
		clienteRepository.deleteById(idcCliente);
	}

}
