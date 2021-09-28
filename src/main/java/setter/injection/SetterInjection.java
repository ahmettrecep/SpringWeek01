package setter.injection;

public class SetterInjection {

    private Dependency dependency;

    public Dependency getDependency() {
        return dependency;
    }
    //Setter Injection
    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }
}
