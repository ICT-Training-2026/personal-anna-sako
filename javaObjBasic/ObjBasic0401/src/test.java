
public class test {

	public static void main(String[] args) {
		
		Product prod = new Product();
		prod.name = "キーボード";
		prod.price = 2000;
		
		prod.display();
		
		prod.down(400);
		prod.display();

	}

}
