package com.example.springbootdockermysql.mapper;
import com.example.springbootdockermysql.dto.UserDTO;
import com.example.springbootdockermysql.model.User;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO userToUserDTO(User user);

    User userDTOToUser(UserDTO userDTO);

    List<UserDTO> userToUserDTOList(List<User> users);
}
