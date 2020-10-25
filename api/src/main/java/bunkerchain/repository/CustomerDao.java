package bunkerchain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bunkerchain.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Long> {
}