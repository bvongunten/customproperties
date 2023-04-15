# Custom properties in Spring Boot

Support dynamic, cached, evictable etc. properties in SpringBoot. 

## Adding properties 

See getProperty Method of CustomPropertiesDelegate.java 

## Usage of properties

```java
    @Autowired
    Environment environment;

    public String getDemoValue() {
        return environment.getProperty("demoKey");
    }
```

Remark: Properties bound to instances by @value are only read once during creation!

## Demo

Run CustomPropertiesTest.java testing combined basic & custom properties from DemoService