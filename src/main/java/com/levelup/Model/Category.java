package com.levelup.Model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Category {

    @Id
    @Column(name = "Category_Id")
    private long Category_Id;

    @Column(name = "Category_name")
    private String Category_Name;
}
