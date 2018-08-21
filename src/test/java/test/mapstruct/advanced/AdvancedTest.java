package test.mapstruct.advanced;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import org.junit.Test;

public class AdvancedTest {

	@Test
	public void advanced1() {
		ShoppingCart shoppingCart = new ShoppingCart();

		shoppingCart.setId(43);
		shoppingCart.setDate("03.05.2018 15:34");
		List<Item> items = new LinkedList<>();
		shoppingCart.setItems(items);
		shoppingCart.setType(ShoppingCartType.VIP);

		{
			Item item = new Item();
			item.setName("Banane");
			Price price = new Price();
			price.setCurrency("EUR");
			price.setValue(BigDecimal.valueOf(12.3));
			item.setPrice(price);
			item.setQuantity(2);
			items.add(item);
		}

		{
			Item item = new Item();
			item.setName("Orange");
			Price price = new Price();
			price.setCurrency("DOL");
			price.setValue(BigDecimal.valueOf(16.5));
			item.setPrice(price);
			item.setQuantity(3);
			items.add(item);
		}

		System.out.println(shoppingCart);

		ShoppingCartDTO dto = ShoppingCartMapper.INSTANCE.toDTO(shoppingCart, Locale.GERMANY);

		System.out.println(dto);

		System.out.println(ShoppingCartMapper.INSTANCE.toCart(dto));

	}

}
