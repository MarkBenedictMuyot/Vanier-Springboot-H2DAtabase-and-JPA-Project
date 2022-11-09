package ca.vanier.vanierapi.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ca.vanier.vanierapi.Entity.Teacher;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Integer> {

}
