package test.cafe;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CafeApp {

    public static final String DEV = "dev";

    public static AbstractApplicationContext loadProfileContext(String path, Class<?> targetClass, String profile) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.getEnvironment().setActiveProfiles(profile);
        ctx.setClassLoader(targetClass.getClassLoader());
        ctx.load(path);
        ctx.refresh();
        return ctx;
    }
}
