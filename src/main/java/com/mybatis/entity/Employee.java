package com.mybatis.entity;
import lombok.*;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {
    int id;
    String firstName;
    String lastName;
    String email;
}
