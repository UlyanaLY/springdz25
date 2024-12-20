package FirstExample;

public class Engine {
    private Starter starter;
    private SparkPlug sparkPlug;


    public void setStarter(Starter starter) { this.starter = starter; }
    public void setSparkPlug(SparkPlug sparkPlug) { this.sparkPlug = sparkPlug; }

    @Override
    public String toString() {
        return " *двигатель (" + starter + " и " + sparkPlug + ")";
    }
}
