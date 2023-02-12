package edu.AnastasiiaTkachuk.mapper;

import edu.AnastasiiaTkachuk.dto.UserDto;
import edu.AnastasiiaTkachuk.entity.User;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserMapper implements Mapper<User, UserDto> {
    private static final UserMapper INSTANCE = new UserMapper();
    @Override
    public UserDto mapFrom(User object) {
        return UserDto.builder()
                .id(object.getId())
                .name(object.getName())
                .image(object.getImage())
                .birthday(object.getBirthday())
                .role(object.getRole())
                .gender(object.getGender())
                .email(object.getEmail())
                .build();
    }

    public static UserMapper getInstance() {
        return INSTANCE;
    }
}
