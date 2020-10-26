package bunkerchain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bunkerchain.entity.Job;

public interface JobDao extends JpaRepository<Job, Long> {

}

