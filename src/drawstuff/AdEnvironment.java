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
public class AdEnvironment extends Environment {
    
    public AdEnvironment(){
        this.setBackground(Color.black);
    }

    Image logo;
    
    @Override
    public void initializeEnvironment() {
        logo = ResourceTools.loadImageFromResource("drawstuff/hyundai_logo.jpg");
                
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
        if (logo != null) {
            graphics.drawImage(logo, 100, 100, 526, 342, this);
            
            graphics.setColor(Color.gray);
            graphics.setFont(new Font("Hyundai Normal", Font.BOLD, 50));
            graphics.drawString("NEW THINKING.", 650, 250);
            graphics.drawString("NEW POSSIBILITIES.", 650, 300);
        }
        
    }

    
}
