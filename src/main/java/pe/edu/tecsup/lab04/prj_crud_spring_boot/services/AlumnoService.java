package pe.edu.tecsup.lab04.prj_crud_spring_boot.services;

import pe.edu.tecsup.lab04.prj_crud_spring_boot.domain.entites.Alumno;

import java.util.List;

public interface AlumnoService {
    public void grabar(Alumno alumno);
    public void eliminar(int id);
    public Alumno buscar(Integer id);
    public List<Alumno> listar();
}
