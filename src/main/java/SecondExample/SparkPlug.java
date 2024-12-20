package SecondExample;

import org.springframework.stereotype.Component;

@Component("sparkPlug-bean")
public class SparkPlug {
    @Override
    public String toString() { return "свечи зажигания"; }
}
