<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Ale</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
   
    
    <form method="get" action="<%=request.getContextPath()%>/api/producto">
    	<input type="hidden" name="id" value="1"> 
    	<button>
    		Consultar 
    	</button>
    </form>

    
</body>
</html>
