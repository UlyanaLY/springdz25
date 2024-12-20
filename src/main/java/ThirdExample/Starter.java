package ThirdExample;

import org.springframework.stereotype.Component;

@Component("starter-bean")
public class Starter {
    @Override
    public String toString() { return "стартер"; }
}
