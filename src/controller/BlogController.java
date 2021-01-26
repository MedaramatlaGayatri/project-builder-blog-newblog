package controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Blog;




@WebServlet(urlPatterns= {"/blog"})
public class BlogController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BlogController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
		rd.forward(request, response);
		
	}
    public static void main(String[] args) {
    	LocalDate date = LocalDate.of(2020, 3, 3);
		Blog blogs = new Blog("A blog on java","This sample blog explains about Java basics",date);
		
				//String[] blogDetails = request.getParameter("selectedAnswers").split(",");
		
		         String blog = blogs.getTitle();
		         String user =blogs.getDescription();
		

		System.out.println("Blog Title: "+blog+"\nBlog Description: "+user+"Posted On:"+blogs.getPostedOn());
    	
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/*LocalDate date = LocalDate.of(2020, 3, 3);
		Blog blogs = new Blog("A blog on java","This sample blog explains about Java basics",date);
		
				String[] blogDetails = request.getParameter("selectedAnswers").split(",");
		
		         String blog = blogDetails[0];
		         String user = blogDetails[1];
		

		System.out.print(blog+" "+user);
		if(blog!=null) {
			request.setAttribute("blog", blog);
			request.setAttribute("user",user);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
			rd.forward(request, response);
		}
		*/

	}

}
