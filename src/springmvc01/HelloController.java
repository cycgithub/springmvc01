package springmvc01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.Date;

/**
 * Created by chenyuchao on 2016/6/18.
 */
@Controller
@RequestMapping("/hello")
public class HelloController  {

   // @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
    {
        System.out.println("getRequestURL: "+request.getRequestURL());
        System.out.println("getRequestURI: "+request.getRequestURI());
        System.out.println("getQueryString: "+request.getQueryString());
        System.out.println("getRemoteAddr: "+request.getRemoteAddr());
        System.out.println("getRemoteHost: "+request.getRemoteHost());
        System.out.println("getRemotePort: "+request.getRemotePort());
        System.out.println("getRemoteUser: "+request.getRemoteUser());
        System.out.println("getLocalAddr: "+request.getLocalAddr());
        System.out.println("getLocalName: "+request.getLocalName());
        System.out.println("getLocalPort: "+request.getLocalPort());
        System.out.println("getMethod: "+request.getMethod());
        System.out.println("-------request.getParamterMap()-------");
        System.out.println("-------");
            String hello = request.getParameter("hello");
            System.out.println("-------" + hello);
            ModelAndView mv = new ModelAndView("index");
        try {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date dd = df.parse("1990-2-09");
            System.out.println(dd);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        mv.addObject("helloworld","hello"+hello);
        return mv;
    }
    @RequestMapping(value="/hello.do")
    public String hello(String userName, Model model) {
        System.out.println(userName);
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date dd = df.parse("1990-2-09");
            System.out.println(dd);
        model.addAttribute("helloworld","hello:"+userName);
        return "/index";
    }
}
