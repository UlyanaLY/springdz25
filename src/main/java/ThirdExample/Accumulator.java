package ThirdExample;

import org.springframework.stereotype.Component;

@Component("accumulator-bean")
public class Accumulator {
    @Override
    public String toString() { return "*аккумулятор"; }
}
