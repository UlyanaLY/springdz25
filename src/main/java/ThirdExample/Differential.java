package ThirdExample;

import org.springframework.stereotype.Component;

@Component("differential-bean")
public class Differential {
    @Override
    public String toString() { return "дифференциал"; }
}
