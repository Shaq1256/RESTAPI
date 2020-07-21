package kodilla.beautifier;

public class PoemBeautifier {

    public String beautify(String text, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(text);
        System.out.println("Text before decoration: " + text + ", text after decoration: " + result);
        return result;
    }
}
