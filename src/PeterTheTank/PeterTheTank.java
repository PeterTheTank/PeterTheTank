package PeterTheTank;

import java.awt.Color;

import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

public class PeterTheTank extends AdvancedRobot {
    public void run() {
   
    setBodyColor(new Color(0, 255, 0));
    	
        while (true) {
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
        }
    }
 
    public void onScannedRobot(ScannedRobotEvent e) {
        fire(1);
    }
}
