package game.services;

import javax.swing.*;

public class GameOutputService {

    private String message = "";

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
