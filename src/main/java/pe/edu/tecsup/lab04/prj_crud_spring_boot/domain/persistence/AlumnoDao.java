package pe.edu.tecsup.lab04.prj_crud_spring_boot.domain.persistence;

import org.springframework.data.repository.CrudRepository;
import pe.edu.tecsup.lab04.prj_crud_spring_boot.domain.entites.Alumno;

public interface AlumnoDao extends CrudRepository<Alumno, Integer> {
}
