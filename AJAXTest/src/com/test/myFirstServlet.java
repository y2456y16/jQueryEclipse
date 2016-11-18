package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first")
public class myFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myFirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1. 입력받고
		//2. 로직처리하고
		//3. 출력하자!
		//3-1. 출력하라는 데이터의 종류를 먼저 알려줘야 함
		response.setContentType("text/plain; charset=utf8");// 출력하는 구문 response();
		
		//3-2. 출력하기 위한 데이터 연결 통로인 stream을 만들어요!
		PrintWriter out = response.getWriter();
		
		//3-3. 연결통로를 통해서 데이터를 클라이언트에게 전달
		out.println("서버로부터 전달된 메시지입니다.");
		
		//3-4. 데이터출력을 정확히 처리하기 위해 flush작업을 수행
		out.flush();
		
		//3-5. 사용된 리소스 해제
		out.close();
		
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}// 클라이언트가 서버에서 무언가를 호출했을때 실행되는 부분 doGet();

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
