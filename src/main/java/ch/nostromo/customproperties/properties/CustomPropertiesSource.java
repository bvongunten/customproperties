package ch.nostromo.customproperties.properties;

import org.springframework.core.env.EnumerablePropertySource;

public class CustomPropertiesSource extends EnumerablePropertySource<CustomPropertiesDelegate> {
    private final CustomPropertiesDelegate customPropertiesDelegate;

    public CustomPropertiesSource(String name, CustomPropertiesDelegate customPropertiesDelegate) {
        super(name, customPropertiesDelegate);
        this.customPropertiesDelegate = customPropertiesDelegate;
    }

    @Override
    public String[] getPropertyNames() {
        return customPropertiesDelegate.getPropertyNames();
    }

    @Override
    public Object getProperty(String name) {
        return customPropertiesDelegate.getProperty(name);
    }
}