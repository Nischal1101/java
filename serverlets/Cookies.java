package serverlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.net.CookieHandler;

public class Cookies extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException {
        res.setContentType("text/html");
        //Create a new cookie and set it in the response.
        Cookie cookie = new Cookie("name", "nischal");
        res.addCookie(cookie);
        // Read cookies.
        Cookie[] cookies=req.getCookies();
        if(cookies!null)
        {
          for(Cookie cookie:cookies)
          {
           string cookie2= cookie.getValue();

          }
        }
        //delete cookies.
        cookie.setMaxAge(0);

        PrintWriter pw = res.getWriter();
        pw.println("hello world");

    }
}
