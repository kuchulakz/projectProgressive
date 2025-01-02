package com.wecp.progressive.entity;
<<<<<<< HEAD
 
import java.util.Date;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Match {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;
    private int firstTeamId;
    private int secondTeamId;
    private Date matchDate;
    private String venue;
    private String result;
    private String status;
    private int winnerTeamId;
 
   
    public Match() {
    }
 
 
    public Match(int matchId, int firstTeamId, int secondTeamId, Date matchDate, String venue, String result,
            String status, int winnerTeamId) {
        this.matchId = matchId;
        this.firstTeamId = firstTeamId;
        this.secondTeamId = secondTeamId;
        this.matchDate = matchDate;
        this.venue = venue;
        this.result = result;
        this.status = status;
        this.winnerTeamId = winnerTeamId;
    }
 
 
    public int getMatchId() {
        return matchId;
    }
 
 
    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }
 
 
    public int getFirstTeamId() {
        return firstTeamId;
    }
 
 
    public void setFirstTeamId(int firstTeamId) {
        this.firstTeamId = firstTeamId;
    }
 
 
    public int getSecondTeamId() {
        return secondTeamId;
    }
 
 
    public void setSecondTeamId(int secondTeamId) {
        this.secondTeamId = secondTeamId;
    }
 
 
    public Date getMatchDate() {
        return matchDate;
    }
 
 
    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }
 
 
    public String getVenue() {
        return venue;
    }
 
 
    public void setVenue(String venue) {
        this.venue = venue;
    }
 
 
    public String getResult() {
        return result;
    }
 
 
    public void setResult(String result) {
        this.result = result;
    }
 
 
    public String getStatus() {
        return status;
    }
 
 
    public void setStatus(String status) {
        this.status = status;
    }
 
 
    public int getWinnerTeamId() {
        return winnerTeamId;
    }
 
 
    public void setWinnerTeamId(int winnerTeamId) {
        this.winnerTeamId = winnerTeamId;
    }
 
   
=======

import java.sql.Date;

public class Match {
int match_id;
int first_team_id;
int second_team_id;
Date match_date;
String venue;
String result;
String status;
int winner_team_id;
public Match(int match_id, int first_team_id, int second_team_id, Date match_date, String venue, String result,
        String status, int winner_team_id) {
    this.match_id = match_id;
    this.first_team_id = first_team_id;
    this.second_team_id = second_team_id;
    this.match_date = match_date;
    this.venue = venue;
    this.result = result;
    this.status = status;
    this.winner_team_id = winner_team_id;
}
public int getMatch_id() {
    return match_id;
}
public void setMatch_id(int match_id) {
    this.match_id = match_id;
}
public int getFirst_team_id() {
    return first_team_id;
}
public void setFirst_team_id(int first_team_id) {
    this.first_team_id = first_team_id;
}
public int getSecond_team_id() {
    return second_team_id;
}
public void setSecond_team_id(int second_team_id) {
    this.second_team_id = second_team_id;
}
public Date getMatch_date() {
    return match_date;
}
public void setMatch_date(Date match_date) {
    this.match_date = match_date;
}
public String getVenue() {
    return venue;
}
public void setVenue(String venue) {
    this.venue = venue;
}
public String getResult() {
    return result;
}
public void setResult(String result) {
    this.result = result;
}
public String getStatus() {
    return status;
}
public void setStatus(String status) {
    this.status = status;
}
public int getWinner_team_id() {
    return winner_team_id;
}
public void setWinner_team_id(int winner_team_id) {
    this.winner_team_id = winner_team_id;
}





>>>>>>> 4f06e34dfc2e0366bd3b5c08b56117333375e1bc
}