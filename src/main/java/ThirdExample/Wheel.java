package ThirdExample;

import org.springframework.stereotype.Component;

@Component("wheel-bean")
public class Wheel {
    @Override
    public String toString() { return " *руль"; }
}
