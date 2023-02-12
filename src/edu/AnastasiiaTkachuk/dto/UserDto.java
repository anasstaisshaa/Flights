package edu.AnastasiiaTkachuk.dto;

import edu.AnastasiiaTkachuk.entity.Gender;
import edu.AnastasiiaTkachuk.entity.Role;
import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;

@Value
@Builder
public class UserDto {
    Integer id;
    String email;
    String name;
    String image;
    LocalDate birthday;
    Role role;
    Gender gender;
}
