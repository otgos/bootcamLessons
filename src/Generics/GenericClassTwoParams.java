package Generics;

//you can use more type
//public class GenericClassTwoParams<K, V, L,M, O>
public class GenericClassTwoParams<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public GenericClassTwoParams(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static void main(String[] args) {
        GenericClassTwoParams<Integer, String> myMap = new GenericClassTwoParams<>(1, "John");
        System.out.println(myMap.getKey()+myMap.getValue());

    }
}
