package com.benzodyne.ExpenseManager.controllers;

import com.benzodyne.ExpenseManager.entities.DebtType;
import com.benzodyne.ExpenseManager.services.DebtTypeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/debt-type")
public class DebtTypeController implements GenericController<DebtType, String>{
    DebtTypeService debtTypeService;

    @Override
    public List<DebtType> getAll() {
        return debtTypeService.findAllItems();
    }

    @Override
    public void addItem(DebtType item) {
        debtTypeService.addItem(item);
    }

    @Override
    public DebtType getItem(String id) {
        return debtTypeService.findItemById(id);
    }
}
