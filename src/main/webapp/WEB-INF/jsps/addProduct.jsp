<%@ taglib uri="http://www.springframework.org/tags/form" prefix="duy"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Add Product</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Learning Spring 5.x MVC!</h2>
  <img src="${pageContext.request.contextPath}/images/1.jpg" style="height: 130px;">
  <form action="${pageContext.request.contextPath}/add-product" method="post">
    <div class="form-group">
      <label for="name">Product Name:</label>
      <input type="text" class="form-control" id="name" placeholder="Enter Name" name="name">
    </div>
    <div class="form-group">
      <label for="color">Color:</label>
      <input type="text" class="form-control" id="color" placeholder="Enter color" name="color">
    </div>
    
     <div class="form-group">
      <label for="type">Type:</label>
      <input type="text" class="form-control" id="type" placeholder="Enter type" name="type">
    </div>
    
    <div class="form-group">
      <label for="price">Price:</label>
      <input type="text" class="form-control" id="price" placeholder="Enter price" name="price">
    </div>
    
    <div class="form-group">
      <label for="description">Description:</label>
      <input type="text" class="form-control" id="description" placeholder="Enter description" name="description">
    </div>
    
     <div class="form-group">
      <label for="size">Size:</label>
      <select class="form-control" id="size"  name="size" style="width: 50%;">
        <c:forEach items="${sizes}" var="pitem">
      			<option>${pitem}</option>
      	</c:forEach>
      </select>
    </div>
    
     <div class="form-group">
      <label for="photo">Photo:</label>
      <input type="text" class="form-control" id="photo"  name="photo">
    </div>
    
    
    <button type="submit" class="btn btn-primary btn-lg">Submit!</button>
    <a href="${pageContext.request.contextPath}/">
        <button type="button" class="btn btn-warning btn-lg">Show Products!</button> 
    </a>
  </form>
</div>

</body>
</html>
