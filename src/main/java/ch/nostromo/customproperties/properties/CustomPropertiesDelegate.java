package ch.nostromo.customproperties.properties;


import org.springframework.stereotype.Component;

@Component
public class CustomPropertiesDelegate {

    static final String[] SUPPORTED_NAMES = new String[]{"demoKey"};

    int demoValue = 0;

    public String[] getPropertyNames() {
        return SUPPORTED_NAMES;
    }

    public String getProperty(String name) {

        // Add your changing, cached, evictable values here

        if (name.equalsIgnoreCase("demoKey")) {
            // emulate changing values
            demoValue += 1;

            return String.valueOf(demoValue);
        }

        return null;
    }


}
