/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contracts;

import java.util.LinkedList;
import insurance.SocialInsuranceRecord;

/**
 *
 * @author biserPC
 */
public interface SocialInsuranceStorage {

    LinkedList<SocialInsuranceRecord> insurances(int id) throws DALException;

    void insertSocialInsurance(SocialInsuranceRecord insurance, int person_id) throws DALException;
}
