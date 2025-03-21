package Ex8_work;

class Graph {
	public static void graphPrint(int[] count, char graph) {
		System.out.println("\n전체 그래프:");
		for (int num = 0; num <= 9; num++) {
			System.out.print(num + "의 갯수 : ");
			for (int k = 0; k < count[num]; k++) {
				System.out.print(graph);
			}
			System.out.printf("\t\t(%d개)\n", count[num]);
		}
	}
}