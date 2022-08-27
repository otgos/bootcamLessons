package Generics;
//if a class implements a generic interface, this has to be generic class
public class GenericClassImpl<T> implements GenericInterface<T>{
    @Override
    public void setValue(T t) {

    }

    @Override
    public T getValue() {
        return null;
    }
}
