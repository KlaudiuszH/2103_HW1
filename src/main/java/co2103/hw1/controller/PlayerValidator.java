package co2103.hw1.controller;

import co2103.hw1.domain.Player;
import org.springframework.validation.Validator;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

public class PlayerValidator implements Validator{
    @Override
    public boolean supports(Class<?> clazz) {
        return Player.class.equals(clazz);}
    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "","Name cannot be empty");
    }
}
