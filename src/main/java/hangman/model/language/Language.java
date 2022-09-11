/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model.language;

import com.google.inject.ImplementedBy;

public interface Language {
    
    public String[] getFunctionControllerNames();
    public String getPointsNameLabel();
    public String getHangmanLabel();
    public String getFinalScorelabel();
    public String[] getBackSkypeButtonLabel();
    public String[] getAccesButton();
}
