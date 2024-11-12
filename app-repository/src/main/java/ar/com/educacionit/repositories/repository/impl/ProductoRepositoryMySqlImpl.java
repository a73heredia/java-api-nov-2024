package ar.com.educacionit.repositories.repository.impl;

import ar.com.educacionit.repositories.dtos.ProductoDTO;
import ar.com.educacionit.repositories.repository.ProductoRepository;

public class ProductoRepositoryMySqlImpl implements ProductoRepository {

	@Override
	public void save(ProductoDTO entitity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductoDTO getById(Long id) {
		String sql = "SELECT * from productos where id=" + id;
		System.out.println(sql);
		
		//simulo que obtengo los datos
		Long _id = id;
		String titulo = "producto simulado de la db";
		Double precio = 1508.75;
		
		//instancion mi producto dto
		
		return new ProductoDTO(_id, titulo, precio);
	}

	@Override
	public ProductoDTO update(ProductoDTO entitity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductoDTO delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
