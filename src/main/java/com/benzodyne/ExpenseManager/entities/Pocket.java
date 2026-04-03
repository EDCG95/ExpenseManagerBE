package com.benzodyne.ExpenseManager.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Persistable;

import java.util.Date;
import java.util.Objects;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pocket")
public class Pocket implements Persistable<Integer> {

    @Id
    @Column(insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String name;

    @JoinColumn(name = "category", referencedColumnName = "category")
    @ManyToOne
    PocketCategory pocketCategory;

    @JoinColumn(name = "type", referencedColumnName = "type")
    @ManyToOne
    PocketType pocketType;

    @Column
    Float target;

    @Column
    Float amount;

    @Column
    Date dueDate;

    @Column
    Date lastUpdated;


    @Override
    public boolean isNew() {
        return Objects.isNull(id);
    }
}
