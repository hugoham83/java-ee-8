package servlet;

import cdi.ApplicationBean;
import cdi.RequestBean;
import cdi.SessionBean;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cavera/")
public class CaveraServlet extends HttpServlet {
    @Inject
    private ApplicationBean applicationBean;

    @Inject
    private RequestBean requestBean;

    @Inject
    private SessionBean sessionBean;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("AplicationBean: "+ applicationBean.getCont());
        System.out.println("RequesteBean: "+ requestBean.getCont());
        System.out.println("SessionBean: "+ sessionBean.getCont());

        resp.getWriter().println("AplicationBean: "+ applicationBean.getCont());
        resp.getWriter().println("RequesteBean: "+ requestBean.getCont());
        resp.getWriter().println("SessionBean: "+ sessionBean.getCont());

//        System.out.println("funfouuuuu");
//        resp.getWriter().println("ok");

    }

}
