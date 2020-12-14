package game.services;
import javax.swing.*;

/**
 * User interface service
 * */
public class GameInputService {

    String question;
    String response;

    public void setQuestion(String question) {

        this.question = question;
    }

    public String getResponse(String question) {

        this.response = JOptionPane.showInputDialog(question);
        return this.response;
    }
}
