package bunkerchain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bunkerchain.entity.Menu;

@Repository
public interface MenuDao extends JpaRepository<Menu, Long> {
}

