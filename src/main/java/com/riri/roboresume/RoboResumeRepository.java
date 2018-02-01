package com.riri.roboresume;

import org.springframework.data.repository.CrudRepository;

public interface RoboResumeRepository extends CrudRepository<RoboResume, Long> {
    Iterable <RoboResume> findByNameContainingIgnoreCase(String search);

}
