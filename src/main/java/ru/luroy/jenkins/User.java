package ru.luroy.jenkins;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class User {
    private Long id;
    private String name;
    private String email;
}
