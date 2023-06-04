//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package co.edu.sena.projectv2687350.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface repository<T> {
    List<T> listAllObj() throws SQLException;

    T byIdObj(Integer var1) throws SQLException;

    Integer saveObj(T var1) throws SQLException;

    void deleteObj(Integer var1) throws SQLException;

    T createObj(ResultSet var1) throws SQLException;
}
