package com.benzodyne.ExpenseManager.services;

import com.benzodyne.ExpenseManager.entities.Wage;
import com.benzodyne.ExpenseManager.repositories.WageRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
@AllArgsConstructor
public class WageService implements GenericService<Wage, Integer>{
    private WageRepository wageRepository;


    @Override
    public void addItem(Wage item) {
        wageRepository.save(item);
    }

    @Override
    public List<Wage> findAllItems() {
        var wages = wageRepository.findAll();
        return wages.stream().sorted().toList();
    }

    @Override
    public Wage findItemById(Integer id) {
        return wageRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Wage ID Not Found"));
    }
}
