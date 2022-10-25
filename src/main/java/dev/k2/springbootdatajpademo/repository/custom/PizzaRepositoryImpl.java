package dev.k2.springbootdatajpademo.repository.custom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

public class PizzaRepositoryImpl implements PizzaRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public Pizza addPizza(Pizza pizza) {
        em.persist(pizza);
        em.flush();
        return pizza;
    }

    @Override
    public List<Pizza> listPizzaBySlicesAmountQuery(Integer slices) {
        Query query = em.createQuery("select p from Pizza p where p.slices = :slices");
        query.setParameter("slices", slices);
        return (List<Pizza>) query.getResultList();

    }

    @Override
    public List<Pizza> listPizzaBySlicesAmountTypedQuery(Integer slices) {
        TypedQuery<Pizza> typedQuery= em.createQuery("select p from Pizza p where p.slices = :slices", Pizza.class);
        typedQuery.setParameter("slices", slices);
        return typedQuery.getResultList();
    }

    @Override
    public List<Pizza> listPizzaBySlicesAmountNativeQuery(Integer slices) {
        Query nativeQuery = em.createNativeQuery("select * from pizza as p where p.slices = :slices", Pizza.class);
        nativeQuery.setParameter("slices", slices);
        return (List<Pizza>) nativeQuery.getResultList();
    }


}
