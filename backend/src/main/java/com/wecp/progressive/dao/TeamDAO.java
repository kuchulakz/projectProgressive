package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Team;

<<<<<<< HEAD
import java.sql.SQLException;
import java.util.List;

public interface TeamDAO {
    int addTeam(Team team) throws SQLException;
    Team getTeamById(int teamId) throws SQLException;
    void updateTeam(Team team) throws SQLException;
    void deleteTeam(int teamId) throws SQLException;
    List<Team> getAllTeams() throws SQLException;
=======
import java.util.List;

public interface TeamDAO {
    int addTeam(Team team);
    Team getTeamById(int teamId);
    void updateTeam(Team team);
    void deleteTeam(int teamId) ;
    List<Team> getAllTeams();
>>>>>>> 4f06e34dfc2e0366bd3b5c08b56117333375e1bc
}
