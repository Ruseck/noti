import maze.Node;

public class TestID {
    public static void main(String[] args) {
        for (int j = 0; j < 10; j++) {
            new Thread(() -> {
                for (int i = 0; i < 100; i++) {
                    Node n = new Node("TEmp");
                    System.out.println(n.getId());
                }
            }).start();
        }
    }
}
