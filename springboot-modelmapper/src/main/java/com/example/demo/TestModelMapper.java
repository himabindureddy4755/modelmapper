package com.example.demo;

import org.modelmapper.ModelMapper;

public class TestModelMapper {
	public static void main(String[] args) {
		ModelMapper modelMapper = new ModelMapper();
		Order order = new Order(new Customer(new Name("harshitha","reddy")),
								new Address("ymr colony", "proddutur"));
		
		OrderDTO orderDTO = modelMapper.map(order, OrderDTO.class); 
		System.out.println(orderDTO.toString());
		
	}

}
