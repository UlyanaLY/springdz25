package ThirdExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("engin-bean")
public class Engine {
    private final Starter starter;
    private final SparkPlug sparkPlug;

    @Autowired
    public Engine(Starter starter, SparkPlug sparkPlug) {
        this.starter = starter;
        this.sparkPlug = sparkPlug;
    }


    @Override
    public String toString() {
        return " *двигатель (" + starter + " и " + sparkPlug + ")";
    }
}
