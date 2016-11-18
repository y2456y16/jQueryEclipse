package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addServlet
 */
@WebServlet("/add")
public class addServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //get방식이면 여기
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// <!-- 기본 문구 -->response.getWriter().append("Served at: ").append(request.getContextPath());
		//1. 입력받고
		//2. 로직처리하고
		//3. 출력하고
		String input1 = request.getParameter("input1");
		String input2 = request.getParameter("input2");
		
		int result = Integer.parseInt(input1) + Integer.parseInt(input2);
		
		//response.setContentType("text/plain; charset=utf8");
		response.setContentType("text/html; charset=utf8");
		PrintWriter out = response.getWriter();
		
		
		
		/*
		 out.println("<form action=http://localhost:8080/AJAXTestServer/add>");
		 out.println("<input type=text name=input1> + <input type = text name=input2><br>");
		 out.println("<input type = Submit value=서버로 전송>");
		 out.println("</form>");
		 out.println("계산된 결과는 : <span>여기에 나옵니다</span>");
		 */
		
		//3-3. 연결통로를 통해서 데이터를 클라이언트에게 전달
		out.println("<h1>" + result + "</h1>");
		
		//3-4. 데이터출력을 정확히 처리하기 위해 flush작업을 수행
		out.flush();
		
		//3-5. 사용된 리소스 해제
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
