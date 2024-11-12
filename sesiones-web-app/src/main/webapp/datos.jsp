<%@page import="ar.com.educacionit.repositories.dtos.ProductoDTO"%>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Datos</title>
    
</head>
<body>
   
    
    <%		//DEBO CASTEAR DE OBJECT A MI OBJETO
    		ProductoDTO producto = (ProductoDTO)session.getAttribute("PRODUCTO");
    
    %>
    
    <div>
    	<label>ID: </label> <%=producto.getId() %>
    	<label>Precio: </label> <%=producto.getPrecio() %>
    	<label>Titulo: </label> <%=producto.getTitulo() %>
    </div>
    
</body>
</html>
