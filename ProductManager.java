package testthu;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
	ArrayList<Product> listProduct = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	
	public void addProduct() {
		System.out.println("Nhap id:");
		String id = input.nextLine();
		
		System.out.println("Nhap name:");
		String name = input.nextLine();
		
		System.out.println("Nhap price:");
		String price = input.nextLine();
		
		Product product = new Product(id, name, price);
		listProduct.add(product);
	}

	public void editProduct() {
		System.out.println("Nhap id san pham muon sua:");
		String id = input.nextLine();
		for(Product product: listProduct) {
			if(product.getId().equals(id)) {
				System.out.println("Nhap name:");
				String name = input.nextLine();
				
				System.out.println("Nhap price:");
				String price = input.nextLine();
				
				product.setName(name);
				product.setPrice(price);
				listProduct.set(listProduct.indexOf(product),product);
			} else {
				System.out.println("Khong tim thay ID");
			}
		}
	}

	@Override
	public String toString() {
		return listProduct + "";
	}
	
	
}
