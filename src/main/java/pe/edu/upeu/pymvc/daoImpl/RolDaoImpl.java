package pe.edu.upeu.pymvc.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.edu.upeu.pymvc.config.Conexion;
import pe.edu.upeu.pymvc.dao.RolDao;
import pe.edu.upeu.pymvc.model.Rol;

public class RolDaoImpl implements RolDao {
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx = null;
	@Override
	public int create(Rol r) {
		int x = 0;
		String SQL = "insert into producto (idproducto, nombre, precio, cantidad) values(null, ?, ?, ?)";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setString(1, r.getNombre());
			ps.setDouble(2, r.getPrecio());
			ps.setInt(3, r.getCantidad());
			x = ps.executeUpdate();
			System.out.println(x);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}

	@Override
	public int update(Rol r) {
		// TODO Auto-generated method stub
		int x = 0;
		String SQL = "update producto set nombre = ?, precio = ?, cantidad = ? where idproducto = ?";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setString(1, r.getNombre());
			ps.setDouble(2, r.getPrecio());
			ps.setInt(3, r.getCantidad());
			ps.setInt(4, r.getIdproducto());
			x = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}

	@Override
	public Rol read(int id) {
		// TODO Auto-generated method stub
		Rol a = new Rol();
		String SQL = "select *from producto where idproducto = ? ";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {				
				a.setIdproducto(rs.getInt("idproducto"));
				a.setNombre(rs.getString("nombre"));
				a.setPrecio(rs.getDouble("precio"));
				a.setCantidad(rs.getInt("cantidad"));
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return a;
	}

	@Override
	public int delete(int id) {
		int x = 0;
		String SQL = "delete from producto where idproducto = ?";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setInt(1, id);
			x = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		List<Rol> lista = new ArrayList<>();
		String SQL = "select *from producto";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			rs = ps.executeQuery(SQL);
			while(rs.next()) {
				Rol r = new Rol();
				r.setIdproducto(rs.getInt("idproducto"));
				r.setNombre(rs.getString("nombre"));
				r.setPrecio(rs.getDouble("precio"));
				r.setCantidad(rs.getInt("cantidad"));
				lista.add(r);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
		
		return lista;
	}

}
