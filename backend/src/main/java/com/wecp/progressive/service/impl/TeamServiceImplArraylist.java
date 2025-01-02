package com.wecp.progressive.service.impl;
<<<<<<< HEAD
 
import java.util.ArrayList;
// import java.util.Collection;
// import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;
 
public class TeamServiceImplArraylist implements TeamService {
 
    private static List<Team> teamList = new ArrayList<>();
 
 
    @Override
    public List<Team> getAllTeams() {
        return teamList;
    }
 
    @Override
    public int addTeam(Team team) {
        teamList.add(team);
        return teamList.size();
    }
 
    @Override
    public List<Team> getAllTeamsSortedByName() {
        List<Team> sortedTeam = teamList;
        sortedTeam.sort(Comparator.comparing(Team::getTeamName));
        //Collections.sort(t);
        return sortedTeam;
    }
 
    @Override
    public void emptyArrayList(){
        teamList = new ArrayList<>();
    }
 
=======

public class TeamServiceImplArraylist  {

>>>>>>> 4f06e34dfc2e0366bd3b5c08b56117333375e1bc
}