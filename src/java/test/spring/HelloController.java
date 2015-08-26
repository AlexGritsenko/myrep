package test.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@SessionAttributes(types = Name.class) ere234
public class HelloController {

    @RequestMapping(value = "nameView")
    public String nameView(Model m) {

        m.addAttribute("name", new Name());
        return "nameView";
    }

    @RequestMapping(value = "helloView")
    public String helloView(Model m, Name name) {
        m.addAttribute("helloMessage", "Привет, Name:" + name.getValue() + " Nik:" + name.getNik());
        return "helloView";
 //    public ModelAndView helloView( Model m, Name name1 ) {
        //      ModelAndView ma = new ModelAndView("helloView");
        //       ma.addObject("helloMessage", "Привет, Name:"+ name1.getValue()+" Nik:"+name1.getNik());
        //       return  ma;

    }

   
}
