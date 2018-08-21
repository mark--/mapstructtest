package test.mapstruct.advanced;

import java.util.List;

public class ShoppingCart {

	private List<Item> items;

	private int id;

	private String date;

	private ShoppingCartType type;

	private String owner;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public ShoppingCartType getType() {
		return type;
	}

	public void setType(ShoppingCartType type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ShoppingCart [items=" + items + ", id=" + id + ", date=" + date + ", type=" + type + ", owner=" + owner
				+ "]";
	}

}
