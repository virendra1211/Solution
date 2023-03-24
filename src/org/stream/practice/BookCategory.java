package org.stream.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class BookCategory {

	public static void main(String[] args) {
		List<Product> listOfProducts = Arrays.asList(new Product("book",33),
				new Product("electric",11),new Product("book",12),
				new Product("book",15),new Product("book",25),
				new Product("book",35),
				new Product("electric",15),
				new Product("electric",65));
		// I option
		Optional<Product> op = listOfProducts.stream().filter(p ->p.getCategory().equals("book")).
				sorted(Comparator.comparing(Product::getPrice)).skip(1).findFirst();
		System.out.println(op);
		
		// II option
		Optional<Product> result= listOfProducts.stream().filter(p ->p.getCategory().equals("book"))
				.min(Comparator.comparingInt(Product::getPrice));
		System.out.println(result);
		
	}

}


class Product {
	@Override
	public String toString() {
		return this.getCategory()+" - "+this.getPrice();
	}
	private String category;
	private Integer price;

	public Product(String category, Integer price) {
		super();
		this.category = category;
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}


}