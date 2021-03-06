package edu.ucsb.cs56.projects.games.connectfour;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * SinglePlayerMenuPanel class uses swing gui to represent the single player Menu.
 */
public class singlePlayerMenuPanel extends JPanel{
    //Instance variables
    private JButton singlePlayerEasy;
    private JButton singlePlayerAdvanced;
    private JButton singlePlayerInsane;
    AePlayWave music1;
    
    /**
     * singlePlayerMenuPanel is the constructor for this class.
     * A JPanel is created along with the two following buttons:
     * Easy
     * Advanced
     * Insane
     * These buttons are then added to the JPanel.
     * @param ss is the main menu object. 
     */
    public singlePlayerMenuPanel(startScreen2 ss){
        super ();//calls jpanel constructor
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        Font BFont = new Font("Comic Sans MS", Font.BOLD, 22);
        //creates a Easy button and and a listner 
        singlePlayerEasy = new JButton ("Easy");
        singlePlayerEasy.addActionListener(new singlePlayerEasyListener(ss) );
        singlePlayerEasy.setFont(BFont);
        
	//create a Advanced button and a listner
        singlePlayerAdvanced = new JButton ("Advanced");
        singlePlayerAdvanced.addActionListener(new singlePlayerAdvancedListener(ss) );
        singlePlayerAdvanced.setFont(BFont);

        //create a Insane button and a listner
        singlePlayerInsane = new JButton ("Insane");
        singlePlayerInsane.addActionListener(new singlePlayerInsaneListener(ss) );
        singlePlayerInsane.setFont(BFont);
        
	//adds buttons to the panel
        this.add(singlePlayerEasy);
        this.add(singlePlayerAdvanced);
	this.add(singlePlayerInsane);
    }

    /**
     * singlePlayerEasyListener is the listener for the Easy button.
     * When the Easy button is pressed the game will be set to easy mode
     * and then will launch a new game with background music. 
     */ 
    class singlePlayerEasyListener implements ActionListener {
        private startScreen2 ss1;

	/**
	 * singlePlayerEasyListner is the constructor that creates a
	 * copy of the main menu object ss
	 * @param ss is the main menu object.
	 */
        singlePlayerEasyListener(final startScreen2 ss){
            ss1 = ss;
        }
	/**
	 *actionPerformed sets the game mode to 2(easy mode) and 
	 * launches game.It also starts playing the background music.
	 * @param event is ActionEvent object.
	 */
	@Override
        public void actionPerformed(ActionEvent event){
            ss1.setGameMode(2);
            ss1.launchGame();
	    music1 = new AePlayWave("ConnectFourMusic.wav");
	    music1.start();
        }
    }
    

    /**
     * singlePlayerAdvancedListener is the listener for the Advanced button.
     * When the Advanced button is pressed the game will be set to advanced mode
     * and then will launch a new game with background music. 
     */ 
    class singlePlayerAdvancedListener implements ActionListener {
        private startScreen2 ss1;

	/**
	 * singlePlayerAdvancedListner is the constructor that creates a
	 * copy of the main menu object ss
	 * @param ss is the main menu object.
	 */
        singlePlayerAdvancedListener(final startScreen2 ss){
            ss1 = ss;
        }

	/**
	 *actionPerformed sets the game mode to 3(advanced mode)
	 * and launches game. It also starts playing the backround music.
	 * @param event is ActionEvent object.
	 */
	@Override
        public void actionPerformed(ActionEvent event){
            ss1.setGameMode(3);
            ss1.launchGame();
	    music1 = new AePlayWave("ConnectFourMusic.wav");
	    music1.start();
            
        }
    }

    /**
     * singlePlayerInsaneListener is the listener for the Insane button.
     * When the Insane button is pressed the game will be set to insane mode
     * and then will launch a new game with background music. 
     */ 
    class singlePlayerInsaneListener implements ActionListener {
        private startScreen2 ss1;

	/**
	 * singlePlayerInsaneListner is the constructor that creates a
	 * copy of the main menu object ss
	 * @param ss is the main menu object.

	 */
        singlePlayerInsaneListener(final startScreen2 ss){
            ss1 = ss;
        }

	/**
	 *actionPerformed sets the game mode to 4(insane mode)
	 * and launches game. It also starts playing the backround music.
	 * @param event is ActionEvent object.
	 */
	@Override
        public void actionPerformed(ActionEvent event){
            ss1.setGameMode(4);
            ss1.launchGame();
	    music1 = new AePlayWave("ConnectFourMusic.wav");
	    music1.start();
            
        }
    }
}
