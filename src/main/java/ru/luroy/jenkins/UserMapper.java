package ru.luroy.jenkins;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper(componentModel = "spring")
@Repository
interface UserMapper {
    UserDTO userToUserDTO(User user);

    List<UserDTO> usersToUserDTOs(List<User> users);
}

