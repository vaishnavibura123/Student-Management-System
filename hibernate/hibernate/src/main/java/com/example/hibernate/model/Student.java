package com.example.hibernate.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Integer ID;
  private String Name;
  private String age;
  private String phoneNo;
  private String branch;
  private String department;
  @Embedded
  private Address address;


}
