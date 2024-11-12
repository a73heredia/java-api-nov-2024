package ar.com.educacionit.repositories.dtos;

public class ProductoDTO {
	private Long id;
	private String titulo;
	private Double precio;
	
	public ProductoDTO(Long id, String titulo, Double precio) {
		
		
		this.titulo = titulo;
		this.precio = precio;
		
		setId(id);
		
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		if(id == null || id <0) {
			throw new IllegalArgumentException("Id no puede ser menor a cero");
		}
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}


	public Double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "ProductoDTO [id=" + id + ", titulo=" + titulo + ", precio=" + precio + "]";
	}

	
	
	
	
}
