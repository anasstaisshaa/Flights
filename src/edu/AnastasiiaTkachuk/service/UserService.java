package edu.AnastasiiaTkachuk.service;

import edu.AnastasiiaTkachuk.dao.UserDao;
import edu.AnastasiiaTkachuk.dto.CreateUserDto;
import edu.AnastasiiaTkachuk.entity.User;
import edu.AnastasiiaTkachuk.exception.ValidationException;
import edu.AnastasiiaTkachuk.mapper.CreateUserMapper;
import edu.AnastasiiaTkachuk.validator.CreateUserValidator;
import edu.AnastasiiaTkachuk.validator.ValidationResult;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserService {

    private static final UserService INSTANCE = new UserService();

    private final CreateUserValidator createUserValidator = CreateUserValidator.getInstance();
    private final UserDao userDao = UserDao.getInstance();
    private final CreateUserMapper createUserMapper = CreateUserMapper.getInstance();

    public Integer create(CreateUserDto userDto) {
        var validationResult = createUserValidator.isValid(userDto);
        if (!validationResult.isValid()) {
            throw new ValidationException(validationResult.getErrors());
        }
        var userEntity = createUserMapper.mapFrom(userDto);
        userDao.save(userEntity);
        return userEntity.getId();
    }

    public static UserService getInstance() {
        return INSTANCE;
    }
}
