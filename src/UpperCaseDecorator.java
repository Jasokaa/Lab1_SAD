/**
 * The UpperCaseDecorator class is a concrete implementation of the TextDecorator,
 * designed to transform the text to uppercase.
 */
public class UpperCaseDecorator extends TextDecorator
{
    /**
     * Constructs an UpperCaseDecorator instance with the specified decoratedText.
     *
     * @param decoratedText The IText object to be decorated.
     */
    public UpperCaseDecorator(IText decoratedText)
    {
        super(decoratedText);
    }
    /**
     * Transforms the specified text to uppercase.
     *
     * @param text The text to be transformed.
     * @return The transformed text in uppercase.
     */
    @Override
    public String ToStringText(String text)
    {
        return text.toUpperCase();
    }
}
