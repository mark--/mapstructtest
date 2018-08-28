package test.mapstruct.advanced;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdvancedTest {

	@Test
	public void advanced1() throws TooManyItemsException {
		LOG.info("Test started");

		ShoppingCart shoppingCart = new ShoppingCart();

		shoppingCart.setId(43);
		shoppingCart.setDate("03.05.2018 15:34");
		List<Item> items = new LinkedList<>();
		shoppingCart.setItems(items);
		shoppingCart.setType(ShoppingCartType.VIP);

		items.add(
				Item.builder()
						.name("Banana")
						.price(Price.builder().currency("EUR").value(BigDecimal.valueOf(12.3)).build())
						.quantity(2)
						.build());

		items.add(
				Item.builder()
						.name("Orange")
						.price(Price.builder().currency("DOL").value(BigDecimal.valueOf(22.4)).build())
						.quantity(3)
						.build());

		System.out.println(shoppingCart);

		ShoppingCartDTO dto = ShoppingCartMapper.INSTANCE.toDTO(shoppingCart, Locale.GERMANY);

		System.out.println(dto);

		System.out.println(ShoppingCartMapper.INSTANCE.toCart(dto));

	}

	@Test(expected = TooManyItemsException.class)
	public void advanced2() throws TooManyItemsException {
		ShoppingCart shoppingCart = new ShoppingCart();

		shoppingCart.setId(43);
		shoppingCart.setDate("03.05.2018 15:34");
		List<Item> items = new LinkedList<>();
		shoppingCart.setItems(items);
		shoppingCart.setType(ShoppingCartType.VIP);

		items.add(
				Item.builder()
						.name("Banana")
						.price(Price.builder().currency("EUR").value(BigDecimal.valueOf(12.3)).build())
						.quantity(2)
						.build());

		items.add(
				Item.builder()
						.name("Orange")
						.price(Price.builder().currency("DOL").value(BigDecimal.valueOf(22.4)).build())
						.quantity(3)
						.build());

		items.add(
				Item.builder()
						.name("Strawberry")
						.price(Price.builder().currency("EUR").value(BigDecimal.valueOf(12.3)).build())
						.quantity(2)
						.build());

		System.out.println(shoppingCart);

		ShoppingCartDTO dto = ShoppingCartMapper.INSTANCE.toDTO(shoppingCart, Locale.GERMANY);

		System.out.println(dto);

		System.out.println(ShoppingCartMapper.INSTANCE.toCart(dto));

	}

}
