package technifutur.crespin.exBrasseries.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import technifutur.crespin.exBrasseries.service.BrasserieService;

@Controller
@RequestMapping("/brasserie")
public class BrasserieController {

    private final BrasserieService brasserieService;

    public BrasserieController(BrasserieService brasserieService) {
        this.brasserieService = brasserieService;
    }
}
