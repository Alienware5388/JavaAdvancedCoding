package ro.sda.advaced._6_generics;

public class Main {

    public static void main(String[] args) {

            League <FootballTeam> premier = new League<>("Premier League");

            FootballTeam arsenal = new FootballTeam("Arsenal");
            FootballTeam chelsea = new FootballTeam("Chelsea");
            FootballTeam liverpool = new FootballTeam("Liverpool");
            FootballTeam manUnited = new FootballTeam("Manchester United");

            premier.addTeam(arsenal);
            premier.addTeam(chelsea);
            premier.addTeam(liverpool);
            premier.addTeam(manUnited);

            arsenal.matchResult(chelsea,2,1);
            arsenal.matchResult(liverpool,3,6);
            arsenal.matchResult(chelsea,1,1);

            chelsea.matchResult(arsenal,3,2);
            chelsea.matchResult(liverpool,2,5);
            chelsea.matchResult(arsenal,1,2);

            liverpool.matchResult(arsenal,5,0);
            liverpool.matchResult(chelsea,2,2);
            liverpool.matchResult(arsenal,1,1);

            manUnited.matchResult(arsenal,2,2);
            manUnited.matchResult(chelsea,1,2);
            manUnited.matchResult(chelsea,1,3);

            premier.showLeagueTable();


    }

}
