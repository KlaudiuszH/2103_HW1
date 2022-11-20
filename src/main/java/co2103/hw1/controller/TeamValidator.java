package co2103.hw1.controller;

import co2103.hw1.domain.Team;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import static co2103.hw1.Hw1Application.teams;


public class TeamValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Team.class.equals(clazz);}

    @Override
    public void validate(Object target, Errors errors) {
        Team team = (Team) target;
        for (Team q : teams){
            if (team.getId() == q.getId()){
                errors.rejectValue("id", "", "ID in use");
            }
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "","Name cannot be empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "league", "","League cannot be empty");
    }
}

