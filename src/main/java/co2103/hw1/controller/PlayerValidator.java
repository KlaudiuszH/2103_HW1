package co2103.hw1.controller;

import co2103.hw1.domain.Player;
import org.springframework.validation.Validator;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerValidator implements Validator{
    @Override
    public boolean supports(Class<?> clazz) {
        return Player.class.equals(clazz);}
    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "","Name cannot be empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nationality", "","Nationality cannot be empty");

        Player player = (Player) target;

        List<String> positions = new ArrayList<>(Arrays.asList("Defence", "Striker","Goalkeeper"));
        if (!positions.contains(player.getPosition())) {
            errors.rejectValue("position", "", "Invalid position");
        }
        if (player.getAge() < 18 || player.getAge() > 90){
            errors.rejectValue("age", "", "Invalid Age");
        }


    }
}
