package test.mapstruct.advanced;

import java.util.List;

import lombok.Data;

@Data
public class ShoppingCart {

	private List<Item> items;

	private int id;

	private String date;

	private ShoppingCartType type;

	private String owner;

}
