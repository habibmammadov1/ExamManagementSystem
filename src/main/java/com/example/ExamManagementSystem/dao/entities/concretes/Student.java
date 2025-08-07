package com.example.ExamManagementSystem.dao.entities.concretes;

import com.example.ExamManagementSystem.dao.entities.abstracts.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "students")
public class Student extends BaseEntity {
    private String firstName;
    private String lastName;
    private String fatherName;
    private int grade;
    private String username;
    private String password;

    @ManyToMany
    private List<Role> role; // Assuming Role is an entity that represents the student's role
}
