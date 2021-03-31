package pl.miloszlewandowski.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import pl.miloszlewandowski.CustomerService;

@RestController
public class HomeController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

    @GetMapping("justhappened")
    public ModelAndView justhappened(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("jh");
        return mav;
    }

    @GetMapping("/customers")
    public ModelAndView findCustomers(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("customers", customerService.findAll());
        modelAndView.setViewName("customers");
        return modelAndView;
    }

//    @GetMapping("/showcities")
//    public ModelAndView findCities() {
//
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("cities", cityService.findAll());
//        modelAndView.setViewName("showCities");
//        return modelAndView;
//    }
//    @GetMapping
//    public ModelAndView papor(){
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("pap");
//        return mav;
// }
}
