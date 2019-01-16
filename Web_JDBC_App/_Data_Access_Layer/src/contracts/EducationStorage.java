/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contracts;

/*
 *
 * @author biserPC
 */

import education.*;
import java.util.LinkedList;

public interface EducationStorage {

//    void insertDegree(String degree) throws DALException;

    void insertEducation(Education education,int idPerson) throws DALException;

//    void insertGradedEducation(GradedEducation gradedEducation, int person_id) throws DALException;

//    LinkedList<Education> getEducation(int id) throws DALException;
}
