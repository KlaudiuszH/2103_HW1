package co2103.hw1.controller;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Team;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HandlerMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TeamController {

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
    public String updateTeam(@ModelAttribute Team team) {
        team.setPlayers(new ArrayList<>());
        Hw1Application.teams.add(team);
        return "redirect:/teams";
    }
}
