package hello.spring.model;

public interface Wheel {
    public abstract void useTire();
}

//Decoupling için interface'lerden yararlanırız.
//Nesneler arasındak bağımlılıklardan bu şekilde kurtulabiliriz.
// Bu işleme decoupling denir.