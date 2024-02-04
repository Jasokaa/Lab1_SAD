/**
 * The AddingNewLineCharDecorator class is a concrete implementation of the TextDecorator,
 * designed to add a newline character and a separator line after transforming the text.
 */
public class AddingNewLineCharDecorator extends TextDecorator
{
    /**
     * Constructs an AddingNewLineCharDecorator instance with the specified decoratedText.
     *
     * @param decoratedText The IText object to be decorated.
     */
    public AddingNewLineCharDecorator(IText decoratedText)
    {
        super(decoratedText);
    }
    /**
     * Transforms the specified text by adding a newline character and a separator line.
     *
     * @param text The text to be transformed.
     * @return The transformed text.
     */
    @Override
    public String ToStringText(String text)
    {
        return text + "\n" + "------------";
    }
}
