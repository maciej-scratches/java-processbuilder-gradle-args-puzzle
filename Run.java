public class Run {
    public static void main(String[] args) throws Exception {
        new ProcessBuilder("gradle", "run", "--args=\"xx yy\"")
                .inheritIO()
                .start()
                .waitFor();
    }
}
