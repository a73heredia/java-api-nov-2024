package ar.com.educacionit.repositories.repository;


import ar.com.educacionit.repositories.dtos.ProductoDTO;

public interface ProductoRepository {
	
	public void save(ProductoDTO entitity);
	public ProductoDTO getById(Long id);
	public ProductoDTO update(ProductoDTO entitity);
	public ProductoDTO delete(Long id);
}
