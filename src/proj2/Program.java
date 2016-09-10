package proj2;

public class Program {
	public static void main(String[] args) {
		int[] v;
		v = new int[15];
		int i = 0;
		for (int j = 0; j < 2; j++) {
			for (String x : args[j].split(":")) {
				v[i++] = Integer.parseInt(x);
			}
		}
		double m1 = (v[0] * 60 + v[1]) * 60 + v[2];
		m1 = m1 * 11 / 60 / 720;
		double m2 = (v[3] * 60 + v[4]) * 60 + v[5];
		m2 = m2 * 11 / 60 / 720;
		System.out.println((int)(Math.floor(m2) - Math.ceil(m1) +1));
	}
}
