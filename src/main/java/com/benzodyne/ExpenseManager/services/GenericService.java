package com.benzodyne.ExpenseManager.services;

import java.util.List;


public interface GenericService<D, I> {

    void addItem(D item);

    List<D> findAllItems();

    D findItemById(I id);
}
