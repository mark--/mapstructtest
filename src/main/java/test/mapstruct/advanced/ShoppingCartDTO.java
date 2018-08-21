package test.mapstruct.advanced;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class ShoppingCartDTO {

	private Integer id;

	private List<String> items;

	private String total;
	private String totalUST;

	private LocalDateTime date;

	private String originalType;

	private String owner;

	private String source;
	private Priority priority;

	enum Priority {
		NORMAL, URGENT
	}

}
