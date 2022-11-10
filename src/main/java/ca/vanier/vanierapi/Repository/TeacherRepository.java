package ca.vanier.vanierapi.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ca.vanier.vanierapi.Entity.Teacher;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Integer> {

    Optional<Teacher> findById(Long teacherId);

}
