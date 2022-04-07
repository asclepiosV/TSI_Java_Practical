package com.isep.practical4.ex3;

import com.isep.practical4.ex2.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ScheduleRepository extends CrudRepository<Schedule, Long> { }
