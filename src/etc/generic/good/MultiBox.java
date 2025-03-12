package etc.generic.good;

public class MultiBox<K, V> {

    private K key;
    private V value;

    public MultiBox() {}

    public MultiBox(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V get() {
        return value;
    }

    public void put(K key, V value) {
        this.key = key;
        this.value = value;
    }


}
