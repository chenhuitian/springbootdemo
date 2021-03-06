package bunkerchain.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import bunkerchain.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

    List<Student> findByNameContaining(String name);
}
