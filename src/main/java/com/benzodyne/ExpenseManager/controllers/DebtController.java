package com.benzodyne.ExpenseManager.controllers;

import com.benzodyne.ExpenseManager.entities.Debt;
import com.benzodyne.ExpenseManager.services.DebtService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/debt")
public class DebtController implements GenericController<Debt, Integer>{
    DebtService debtService;

    @Override
    public List<Debt> getAll() {
        return debtService.findAllItems();
    }

    @Override
    public void addItem(Debt item) {
        debtService.addItem(item);
    }

    @Override
    public Debt getItem(Integer id) {
        return debtService.findItemById(id);
    }
}
