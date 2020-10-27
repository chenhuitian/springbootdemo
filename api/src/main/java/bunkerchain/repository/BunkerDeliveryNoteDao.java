package bunkerchain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import bunkerchain.entity.BunkerDeliveryNote;

//@Repository
public interface BunkerDeliveryNoteDao extends JpaRepository<BunkerDeliveryNote, Long> {

}

