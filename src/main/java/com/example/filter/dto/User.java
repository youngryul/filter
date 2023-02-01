package com.example.filter.dto;

import lombok.*;

//lombok를 통해 getter, setter, toString 코드를 칠 필요 없이 추가
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;
    private int age;
}
