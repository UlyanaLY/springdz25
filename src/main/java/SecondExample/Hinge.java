package SecondExample;

import org.springframework.stereotype.Component;

@Component("hinge-bean")
public class Hinge {
    @Override
    public String toString() { return "шарнир"; }
}
