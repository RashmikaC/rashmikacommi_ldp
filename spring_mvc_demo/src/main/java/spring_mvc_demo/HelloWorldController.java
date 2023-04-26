package spring_mvc_demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
@Controller
@RequestMapping("/hello")
public class HelloWorldController {
    // controller method to show initial html form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }
    // controller to process the html form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    // controller to read form data, add it to model
    @RequestMapping("/processFormVersionTwo")
    public String processForm2(HttpServletRequest request, Model model){
        //read the request parameter from html form
        String theName=request.getParameter("studentName");
        //convert data to all caps
        theName=theName.toUpperCase();
        //create the message
        String result="Yo! "+theName;
        // add message to model
        model.addAttribute("message",result);
        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processForm3(@RequestParam("studentName") String theName, Model model){
        //convert data to all caps
        theName=theName.toUpperCase();
        //create the message
        String result="Hey My Friend "+theName;
        // add message to model
        model.addAttribute("message",result);
        return "helloworld";
    }
}
