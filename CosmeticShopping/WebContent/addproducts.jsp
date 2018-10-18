<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Add Products</title>
    </head>
    <body>
    
        <div class="container" style="padding-top:10px; width:50rem;">
         <div class="container">
           	<div class = "jumbotron">
          <form name="form" action="AddProducts" method="post">
        <div class="form-group">
        <label for=""><b>Product Name</b></label>
           <input type="text" class="form-control" id="pname" name="productName" placeholder="Product Name">
    </div>
      <div class="form-group">
         <label for=""><b>Product Price</b></label>
    <input type="number" class="form-control" id="pPrice" name="productPrice" placeholder="Product Price">
      </div>
      <div class="form-group">
       <label for=""><b>Product Description</b></label>
      <input type="text" class="form-control" id="pDiscription" name="productDescription" placeholder="Product Description">
     </div>
      <div class="form-group">
    <label for=""><b>Product Category</b></label>
    <input type="text" class="form-control" id="pCategories" name="productCategory" placeholder="Product Category">
  </div>
   <div class="form-group">
    <label for=""><b>Product Quantity</b></label>
    <input type="text" class="form-control" id="pDiscription" name="productQuantity" placeholder="Product Quantity">
 </div>
 <div class="form-group">
    <label for=""><b>Product Image</b></label>
    <input type="file" class="form-control" id="pImage" name="productImage" placeholder="Product Image">
    </div>
  <br>
   <button type="submit" class="btn btn-block btn-def"><b>Submit</b></button>
  </form>
  </div>
  </div>
  
  
</body>
</html>
            
