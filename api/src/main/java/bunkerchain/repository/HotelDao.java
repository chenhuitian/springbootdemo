package bunkerchain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bunkerchain.entity.Hotel;

@Repository
public interface HotelDao extends JpaRepository<Hotel, Long> {
}