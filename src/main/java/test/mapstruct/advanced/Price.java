package test.mapstruct.advanced;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Price {
	private BigDecimal value;
	private String currency;
}
