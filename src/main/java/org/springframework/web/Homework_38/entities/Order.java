package org.springframework.web.Homework_38.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Entity(name="order")
@Table(name = "orders")
@Setter
@ToString
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @Getter
    private int id;
    @Column
    @Getter
    private LocalDate date;
    @Column
    @Getter
    private double cost;
    @ManyToMany(mappedBy = "listOfOrders")
    private List<Product> listOfProducts;
}
