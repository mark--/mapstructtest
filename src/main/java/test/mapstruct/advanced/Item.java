package test.mapstruct.advanced;

public class Item {

	private Price price;
	private int quantity;
	private String name;

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item [price=" + price + ", quantity=" + quantity + ", name=" + name + "]";
	}

}
