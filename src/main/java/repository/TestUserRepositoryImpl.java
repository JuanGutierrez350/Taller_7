package repository;

import co.edu.sena.projectv2687350.model.User;

import java.sql.SQLException;

public class TestUserRepositoryImpl {

    public static void main (String[] args) throws SQLException {
        Repository<User> repository = new UserRepositoryImpl();

        System.out.println("");
        User userInsert = new User();
        userInsert.setUser_firstname("carlos");
        userInsert.setUser_lastname("rojas");
        userInsert.setUser_email("carlos@lindo.com");
        userInsert.setUser_password("23456789");
        repository.saveObj(userInsert);
        userInsert.setUser_firstname("pepe");
        userInsert.setUser_lastname("perez");
        userInsert.setUser_email("pepe@carraman.com");
        userInsert.setUser_password("456rygtaj");
        repository.saveObj(userInsert);

        System.out.println("");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("");
        User userUpdate = new User();
        userUpdate.setUser_id(2);
        userUpdate.setUser_firstname("jorge");
        userUpdate.setUser_lastname("cardenas");
        userUpdate.setUser_email("cardenasborracho@gmail.com");
        userUpdate.setUser_password("5r6tygh");
        repository.saveObj(userInsert);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);
    }

}
