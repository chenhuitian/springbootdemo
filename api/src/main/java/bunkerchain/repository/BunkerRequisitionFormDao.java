package bunkerchain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bunkerchain.entity.BunkerRequisitionForm;

public interface BunkerRequisitionFormDao extends JpaRepository<BunkerRequisitionForm, Long> {

}

