package learn.spring;

import java.io.FileWriter;

/**
 *
 * @author pratik
 */
public class FileOutMessageRenderer implements MessageRenderer{
    
    MessageProvider messageProvider;
    
    @Override
    public void setMessageProvider(MessageProvider mprovider) {
        messageProvider = mprovider;
    }

    @Override
    public void render() {
        String msg = messageProvider.getMessage();
        try(FileWriter fw = new FileWriter("msg.txt")) {
            fw.write(msg);
            System.out.println("Data is writtern in file");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
