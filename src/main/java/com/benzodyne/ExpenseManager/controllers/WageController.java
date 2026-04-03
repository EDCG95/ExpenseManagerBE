package com.benzodyne.ExpenseManager.controllers;

import com.benzodyne.ExpenseManager.entities.Wage;
import com.benzodyne.ExpenseManager.services.WageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/wage")
public class WageController implements GenericController<Wage, Integer> {
    WageService wageService;


    @Override
    public List<Wage> getAll() {
        return wageService.findAllItems();
    }

    @Override
    public void addItem(Wage item) {
        wageService.addItem(item);
    }

    @Override
    public Wage getItem(Integer id) {
        return wageService.findItemById(id);
    }
}
