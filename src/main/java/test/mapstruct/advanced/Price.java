package test.mapstruct.advanced;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Price {
	private BigDecimal value;
	private String currency;
}
