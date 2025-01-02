package com.wecp.progressive.entity;
<<<<<<< HEAD
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Cricketer implements Comparable<Cricketer>{
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cricketerId;
    private int teamId;
    private String cricketerName;
    private int age;
    private String nationality;
    private int experience;
    private String role;
    private int totalRuns;
    private int totalWickets;
 
   
 
    public Cricketer() {
    }
 
 
 
    public Cricketer(int cricketerId, int teamId, String cricketerName, int age, String nationality, int experience,
            String role, int totalRuns, int totalWickets) {
        this.cricketerId = cricketerId;
        this.teamId = teamId;
        this.cricketerName = cricketerName;
        this.age = age;
        this.nationality = nationality;
        this.experience = experience;
        this.role = role;
        this.totalRuns = totalRuns;
        this.totalWickets = totalWickets;
    }
 
 
 
    public int getCricketerId() {
        return cricketerId;
    }
 
 
 
    public void setCricketerId(int cricketerId) {
        this.cricketerId = cricketerId;
    }
 
 
 
    public int getTeamId() {
        return teamId;
    }
 
 
 
    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
 
 
 
    public String getCricketerName() {
        return cricketerName;
    }
 
 
 
    public void setCricketerName(String cricketerName) {
        this.cricketerName = cricketerName;
    }
 
 
 
    public int getAge() {
        return age;
    }
 
 
 
    public void setAge(int age) {
        this.age = age;
    }
 
 
 
    public String getNationality() {
        return nationality;
    }
 
 
 
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
 
 
 
    public int getExperience() {
        return experience;
    }
 
 
 
    public void setExperience(int experience) {
        this.experience = experience;
    }
 
 
 
    public String getRole() {
        return role;
    }
 
 
 
    public void setRole(String role) {
        this.role = role;
    }
 
 
 
    public int getTotalRuns() {
        return totalRuns;
    }
 
 
 
    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }
 
 
 
    public int getTotalWickets() {
        return totalWickets;
    }
 
 
 
    public void setTotalWickets(int totalWickets) {
        this.totalWickets = totalWickets;
    }
 
 
 
    @Override
    public int compareTo(Cricketer o) {
        return this.getExperience() - o.getExperience();
    }
=======

public class Cricketer {
int cricketer_id;
int team_id;
String cricketer_name;
int age;
String nationality;
int experience;
String role;
int total_runs;
int total_wickets;
public Cricketer(int cricketer_id, int team_id, String cricketer_name, int age, String nationality, int experience,
        String role, int total_runs, int total_wickets) {
    this.cricketer_id = cricketer_id;
    this.team_id = team_id;
    this.cricketer_name = cricketer_name;
    this.age = age;
    this.nationality = nationality;
    this.experience = experience;
    this.role = role;
    this.total_runs = total_runs;
    this.total_wickets = total_wickets;
}
public int getCricketer_id() {
    return cricketer_id;
}
public void setCricketer_id(int cricketer_id) {
    this.cricketer_id = cricketer_id;
}
public int getTeam_id() {
    return team_id;
}
public void setTeam_id(int team_id) {
    this.team_id = team_id;
}
public String getCricketer_name() {
    return cricketer_name;
}
public void setCricketer_name(String cricketer_name) {
    this.cricketer_name = cricketer_name;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public String getNationality() {
    return nationality;
}
public void setNationality(String nationality) {
    this.nationality = nationality;
}
public int getExperience() {
    return experience;
}
public void setExperience(int experience) {
    this.experience = experience;
}
public String getRole() {
    return role;
}
public void setRole(String role) {
    this.role = role;
}
public int getTotal_runs() {
    return total_runs;
}
public void setTotal_runs(int total_runs) {
    this.total_runs = total_runs;
}
public int getTotal_wickets() {
    return total_wickets;
}
public void setTotal_wickets(int total_wickets) {
    this.total_wickets = total_wickets;
}





>>>>>>> 4f06e34dfc2e0366bd3b5c08b56117333375e1bc
}