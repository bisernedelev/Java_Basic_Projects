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
import address.*;

public interface AddressStorage {

    Address getAddress(int id) throws DALException;

    int insertAddress(Address address) throws DALException;
    
    
}
