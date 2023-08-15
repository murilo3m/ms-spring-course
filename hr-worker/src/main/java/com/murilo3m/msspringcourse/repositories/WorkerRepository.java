package com.murilo3m.msspringcourse.repositories;

import com.murilo3m.msspringcourse.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
