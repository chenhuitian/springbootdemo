package bunkerchain.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import bunkerchain.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {

    List<Course> findByTitleContaining(String title);

    List<Course> findByFeeLessThan(double fee);
}
