package ar.com.educacionit.services;

import ar.com.educacionit.repositories.dtos.ProductoDTO;
import ar.com.educacionit.repositories.repository.ProductoRepository;
import ar.com.educacionit.repositories.repository.impl.ProductoRepositoryMySqlImpl;

public class ProductoServiceImpl implements ProductoService {
	
	
	//atributo de tipo interface
	private ProductoRepository repository;
	
	public ProductoServiceImpl() {
		inyectarClases();
	}
	
	public void inyectarClases() {
		
		this.repository = new ProductoRepositoryMySqlImpl();
	}
	
	@Override
	public ProductoDTO getByID(Long id) {
		// Ahora si accedo a la db por medio del repository
		return this.repository.getById(id);
	}
	
}
