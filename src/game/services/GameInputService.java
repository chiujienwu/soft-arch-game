package game.services;
import javax.swing.*;

/**
 * User interface service
 * */
public class GameInputService {

    String question;
    String response;

    /**
     * @param question the question to be asked and answered by User
     * */
    public void setQuestion(String question) {

        this.question = question;
    }

    /**
     * @return the response to parameter question
     * */
    public String getResponse(String question) {

        this.response = JOptionPane.showInputDialog(question);
        return this.response;
    }
}
