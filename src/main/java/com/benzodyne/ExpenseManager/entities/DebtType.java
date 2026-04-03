package com.benzodyne.ExpenseManager.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "debt_type")
public class DebtType {
    @Id
    @Column(name = "type")
    String type;
}
