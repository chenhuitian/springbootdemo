package bunkerchain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bunkerchain.entity.Card;

@Repository
public interface CardDao extends JpaRepository<Card, Long> {
}
