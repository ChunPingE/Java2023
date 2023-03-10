package ch13.exercise.exam04;

public class Util {

	// P K V 받아야하는것 3개 작성 V리턴타입 P , K는 각 파라미터로
	public static <P extends Pair<K, V>, K, V> V getValue(P pair, K key) {
		if (key.equals(pair.getKey())) {
			return pair.getValue();
		}
		return null;
	}
}
