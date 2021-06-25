package pe.edu.upeu.pymvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pe.edu.upeu.pymvc.dao.RolDao;
import pe.edu.upeu.pymvc.daoImpl.RolDaoImpl;
import pe.edu.upeu.pymvc.model.Rol;

/**
 * Servlet implementation class RolController
 */
public class RolController extends HttpServlet {
	private RolDao rdao = new RolDaoImpl();
	private Gson gson = new Gson();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RolController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		int opcion = Integer.parseInt(request.getParameter("opc"));//opc='1'
		switch (opcion) {
		case 1://todos los productos
				out.println(gson.toJson(rdao.readAll()));
			break;
		case 2://guardar
			String x=request.getParameter("nombre");
			double p=Double.parseDouble(request.getParameter("precio"));
			int q=Integer.parseInt(request.getParameter("cantidad"));
			System.out.println(x);
			out.println(gson.toJson(rdao.create(new Rol(x,p,q))));
			break;
		case 3://read
			out.println(gson.toJson(rdao.read(Integer.parseInt(request.getParameter("id")))));
			break;
		case 4://modificar
			Rol r = new Rol();
			r.setIdproducto(Integer.parseInt(request.getParameter("id")));
			r.setNombre(request.getParameter("nombre"));
			r.setPrecio(Double.parseDouble(request.getParameter("precio")));
			r.setCantidad(Integer.parseInt(request.getParameter("cantidad")));
			out.println(gson.toJson(rdao.update(r)));
			break;
		case 5://eliminar
			int id=Integer.parseInt(request.getParameter("id"));
			out.println(gson.toJson(rdao.delete(id)));
			break;
		default:
			break;
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
