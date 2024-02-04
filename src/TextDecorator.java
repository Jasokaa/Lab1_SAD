/**
 * The TextDecorator class is an abstract class implementing the IText interface.
 * It serves as the base class for text decorators, allowing the composition of multiple transformations.
 */
public class TextDecorator implements IText
{
    /**
     * The IText object to be decorated.
     */
    protected IText decoratedText;
    /**
     * Constructs a TextDecorator instance with the specified decoratedText.
     *
     * @param decoratedText The IText object to be decorated.
     */
    public TextDecorator(IText decoratedText)
    {
    this.decoratedText = decoratedText;
    }
    /**
     * Transforms the specified text by delegating to the decoratedText.
     *
     * @param text The text to be transformed.
     * @return The transformed text.
     */
    @Override
    public String ToStringText(String text)
    {
        return decoratedText.ToStringText(text);
    }
}
