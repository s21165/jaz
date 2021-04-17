package pl.pjatk.WitJag;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty("my.custom.property")
public class MyThirdComponent {
    public MyThirdComponent(MyFirstComponent myFirstComponent, MySecondComponent mySecondComponent) {
        System.out.println("And this is MyThirdComponent");
        myFirstComponent.printHelloFromMethod();
        mySecondComponent.printFromSecond();
    }

}
