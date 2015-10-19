/**
 * @author Mathias Dickenscheid
 * @since 2014-09-07
 */
package eu.nethazard.yt;

import eu.nethazard.yt.gui.GUI;

import javax.swing.*;

public class Main {
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				new GUI();
			}
		});
	}
}