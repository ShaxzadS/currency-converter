package Convert.Currency.money.controller;


import Convert.Currency.money.model.ConversionRequest;
import Convert.Currency.money.model.ConversionResponse;
import Convert.Currency.money.service.CurrencyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/converter")
public class CurrencyConverterController {
    @GetMapping
    public String maincontroler(Model model) {
        return "converter";
    }

}

