package bunkerchain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bunkerchain.entity.MFMSystemSealChecklist;

public interface MFMSystemSealChecklistDao extends JpaRepository<MFMSystemSealChecklist, Long> {

}

