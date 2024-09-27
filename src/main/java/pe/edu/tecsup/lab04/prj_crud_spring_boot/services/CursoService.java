package pe.edu.tecsup.lab04.prj_crud_spring_boot.services;

import pe.edu.tecsup.lab04.prj_crud_spring_boot.domain.entites.Curso;

import java.util.List;

public interface CursoService {

    public void grabar(Curso curso);
    public void eliminar(int id);
    public Curso buscar(Integer id);
    public List<Curso> listar();
}
