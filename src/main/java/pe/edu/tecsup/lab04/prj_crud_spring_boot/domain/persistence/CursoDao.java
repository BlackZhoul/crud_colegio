package pe.edu.tecsup.lab04.prj_crud_spring_boot.domain.persistence;


import org.springframework.data.repository.CrudRepository;
import pe.edu.tecsup.lab04.prj_crud_spring_boot.domain.entites.Curso;

public interface CursoDao extends CrudRepository<Curso,Integer> {
}