package learn.spring;

/**
 *
 * @author pratik
 */
public interface MessageRenderer {
    public void setMessageProvider(MessageProvider mprovider);
    public void render();
}
