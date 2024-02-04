/**
 * The SimpleText class is a basic implementation of the IText interface, providing simple text transformation.
 * It returns the input text as-is without any modification.
 */
public class SimpleText implements IText
{
    /**
     * Returns the input text without any transformation.
     *
     * @param text The text to be transformed.
     * @return The input text.
     */
    @Override
    public String ToStringText(String text)
    {
        return text;
    }
}
