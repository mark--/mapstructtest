package test.mapstruct.advanced;

import java.math.BigDecimal;

public class Price {
	private BigDecimal value;

	private String currency;

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Price [value=" + value + ", currency=" + currency + "]";
	}

}
