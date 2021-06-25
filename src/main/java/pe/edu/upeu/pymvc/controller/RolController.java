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
		case 1://todos los roles
				out.println(gson.toJson(rdao.readAll()));
			break;
		case 2://guardar
			out.println(gson.toJson(rdao.create(new Rol(request.getParameter("rol")))));
			break;
		case 3://read
			out.println(gson.toJson(rdao.read(Integer.parseInt(request.getParameter("id")))));
			break;
		case 4://modificar
			Rol r = new Rol();
			r.setIdrol(Integer.parseInt(request.getParameter("id")));
			r.setNomrol(request.getParameter("rol"));
			out.println(gson.toJson(rdao.update(r)));
			break;
		case 5://eliminar
			out.println(gson.toJson(rdao.delete(Integer.parseInt(request.getParameter("id")))));
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
