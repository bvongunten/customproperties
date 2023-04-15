package ch.nostromo.customproperties.controller;

import ch.nostromo.customproperties.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class PropertyController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/custom-config")
    public String[] customConfig() {
        return new String[]{demoService.getDemoValue(), demoService.getDemoValueDirect()};
    }

}
