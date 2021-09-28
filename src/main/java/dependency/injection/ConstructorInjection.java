package dependency.injection;

public class ConstructorInjection {
    private Dependency dependency;

    //Constructor üzerinden injection işlemi gerçekleştirilir.
    private ConstructorInjection(Dependency dependency){
        super();
        this.dependency = dependency;
    }
}
