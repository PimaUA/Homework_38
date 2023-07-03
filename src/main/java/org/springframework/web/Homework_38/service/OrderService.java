package org.springframework.web.Homework_38.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.Homework_38.entities.Order;
import org.springframework.web.Homework_38.repository.OrderRepository;

import java.util.List;
import java.util.Optional;

@Component
@Scope("prototype")
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(int id) {
        Order order;
        Optional<Order> optionalOrder = orderRepository.findById(id);
        if (optionalOrder.isPresent()) {
            order = optionalOrder.get();
        } else {
            throw new RuntimeException();
        }
        return order;
    }

    public void addOrder(Order order) {
        orderRepository.save(order);
    }

    public void deleteOrder(int id) {
        orderRepository.deleteById(id);
    }
}
