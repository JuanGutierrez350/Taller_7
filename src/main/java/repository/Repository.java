package repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface Repository <T>{

    T createObj(ResultSet rs) throws SQLException;

    List<T> listAllObj() throws SQLException;

    T byIdObj(Integer id) throws SQLException;

    Integer saveObj(T t) throws SQLException;

    Void deleteObj(Integer id) throws SQLException;


}
