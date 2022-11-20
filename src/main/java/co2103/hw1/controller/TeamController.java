package co2103.hw1.controller;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Team;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@Controller
public class TeamController {
    @InitBinder
    protected void initBinder(WebDataBinder binder){
        binder.addValidators(new TeamValidator());
    }

    @GetMapping("/teams")
    public String showTeams(Model model) {
        model.addAttribute("teams", Hw1Application.teams);
        return "teams/list";
    }

    @RequestMapping("/newTeam")
    public String newTeams(Model model) {
        model.addAttribute("team", new Team());
        return  "teams/form";
    }

    @PostMapping("/addTeam")
    public String updateTeam(@Valid @ModelAttribute Team team, BindingResult result, Model model) {
        if (result.hasErrors()){
            model.addAttribute("team",team);
            return "teams/form";
        }
        Hw1Application.teams.add(team);
        return "redirect:/teams";
    }
}

