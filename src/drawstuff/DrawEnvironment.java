/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author EthanChong
 */
class DrawEnvironment extends Environment {

    public DrawEnvironment() {
    }
    
    Image logo;

    @Override
    public void initializeEnvironment() {
        logo = ResourceTools.loadImageFromResource("drawstuff/Apple_Logo_Blue_Transparent.png");
        this.setBackground(Color.white);
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        graphics.setColor(Color.blue);
        graphics.fillOval(10, 30, 40, 40);
        graphics.setColor(Color.black);
        graphics.fillOval(54, 30, 40, 40);
        graphics.setColor(Color.red);
        graphics.fillOval(98, 30, 40, 40);
        graphics.setColor(Color.yellow);
        graphics.fillOval(32, 45, 40, 40);
        graphics.setColor(Color.green);
        graphics.fillOval(76, 45, 40, 40);
        graphics.setColor(new Color(205,133,63));
        graphics.fillOval(150, 30, 100, 100);
        
        graphics.setColor(Color.magenta);
        graphics.setFont(new Font("Calibri", Font.ITALIC, 35));
        graphics.drawString("Mac sucks", 10, 30);
        
        if (logo != null) {
            graphics.drawImage(logo, 10, 30, 150, 150, this);
            
        }
            
        
    }
    
}
