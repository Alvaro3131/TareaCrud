package pe.edu.upeu.pymvc.dao;

import java.util.List;

import pe.edu.upeu.pymvc.model.Rol;

public interface RolDao {
	int create(Rol r);
	int update(Rol r);
	int delete(int id);
	Rol read(int id);
	List<Rol> readAll();
}
