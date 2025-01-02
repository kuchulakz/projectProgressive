package com.wecp.progressive.service.impl;
<<<<<<< HEAD
 
import java.util.List;
 
import com.wecp.progressive.dao.TeamDAO;
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;
 
public class TeamServiceImplJpa implements TeamService  {
    private TeamDAO teamDAO;
   
 
    public TeamServiceImplJpa(TeamDAO teamDAO) {
        this.teamDAO = teamDAO;
    }
 
    @Override
    public List<Team> getAllTeams() {
        return null;
       
    }
 
    @Override
    public int addTeam(Team team) {
        return -1;
    }
 
    @Override
    public List<Team> getAllTeamsSortedByName() {
        return List.of();
    }
   
 
}
=======

public class TeamServiceImplJpa  {

}
>>>>>>> 4f06e34dfc2e0366bd3b5c08b56117333375e1bc
