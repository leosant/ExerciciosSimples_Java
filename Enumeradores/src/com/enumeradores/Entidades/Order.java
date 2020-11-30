package com.enumeradores.Entidades;

import java.util.ArrayList;
import java.util.Date;

import com.enumeradores.Enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	private ArrayList<OrderItem> orderItem = new ArrayList<>();
	
	private Client client;
	
	public Order() {
	}
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	protected ArrayList<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void addOrderItem(OrderItem order) {
		this.orderItem.add(order);
	}
	
	public void removeOrderItem(OrderItem order) {
		this.orderItem.remove(order);
	}
	
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public Double total() {
		Double total = 0.0;
		for(OrderItem x : getOrderItem()) {
			total += x.subTotal();
		}
		return total;
	}
	
	public String toString() {
		return "Order Moment: "+Client.format.format(getMoment())+
				"\nOrder Status: "+getStatus()+"\n"
				+getClient().toString()+"\n"
				+"Order Items: \n"
				+getOrderItem().toString()+"\n"
				+"Total: "+total();
	}
}
