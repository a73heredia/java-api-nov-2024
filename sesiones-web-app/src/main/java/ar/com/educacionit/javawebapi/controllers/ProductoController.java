package ar.com.educacionit.javawebapi.controllers;

import java.io.IOException;

import ar.com.educacionit.repositories.dtos.ProductoDTO;
import ar.com.educacionit.services.ProductoService;
import ar.com.educacionit.services.ProductoServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//convierto en WebServlet
@WebServlet("/api/producto")
public class ProductoController extends HttpServlet{
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Busca un producto en la db por su id
		//Capturo parametro desde req
		String id = req.getParameter("id");
		Long idL = Long.parseLong(id);
		
		
		//ahora instancion el servicio
		//super.doGet(req, resp);
		ProductoService service = new ProductoServiceImpl();
		ProductoDTO productoDto = service.getByID(idL);
		
		//propio de los servlets
		//resp.getWriter().print(productoDto);
		
		//guardo en la sesion el objeto
		req.getSession().setAttribute("PRODUCTO", productoDto);
		getServletContext().getRequestDispatcher("/datos.jsp").forward(req, resp);
	}
	
}
