package org.launchcode.models.data;

import org.launchcode.models.Result;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by melissa on 5/13/17.
 */

@Repository
@Transactional
public interface ResultsDao extends CrudRepository<Result, Integer>{
}
