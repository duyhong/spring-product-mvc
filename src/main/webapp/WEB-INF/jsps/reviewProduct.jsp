<!DOCTYPE html>
<html lang="en">
<head>
  <title>Review Product</title>
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
  
  <form action="${pageContext.request.contextPath}/save-review-product" method="post">
  
  <p>User Product Review Page</p>            
  <table class="table table-bordered">
    <tbody>
      <tr>
        <td>Name</td>
        <td>${product.name}
         <input type="hidden" value="${product.name}" name="name"/>
        </td>
      </tr>
       <tr>
        <td>Color</td>
         <td>${product.color}
          <input type="hidden" value="${product.color}" name="color"/>
         </td>
      </tr>
      <tr>
        <td>Type</td>
         <td>${product.type}
           <input type="hidden" value="${product.type}" name="type"/>
         </td>
      </tr>
      <tr>
        <td>Price</td>
         <td>${product.price}
          <input type="hidden" value="${product.price}" name="price"/>
         </td>
      </tr>
      
      <tr>
        <td>Description</td>
        <td>${product.description}
         <input type="hidden" value="${product.description}" name="description"/>
        </td>
      </tr>
      
      <tr>
        <td>Size</td>
        <td>${product.size}  
         <input type="hidden" value="${product.size}" name="size"/>
        </td>
      </tr>
      
      <tr>
        <td>Photo</td>
        <td> <img src="${product.photo}" style="height: 130px;">  
         <input type="hidden" value="${product.photo}" name="photo"/>
        </td>
      </tr>
      
      <tr>
        <td><button type="button" class="btn btn-danger btn-lg">Back!</button></td>
        <td align="right">
          <button type="submit" class="btn btn-primary btn-lg">Save!</button>  
          <a href="${pageContext.request.contextPath}/">
            <button type="button" class="btn btn-primary btn-lg">Show Products!</button>
          </a>
        </td>
      </tr>
      
    </tbody>
  </table>
  </form>
</div>


</body>
</html>
