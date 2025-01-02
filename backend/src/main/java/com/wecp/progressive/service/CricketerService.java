package com.wecp.progressive.service;

import com.wecp.progressive.entity.Cricketer;

<<<<<<< HEAD
import java.sql.SQLException;
=======
>>>>>>> 4f06e34dfc2e0366bd3b5c08b56117333375e1bc
import java.util.List;

public interface CricketerService {

<<<<<<< HEAD
    List<Cricketer> getAllCricketers() throws SQLException;

    Integer addCricketer(Cricketer cricketer) throws SQLException;

    List<Cricketer> getAllCricketersSortedByExperience() throws SQLException;
=======
    List<Cricketer> getAllCricketers();

    Integer addCricketer(Cricketer cricketer);

    List<Cricketer> getAllCricketersSortedByExperience();
>>>>>>> 4f06e34dfc2e0366bd3b5c08b56117333375e1bc

    default void emptyArrayList() {
    }

    //Do not implement these methods in CricketerServiceImplArraylist.java class
<<<<<<< HEAD
    default void updateCricketer(Cricketer cricketer) throws SQLException{}

    default void deleteCricketer(int cricketerId) throws SQLException{}

    default Cricketer getCricketerById(int cricketerId) throws SQLException {
=======
    default void updateCricketer(Cricketer cricketer) {}

    default void deleteCricketer(int cricketerId) {}

    default Cricketer getCricketerById(int cricketerId) {
>>>>>>> 4f06e34dfc2e0366bd3b5c08b56117333375e1bc
        return null;
    }

    //Do not implement these methods in CricketerServiceImplArraylist.java and CricketerServiceImplJdbc.java class
    default List<Cricketer> getCricketersByTeam(int teamId) {
        return null;
    }

}
