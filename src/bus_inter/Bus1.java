/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus_inter;

import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Bus1 extends Thread {

    String nombre;
    JLabel label;
    int retraso;
    int[][] corde = {
        {950, 310}, {960, 280},{910, 255}, {880, 245}, {860, 240}, {810, 215}, {790, 205}, {750, 190}, {730, 180},
        {700, 170}, {670, 165}, {640, 160}, {600, 155}, {580, 150}, {550, 145}, {520, 140},
        {490, 130}, {460, 128}, {420, 128}, {390, 128}, {360, 125}, {320, 123}, {290, 119},
        {260, 115}, {220, 113}, {190, 110}, {160, 110}, {130, 110}, {100, 110}, {100, 120},
        {100, 130}, {100, 140}, {100, 150}, {100, 170}, {100, 190}, {100, 210}, {100, 230},
        {100, 250}, {100, 280}, {100, 320}, {100, 350}, {130, 350}, {150, 350}, {190, 360},
        {220, 360}, {250, 360}, {280, 360}, {310, 360}, {310, 380}, {310, 410}, {310, 440},
        {310, 470}, {310, 500}, {350, 510}, {380, 515}, {400, 520}, {430, 520}, {470, 525},
        {500, 530}, {530, 540}, {560, 530}, {590, 530}, {620, 530}, {660, 520}, {680, 515},
        {710, 525}, {740, 535}, {770, 535}, {810, 535}, {850, 535}, {890, 535}, {920, 535},
        {920, 535}, {980, 520}, {950, 500}, {930, 480}, {910, 470}, {900, 430}, {920, 400}, {930, 360}, {940, 330}};

    int[][] coordeParada = {{960, 280}, {810, 215}, {700, 170}, {580, 150}, {460, 128},
    {390, 128}, {290, 119}, {190, 110}, {100, 110}, {100, 170},
    {100, 350}, {220, 360}, {310, 380}, {310, 500}, {430, 520},
    {560, 530}, {680, 515}, {810, 535}, {920, 535}, {910, 470}};

    public Bus1(String nombre, JLabel label, int retraso) {
        this.nombre = nombre;
        this.retraso = retraso;
        this.label = label;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(retraso); // Retraso inicial
        } catch (InterruptedException ex) {
            Logger.getLogger(Bus10.class.getName()).log(Level.SEVERE, null, ex);
        }

        while (true) {
            for (int i = 0; i < corde.length; i++) {
                System.out.println("Bus 1 avanza");
                label.setLocation(corde[i][0], corde[i][1]);

                for (int j = 0; j < coordeParada.length; j++) {
                    if (corde[i][0] == coordeParada[j][0] && corde[i][1] == coordeParada[j][1]) {
                        try {
                            
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Bus10.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Bus10.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
