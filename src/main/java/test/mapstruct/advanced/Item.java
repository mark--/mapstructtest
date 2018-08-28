package test.mapstruct.advanced;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@Builder
public class Item {
	private Price price;
	private int quantity;
	private String name;

}
