package ch.nostromo.customproperties.properties;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

@Component
public class CustomPropertiesInitialization implements InitializingBean {

    @Autowired
    CustomPropertiesDelegate customPropertiesDelegate;

    @Autowired
    private ConfigurableEnvironment environment;

    @Override
    public void afterPropertiesSet() throws Exception {
        CustomPropertiesSource source = new CustomPropertiesSource("project-properties", customPropertiesDelegate);
        environment.getPropertySources().addLast(source);
    }
}
