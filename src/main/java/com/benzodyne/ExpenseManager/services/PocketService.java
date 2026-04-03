package com.benzodyne.ExpenseManager.services;

import com.benzodyne.ExpenseManager.entities.Pocket;
import com.benzodyne.ExpenseManager.repositories.PocketRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class PocketService implements GenericService<Pocket, Integer> {
    private PocketRepository pocketRepository;

    @Override
    public void addItem(Pocket item) {
        pocketRepository.save(item);
    }

    @Override
    public List<Pocket> findAllItems() {
        return pocketRepository.findAll();
    }

    @Override
    public Pocket findItemById(Integer id) {
        return pocketRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Pocket ID Not Found"));
    }
}
