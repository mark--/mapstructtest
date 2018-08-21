package test.mapstruct.advanced;

import java.time.LocalDateTime;
import java.util.List;

public class ShoppingCartDTO {

	private Integer id;

	private List<String> items;

	private String total;
	private String totalUST;

	private LocalDateTime date;

	private String originalType;

	private String owner;

	private String source;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	enum Priority {
		NORMAL, URGENT
	}

	private Priority priority;

	public String getOriginalType() {
		return originalType;
	}

	public void setOriginalType(String originalType) {
		this.originalType = originalType;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getTotalUST() {
		return totalUST;
	}

	public void setTotalUST(String totalUST) {
		this.totalUST = totalUST;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "ShoppingCartDTO [id=" + id + ", items=" + items + ", total=" + total + ", totalUST=" + totalUST
				+ ", date=" + date + ", originalType=" + originalType + ", owner=" + owner + ", source=" + source
				+ ", priority=" + priority + "]";
	}

}
