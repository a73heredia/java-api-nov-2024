package ar.com.educacionit.services;
import ar.com.educacionit.repositories.dtos.ProductoDTO;

public interface ProductoService {
	
	public ProductoDTO getByID(Long id);
}
