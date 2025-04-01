package ru.luroy.jenkins;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
class UserDTO {
    private String name;
    private String email;
}
