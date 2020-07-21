package kodilla.beautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("");
        poemBeautifier.beautify("jakis tekst", (String) -> String.toUpperCase());
        poemBeautifier.beautify("jakis tekst", (String) -> String.replace('k', 'O'));
        poemBeautifier.beautify("jakis tekst", (String) -> String.concat("ABC"));
    }
}
