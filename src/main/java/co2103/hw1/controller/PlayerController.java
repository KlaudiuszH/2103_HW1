package co2103.hw1.controller;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Player;
import co2103.hw1.domain.Team;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class PlayerController {

    @InitBinder
    protected void initBinder(WebDataBinder binder){
        binder.addValidators(new PlayerValidator());
    }

    @GetMapping("/players")
    public String showPlayers(Model model, @RequestParam int team) {
        for (Team list : Hw1Application.teams) {
            if (team == list.getId()) {
                model.addAttribute("players", list.getPlayers());
                model.addAttribute("team", team);
            }
        }
        return("players/list");
    }

    @RequestMapping("/newPlayer")
    public String newPlayer(Model model, @RequestParam int team) {
        model.addAttribute("player", new Player());
        model.addAttribute("team", team);
        return("players/form");
    }

    @PostMapping("/addPlayer")
    public String updatePlayer(@ModelAttribute Player player, @RequestParam int team) {
        for (Team list : Hw1Application.teams) {
            if (team == list.getId()) {
                list.getPlayers().add(player);
            }
        }
        return "redirect:/teams";
    }
}