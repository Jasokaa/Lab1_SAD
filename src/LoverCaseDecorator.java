/**
 * The LoverCaseDecorator class is a concrete implementation of the TextDecorator,
 * designed to transform the text to lowercase.
 */
public class LoverCaseDecorator extends TextDecorator
{
    /**
     * Constructs a LoverCaseDecorator instance with the specified decoratedText.
     *
     * @param decoratedText The IText object to be decorated.
     */
    public LoverCaseDecorator(IText decoratedText)
    {
        super(decoratedText);
    }
    /**
     * Transforms the specified text to lowercase.
     *
     * @param text The text to be transformed.
     * @return The transformed text in lowercase.
     */
    @Override
    public String ToStringText(String text)
    {
        return text.toLowerCase();
    }
}
