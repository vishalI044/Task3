package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

public class getEmpDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public getEmpDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request != null) {
			PrintWriter prt = response.getWriter();
			response.setContentType("application/json");
			int empCode = Integer.parseInt(request.getParameter("empCode"));

			Hashtable<Integer, LoginUserData> ht = new Hashtable<>();

			LoginUserData lud = new LoginUserData(101, "sathish", 20000);
			LoginUserData lud1 = new LoginUserData(102, "aiswarya", 20000);
			LoginUserData lud2 = new LoginUserData(103, "boopathi", 20000);
			LoginUserData lud3 = new LoginUserData(104, "vinitha", 20000);
			LoginUserData lud4 = new LoginUserData(104, "vishal", 20000);

			ht.put(101, lud);
			ht.put(102, lud1);
			ht.put(103, lud2);
			ht.put(104, lud3);
			ht.put(105, lud4);
			// System.out.println(ht);

			for (Map.Entry<Integer, LoginUserData> entry : ht.entrySet()) {

				int key = entry.getKey();
				// System.out.println("checking 3 "+key);
				if (key == empCode) {
					// System.out.println("checking 4 "+empCode);
					LoginUserData login = ht.get(empCode);
					JSONObject jo = new JSONObject();

					jo.put("name", login.name);
					jo.put("empCode", login.empCode);
					jo.put("salary", login.salary);

					System.out.println(jo);
					prt.println(jo);
				}
			}
		}
	}

}
