package com.benzodyne.ExpenseManager.services;

import com.benzodyne.ExpenseManager.entities.Debt;
import com.benzodyne.ExpenseManager.repositories.DebtRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DebtService implements GenericService<Debt, Integer> {
    DebtRepository debtRepository;

    @Override
    public void addItem(Debt item) {
        debtRepository.save(item);
    }

    @Override
    public List<Debt> findAllItems() {
        return debtRepository.findAll();
    }

    @Override
    public Debt findItemById(Integer id) {
        return debtRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Debt ID Not Found"));
    }
}
