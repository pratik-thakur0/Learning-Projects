package learn.spring;

/**
 *
 * @author pratik
 */
public class StandardOutMessageRenderer implements MessageRenderer{
    
    MessageProvider messageProvider;
    
    @Override
    public void setMessageProvider(MessageProvider mprovider) {
        messageProvider = mprovider;
    }

    @Override
    public void render() {
        String msg = messageProvider.getMessage();
        System.out.println(msg);
    }
    
}
