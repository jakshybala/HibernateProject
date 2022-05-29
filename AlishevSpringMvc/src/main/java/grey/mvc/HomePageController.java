package grey.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
grey.mvc
Tarih: 26.05.2022, Saat: 20:00, Author: Grey 
*/
@Controller
public class HomePageController {

    @GetMapping("/homepage")
    public String homePage() {
        return "home_page";

    }
}
