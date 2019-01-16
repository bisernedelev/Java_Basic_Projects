/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contracts;

/**
 *
 * @author biserPC
 */
import personaldetails.*;

public interface PersonStorage {

    void insertPerson(Person person,int idPerson) throws DALException;

    Person getPerson(int id) throws DALException;
}
