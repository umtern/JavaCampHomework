package homeworkDay2;

public class ProductManager {

	// her s�n�f kendi i�ini yapmal� o y�zden product manager� a�t�k buraya .
	//�r�nlerin y�netimi burayayaz�l�r silme ekleme zam vs ...
	
	public void  add(Product product) {
		System.out.println("Yeni �r�n eklendi: "  + product.name);
	}
	 //EKLENEN �R�R�N KONTROL� BURADA
	
	public void delete(Product product ) {
		System.out.println("�r�n kald�r�ld�: " + product.name);
	}
	
	
	public void update(Product product){
		System.out.println("�r�ng�ncellendi: " + product.detail);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
