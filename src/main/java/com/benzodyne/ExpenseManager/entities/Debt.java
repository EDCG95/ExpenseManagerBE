package com.benzodyne.ExpenseManager.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.springframework.data.domain.Persistable;

import java.util.Objects;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "debt")
public class Debt implements Persistable<Integer> {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @JoinColumn(name = "debt_type", referencedColumnName = "type")
    @ManyToOne
    DebtType debtType;

    @Column(name = "amount")
    Float amount;

    @Override
    public boolean isNew() {
        return Objects.isNull(id);
    }
}
