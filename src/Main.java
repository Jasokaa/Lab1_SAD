/**
 * The Main class serves as the entry point for the text decoration demonstration.
 * It showcases the usage of the IText interface and its concrete implementations, including decorators,
 * to transform and print text in different ways.
 *
 * @author [Jasokaa]
 * @version 1.0
 * @since [03.02.2024]
 */
public class Main
{
    public static void main(String[] args)
    {
        String text = "Hello world!";
        System.out.println("\nSimple text:");
        IText simpleText = new SimpleText();
        System.out.println(simpleText.ToStringText(text));

        System.out.println("\nLoverCaseDecorator:");
        IText loverCaseDecorator = new LoverCaseDecorator(simpleText);
        System.out.println(loverCaseDecorator.ToStringText(text));

        System.out.println("\nUpperCaseDecorator:");
        IText upperCaseDecorator = new UpperCaseDecorator(simpleText);
        String str = upperCaseDecorator.ToStringText(text);
        System.out.println(str);

        System.out.println("\nAddingNewLineDecorator:");
        IText addingNewLineCharDecorator = new AddingNewLineCharDecorator(simpleText);
        System.out.println(addingNewLineCharDecorator.ToStringText(text));

        System.out.println("\nAddingNewLine+UpperCaseDecorator:");
        IText addingNewLineToUpperCaseDecorator = new AddingNewLineCharDecorator(upperCaseDecorator);
        System.out.println(addingNewLineToUpperCaseDecorator.ToStringText(str));
    }
}