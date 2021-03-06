package game.services;
import javax.swing.*;

/**
 * User output interface service
 * */
public class GameOutputService {

    private String message = "";

    /**
     * @param addMsg the message to be presented to the User
     * */
    public void addToMessage(String addMsg) {
        message += addMsg;
    }

    public void outputMessage() {
        JOptionPane.showMessageDialog(null, message);
    }

    public void clearMessage() {
        message = "";
    }
}
