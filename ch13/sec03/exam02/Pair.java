package ch13.sec03.exam02;

public class Pair<K, V> {
	private K key;
	private V value;

	public Pair(K key, V value) { //매개변수가 2개인 제네릭 매소드
		this.key = key;
		this.value = value;
	}

	public void setKey(K key) { this.key = key; }
	public void setValue(V value) { this.value = value; }
	public K getKey()   { return key; }
	public V getValue() { return value; }
}
