package com.wecp.progressive.service;

import com.wecp.progressive.entity.Match;

<<<<<<< HEAD
import java.sql.SQLException;
import java.util.List;

public interface MatchService  {

    List<Match> getAllMatches() throws SQLException;

    Match getMatchById(int matchId) throws SQLException;

    Integer addMatch(Match match)throws SQLException;

    void updateMatch(Match match) throws SQLException;

    void deleteMatch(int matchId)throws SQLException;
=======
import java.util.List;

public interface MatchService {

    List<Match> getAllMatches();

    Match getMatchById(int matchId);

    Integer addMatch(Match match);

    void updateMatch(Match match);

    void deleteMatch(int matchId);
>>>>>>> 4f06e34dfc2e0366bd3b5c08b56117333375e1bc

    //Do not implement these methods in MatchServiceImplJdbc.java class
    default List<Match> getAllMatchesByStatus(String status) {
        return null;
    }
}
