package softuni.carsdemo.web.controlers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


    @GetMapping("/")
    public ModelAndView index(){
        return new ModelAndView("home");
    }

//    public String home(Model model){
//        model.addAttribute("msg1", "Pesho");
//        return "home";
//    }


    }


