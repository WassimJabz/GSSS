package ca.mcgill.ecse321.GSSS.dao;

import org.springframework.data.repository.CrudRepository;
import ca.mcgill.ecse321.GSSS.model.Address;
import ca.mcgill.ecse321.GSSS.model.Owner;

/**
 * 
 * To find the owner of the system
 * 
 * @author Wassim Jabbour
 *
 */
public interface OwnerRepository extends CrudRepository<Owner, String> {

  /**
   * 
   * Find the owner by his email
   * 
   * @author Wassim Jabbour
   * @param email The owner's email
   * @return The owner we want to find
   */
  Owner findOwnerByEmail(String email);

  /**
   * 
   * Find the owner by his address
   * 
   * @author Wassim Jabbour
   * @param address The owner's address
   * @return The owner we want to find
   */
  Owner findOwnerByAddress(Address address);

}
