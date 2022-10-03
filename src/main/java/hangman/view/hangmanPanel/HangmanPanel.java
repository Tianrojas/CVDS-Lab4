/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.view.hangmanPanel;

import javax.swing.*;
import java.awt.*;

public abstract class HangmanPanel extends JPanel{
     @Override
     public void paint(Graphics g){
         super.paint(g);
     };
     
     
     public abstract void incrementIncorrectGuesses();
     public abstract void setIncorrectGuesses(int incorrectGuesses);
}
