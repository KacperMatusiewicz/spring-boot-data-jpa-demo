package dev.k2.springbootdatajpademo.repository.custom;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomRepositoryExample {

    private final PizzaRepository pizzaRepository;

    public CustomRepositoryExample(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public void example() {
        Pizza pepperoni = new Pizza("pepperoni", 8);
        Pizza capricciosa = new Pizza("capricciosa", 8);
        Pizza margherita = new Pizza("margherita", 7);

        pizzaRepository.addPizza(pepperoni);
        pizzaRepository.addPizza(capricciosa);
        pizzaRepository.addPizza(margherita);

        List<Pizza> pizzas = pizzaRepository.listPizzaBySlicesAmountQuery(8);
        pizzas.forEach(pizza -> System.out.println(pizza.getName()));

        pizzas = pizzaRepository.listPizzaBySlicesAmountTypedQuery(8);
        pizzas.forEach(pizza -> System.out.println(pizza.getName()));

        pizzas = pizzaRepository.listPizzaBySlicesAmountNativeQuery(8);
        pizzas.forEach(pizza -> System.out.println(pizza.getName()));
    }
}
