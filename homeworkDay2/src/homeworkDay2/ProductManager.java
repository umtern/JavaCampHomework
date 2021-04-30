package homeworkDay2;

public class ProductManager {

	// her sýnýf kendi iþini yapmalý o yüzden product managerý açtýk buraya .
	//ürünlerin yönetimi burayayazýlýr silme ekleme zam vs ...
	
	public void  add(Product product) {
		System.out.println("Yeni ürün eklendi: "  + product.name);
	}
	 //EKLENEN ÜRÜRÜN KONTROLÜ BURADA
	
	public void delete(Product product ) {
		System.out.println("Ürün kaldýrýldý: " + product.name);
	}
	
	
	public void update(Product product){
		System.out.println("Ürüngüncellendi: " + product.detail);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
