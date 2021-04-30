package homeworkDay2;

public class Main {

	public static void main(String[] args) {
		
	Product product1 = new Product(); //product classýnda prodcut 1 adýnda bir obje oluþturduk.
		                              // bir adrese ve alana sahip(new ile)
		
	product1.id = 1;
	product1.name = "Iphone 11" ;
	product1.price = 7400 ;
	product1.detail = "64GB,8GB Ram,32Mp"	;
		
	//System.out.println(product1);	// böyle yaparsaak hafýzada kaydettiði adresi ekrana çýkarýr
		
	Product product2 = new Product(2,"Samsung S10",6400,"64GB,4GB Ram,32Mp");
		
		
//	product2.id = 1; bu satýr olmadan da yukarýdaki gibi yazýlabilir
//	product2.name = "Iphone 11" ;
//	product2.price = 7400 ;
//	product2.detail = "64GB,8GB Ram,32Mp"	;
	
	Product product3 = new Product(3,"Huawei Y6",2000,"32GB,2GB Ram,18Mp");
	
  Product[] products= {product1,product2,product3}; // ürünleri liste halinde products ýn içinde sýraladýk.
  //listedeki elemanlarý for döngüsü ile sýrasýyla taratýp yazdýrýyoruz.
  
  for(Product product : products) {
	  System.out.println("\nID:" + product.id); // gibi eklemeler yazýlabilir.
	  System.out.println(product.name);
	  System.out.println(product.price);
	  System.out.println(product.detail);
  }
		
		Category category1 = new Category(1000,"Teknoloji Ürünleri");
		Category category2 = new Category(1001,"Ev Ürünleri");
		Category category3 = new Category(1002,"Bahçe Ürünleri");
		
		System.out.println(category1.categoryName);
		
		// liste olarak yazýp for döngüsüyle yazdýrýrýz.
		
		
		
		
		ProductManager productManager = new ProductManager();
		
		productManager.add(product1);  // ÜRÜN EKLEDÝÐÝMÝZ KOD BURDA
		productManager.delete(product2);
		productManager.update(product3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
