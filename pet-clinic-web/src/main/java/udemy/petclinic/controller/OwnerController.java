package udemy.petclinic.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"","/"})
    public String listOwners() {
        return "owner/index";
    }
}
