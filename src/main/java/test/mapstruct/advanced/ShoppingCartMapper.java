package test.mapstruct.advanced;

import java.math.BigDecimal;
import java.util.List;

import org.mapstruct.AfterMapping;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.ValueMapping;
import org.mapstruct.factory.Mappers;

import test.mapstruct.advanced.ShoppingCartDTO.Priority;

@Mapper
public interface ShoppingCartMapper {

	static ShoppingCartMapper INSTANCE = Mappers.getMapper(ShoppingCartMapper.class);

	@Mapping(target = "total", source = "items", qualifiedByName = "woust")
	@Mapping(target = "totalUST", source = "items", qualifiedByName = "ust")
	@Mapping(target = "date", dateFormat = "dd.MM.yyyy HH:mm")
	@Mapping(target = "originalType", source = "type")
	@Mapping(target = "priority", source = "type")
	@Mapping(target = "source", constant = "HR43")
	@Mapping(target = "owner", defaultValue = "system")
	ShoppingCartDTO toDTO(ShoppingCart shoppingCart);

	@Mapping(target = "items", ignore = true)
	@InheritInverseConfiguration
	ShoppingCart toCart(ShoppingCartDTO shoppingCartDTO);

	@AfterMapping
	default void validate() {
		System.out.println("Validating really hard");
	}

	@AfterMapping
	default ShoppingCartDTO validate(@MappingTarget ShoppingCartDTO shoppingCartDTO) {
		System.out.println("Got ShoppingCart");
		return shoppingCartDTO;
	}

	// not called
	@AfterMapping
	default ShoppingCartDTO process(@MappingTarget ShoppingCartDTO shoppingCartDTO) {
		System.out.println("Got ShoppingCart again");
		return shoppingCartDTO;
	}

	@ValueMapping(source = "PLAIN", target = "NORMAL")
	@ValueMapping(source = "VIP", target = "URGENT")
	// @ValueMapping(source = "URGENT", target = "URGENT")
	@ValueMapping(source = "DROP", target = "NORMAL")
	@ValueMapping(source = MappingConstants.NULL, target = "NORMAL")
	Priority priorityMapper(ShoppingCartType shoppingCartType);

	default String itemToString(Item item) {
		return String.format("%s x '%s' je %s %s", item.getQuantity(), item.getName(), item.getPrice().getValue(),
				item.getPrice().getCurrency());

	}

	@Named("woust")
	default String itemTotal(List<Item> items) {
		return items.stream()
				.map(Item::getPrice)
				.map(Price::getValue)
				.reduce(BigDecimal.ZERO, BigDecimal::add)
				.toString();

	}

	@Named("ust")
	default String itemTotalUST(List<Item> items) {
		return items.stream()
				.map(Item::getPrice)
				.map(Price::getValue)
				.reduce(BigDecimal.ZERO, BigDecimal::add)
				.multiply(BigDecimal.valueOf(1.19))
				.toString();

	}

}
