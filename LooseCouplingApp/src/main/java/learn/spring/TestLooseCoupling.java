package learn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author pratik
 */
public class TestLooseCoupling {
    public static void main(String[] args) {
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        
        MessageRenderer mr = ctx.getBean(MessageRenderer.class);
        mr.render();
        
    }
}
