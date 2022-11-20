package co2103.hw1;

import co2103.hw1.domain.Player;
import co2103.hw1.domain.Team;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Hw1Application {

    public static List<Team> teams = new ArrayList<>();
    public static List<Player> players = new ArrayList<>();

    public static void main(String[] args) {
            Player player1 = new Player();
            player1.setName("Klaudiusz Halek");
            player1.setNationality("Polish");
            player1.setPosition("Striker");
            player1.setAge(19);

            Player player2 = new Player();
            player2.setName("Alex Martin");
            player2.setNationality("English");
            player2.setPosition("Defender");
            player2.setAge(19);

            players.add(player1);
            players.add(player2);

            Team teamA = new Team();
            teamA.setId(1);
            teamA.setPlayers(players);
            teamA.setName("Team A");
            teamA.setLeague("Prime League");
            teams.add(teamA);

        SpringApplication.run(Hw1Application.class, args);
    }

}