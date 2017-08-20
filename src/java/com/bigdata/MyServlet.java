/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata;

import com.bigdata.Dao.StudentDao;
import com.bigdata.entity.Student;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

/**
 *
 * @author suresh
 */
public class MyServlet extends HttpServlet {

    private StudentDao sd = new StudentDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        getServletContext().setAttribute("stdList",sd.getAllStudent());
        req.getRequestDispatcher("student-list.jsp").forward(req, resp);

    }

}
