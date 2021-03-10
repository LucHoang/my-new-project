package testthu;

import java.util.Scanner;

public class ProductTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ProductManager list = new ProductManager();
		
		System.out.println("Them san pham");
		list.addProduct();
		
		System.out.println("Edit san pham");	
		list.editProduct();
		
		System.out.println(list);
	}

}
