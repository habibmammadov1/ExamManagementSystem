package com.example.ExamManagementSystem.dao.entities.concretes;

import com.example.ExamManagementSystem.dao.entities.abstracts.BaseEntity;

import jakarta.persistence.Entity;
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
@Table(name = "teachers")
public class Teacher extends BaseEntity {
    private String firstName;
    private String lastName;
    private String fatherName;
    private String username;
    private String password;
}
