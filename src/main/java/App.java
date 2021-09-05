import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld firstBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(firstBean.getMessage());

        HelloWorld secondBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(secondBean.getMessage());

        System.out.println(firstBean == secondBean);


        Cat firstCat = (Cat) applicationContext.getBean("barsik");
        System.out.println(firstCat.getMessage());

        Cat secondCat = (Cat) applicationContext.getBean("barsik");
        System.out.println(secondCat.getMessage());

        System.out.println(firstCat == secondCat);
    }
}