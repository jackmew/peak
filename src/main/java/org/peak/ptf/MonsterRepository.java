/**
 * 
 */
package org.peak.ptf;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jackho
 *
 */
@Repository
public interface MonsterRepository extends CrudRepository<Monster,Long>{

}