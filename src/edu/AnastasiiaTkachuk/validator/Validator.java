package edu.AnastasiiaTkachuk.validator;

public interface Validator<T>{
    ValidationResult isValid(T object);
}
