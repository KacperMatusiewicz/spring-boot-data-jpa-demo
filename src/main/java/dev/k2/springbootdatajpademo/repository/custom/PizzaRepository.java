package dev.k2.springbootdatajpademo.repository.custom;

import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PizzaRepository extends org.springframework.data.repository.Repository<Pizza, Long> {

    Pizza addPizza(Pizza pizza);

    List<Pizza> listPizzaBySlicesAmountQuery(Integer slices);
    List<Pizza> listPizzaBySlicesAmountTypedQuery(Integer slices);
    List<Pizza> listPizzaBySlicesAmountNativeQuery(Integer slices);
}
