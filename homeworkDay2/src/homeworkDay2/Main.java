package homeworkDay2;

public class Main {

	public static void main(String[] args) {
		
	Product product1 = new Product(); //product class�nda prodcut 1 ad�nda bir obje olu�turduk.
		                              // bir adrese ve alana sahip(new ile)
		
	product1.id = 1;
	product1.name = "Iphone 11" ;
	product1.price = 7400 ;
	product1.detail = "64GB,8GB Ram,32Mp"	;
		
	//System.out.println(product1);	// b�yle yaparsaak haf�zada kaydetti�i adresi ekrana ��kar�r
		
	Product product2 = new Product(2,"Samsung S10",6400,"64GB,4GB Ram,32Mp");
		
		
//	product2.id = 1; bu sat�r olmadan da yukar�daki gibi yaz�labilir
//	product2.name = "Iphone 11" ;
//	product2.price = 7400 ;
//	product2.detail = "64GB,8GB Ram,32Mp"	;
	
	Product product3 = new Product(3,"Huawei Y6",2000,"32GB,2GB Ram,18Mp");
	
  Product[] products= {product1,product2,product3}; // �r�nleri liste halinde products �n i�inde s�ralad�k.
  //listedeki elemanlar� for d�ng�s� ile s�ras�yla tarat�p yazd�r�yoruz.
  
  for(Product product : products) {
	  System.out.println("\nID:" + product.id); // gibi eklemeler yaz�labilir.
	  System.out.println(product.name);
	  System.out.println(product.price);
	  System.out.println(product.detail);
  }
		
		Category category1 = new Category(1000,"Teknoloji �r�nleri");
		Category category2 = new Category(1001,"Ev �r�nleri");
		Category category3 = new Category(1002,"Bah�e �r�nleri");
		
		System.out.println(category1.categoryName);
		
		// liste olarak yaz�p for d�ng�s�yle yazd�r�r�z.
		
		
		
		
		ProductManager productManager = new ProductManager();
		
		productManager.add(product1);  // �R�N EKLED���M�Z KOD BURDA
		productManager.delete(product2);
		productManager.update(product3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
