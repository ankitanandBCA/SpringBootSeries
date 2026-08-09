package com.mapping.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dept_id;
    private String name;


    @OneToMany(mappedBy = "department")
    private List<Student> students=new ArrayList<>();


}
