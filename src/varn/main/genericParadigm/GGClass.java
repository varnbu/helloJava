package varn.main.genericParadigm;

public class GGClass<T, K> {
    private T first;
    private K second;


    public GGClass(T t, K k) {
        this.first = t;
        this.second = k;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public K getSecond() {
        return second;
    }

    public void setSecond(K k) {
        this.second = k;
    }

    public static <T, K> GGClass<T, K> create3(T t, K k) {
        return new GGClass<T, K>(t, k);
    }
}
