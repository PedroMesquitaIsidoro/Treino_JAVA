package entities;

import java.sql.Date;

import entities.enums.OrderStatus;

public class Produto {
	
	private Integer id;
	private OrderStatus status;
	
	
	
	public Produto(Integer id, OrderStatus status) {
		this.id = id;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", status=" + status + "]";
	}
	
	
	
	

}
