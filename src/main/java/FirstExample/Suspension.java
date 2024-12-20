package FirstExample;

public class Suspension {
    private Hinge hinge;
    private Differential differential;

    public void setHinge(Hinge hinge) { this.hinge = hinge; }
    public void setDifferential(Differential differential) { this.differential = differential; }

    @Override
    public String toString() {
        return "*подвеска (" + hinge + " и " + differential+ ")";
    }
}
