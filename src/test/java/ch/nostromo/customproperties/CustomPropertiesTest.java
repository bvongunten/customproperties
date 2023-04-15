package ch.nostromo.customproperties;

import ch.nostromo.customproperties.service.DemoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest()
class CustomPropertiesTest {

    @Autowired
    DemoService demoService;

    @Test
    void testValues() {
        assertEquals("Hello from application.properties, custom value=1", demoService.getDemoValue());
        assertEquals("Hello from application.properties, custom value=2", demoService.getDemoValue());
        assertEquals("Hello from application.properties, custom value=3", demoService.getDemoValue());
    }

}
