package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Very basic HTTP controller.
 */
@Controller
class IndexController {

    @Autowired
    private ModelRepository modelRepository;

    @GetMapping("/")
    String index(Model model) {
        FrontendDTO frontendDTO = modelRepository.getFrontendModel();
        model.addAttribute("frontendModel", frontendDTO);
        return "index";
    }

}
