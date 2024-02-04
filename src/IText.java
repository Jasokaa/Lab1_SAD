/**
 * The IText interface defines the contract for classes that represent text and provide methods for text transformation.
 * Implementing classes should offer the ability to transform text based on specific requirements.
 * This interface is part of a text decoration system, where different decorators can enhance text transformation behavior.
 */
public interface IText
{
    /**
     * Transforms the specified text based on the implementation.
     *
     * @param text The text to be transformed.
     * @return The transformed text.
     */
    String ToStringText(String text);
}
