
public class ProductYes2 {
private long id;
private String productName;
private String supplierName;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getSupplierName() {
	return supplierName;
}
public void setSupplierName(String supplierName) {
	this.supplierName = supplierName;
}
public ProductYes2(long id, String productName, String supplierName) {
	super();
	this.id = id;
	this.productName = productName;
	this.supplierName = supplierName;
}
public void display(){
	System.out.println("id" +id);
	System.out.println("productName" +productName);
	System.out.println("supplierName" +supplierName);
	
}
}
