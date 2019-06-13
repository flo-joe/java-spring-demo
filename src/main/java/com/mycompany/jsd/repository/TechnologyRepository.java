package com.mycompany.jsd.repository;

import com.mycompany.jsd.model.Technology;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnologyRepository extends CrudRepository<Technology, Integer> {

  
}
