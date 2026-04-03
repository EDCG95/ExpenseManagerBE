package com.benzodyne.ExpenseManager.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface GenericController<D, I>  {

    @GetMapping
    List<D> getAll();

    @PutMapping
    void addItem(@RequestBody D item);

    @GetMapping("{id}")
    D getItem(I id);
}
