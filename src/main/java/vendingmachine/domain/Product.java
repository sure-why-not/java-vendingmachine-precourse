package vendingmachine.domain;

import java.util.Objects;

public class Product {
	private String name;
	private int cost;

	public Product(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}

	public boolean isSame(String name) {
		return this.name.equals(name);
	}

	public boolean isChipperThanMoney(int money) {
		return cost <= money;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Product product = (Product)o;
		return name.equals(product.name);
	}
}