package ch.nostromo.customproperties.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class DemoService {

    @Value("${basicProperty}")
    String basicProperty;

    @Autowired
    Environment environment;

    public String getDemoValue() {
       return basicProperty + environment.getProperty("demoKey");
    }

}
