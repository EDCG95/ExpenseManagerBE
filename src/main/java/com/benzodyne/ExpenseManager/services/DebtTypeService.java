package com.benzodyne.ExpenseManager.services;

import com.benzodyne.ExpenseManager.entities.DebtType;
import com.benzodyne.ExpenseManager.repositories.DebtTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DebtTypeService implements GenericService<DebtType, String> {
    DebtTypeRepository debtTypeRepository;

    @Override
    public void addItem(DebtType item) {
        debtTypeRepository.save(item);
    }

    @Override
    public List<DebtType> findAllItems() {
        return debtTypeRepository.findAll();
    }

    @Override
    public DebtType findItemById(String id) {
        return debtTypeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Debt Type Not Found"));
    }
}
