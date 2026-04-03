package com.benzodyne.ExpenseManager.controllers;

import com.benzodyne.ExpenseManager.entities.Pocket;
import com.benzodyne.ExpenseManager.services.PocketService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/pocket")
public class PocketController implements GenericController<Pocket, Integer>{
    PocketService pocketService;

    @Override
    public List<Pocket> getAll() {
        return pocketService.findAllItems();
    }

    @Override
    public void addItem(Pocket item) {
        pocketService.addItem(item);
    }

    @Override
    public Pocket getItem(Integer id) {
        return pocketService.findItemById(id);
    }
}
