package bus_inter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class recorrido extends JFrame {

    int segundos = 0;
    Bus1 bus_1;
    Bus2 bus_2;
    Bus3 bus_3;
    Bus4 bus_4;
    Bus5 bus_5;
    Bus6 bus_6;
    Bus7 bus_7;
    Bus8 bus_8;
    Bus9 bus_9;
    Bus10 bus_10;

    JLabel segundosLabel; // Nuevo JLabel para mostrar los segundos

    public recorrido() {
        ImageIcon fondo = new ImageIcon(recorrido.class.getResource("Mapa.jpg"));
        JLabel lbl_fondo = new JLabel(fondo);

        JLabel bus1 = new JLabel(new ImageIcon(recorrido.class.getResource("Bus.png")));
        JLabel bus2 = new JLabel(new ImageIcon(recorrido.class.getResource("Bus.png")));
        JLabel bus3 = new JLabel(new ImageIcon(recorrido.class.getResource("Bus.png")));
        JLabel bus4 = new JLabel(new ImageIcon(recorrido.class.getResource("Bus.png")));
        JLabel bus5 = new JLabel(new ImageIcon(recorrido.class.getResource("Bus.png")));
        JLabel bus6 = new JLabel(new ImageIcon(recorrido.class.getResource("Bus.png")));
        JLabel bus7 = new JLabel(new ImageIcon(recorrido.class.getResource("Bus.png")));
        JLabel bus8 = new JLabel(new ImageIcon(recorrido.class.getResource("Bus.png")));
        JLabel bus9 = new JLabel(new ImageIcon(recorrido.class.getResource("Bus.png")));
        JLabel bus10 = new JLabel(new ImageIcon(recorrido.class.getResource("Bus.png")));
        /////empieza bus3,bus2,bus1
        bus1.setBounds(940, 330, 510, 100);
        bus2.setBounds(920, 400, 510, 100);
        bus3.setBounds(930, 480, 510, 100);
        bus4.setBounds(910, 255, 510, 100);
        bus5.setBounds(810, 215, 510, 100);
        bus6.setBounds(730, 180, 510, 100);
        bus7.setBounds(640, 160, 510, 100);
        bus8.setBounds(550, 145, 510, 100);
        bus9.setBounds(460, 128, 510, 100);
        bus10.setBounds(360, 125, 510, 100);

        segundosLabel = new JLabel("Segundos: 0"); // Inicializar el JLabel
        segundosLabel.setBounds(700, 700, 100, 30); // Ubicación y tamaño del JLabel

        lbl_fondo.setLayout(null);
        lbl_fondo.add(bus1);
        lbl_fondo.add(bus2);
        lbl_fondo.add(bus3);
        lbl_fondo.add(bus4);
        lbl_fondo.add(bus5);
        lbl_fondo.add(bus6);
        lbl_fondo.add(bus7);
        lbl_fondo.add(bus8);
        lbl_fondo.add(bus9);
        lbl_fondo.add(bus10);
        lbl_fondo.add(segundosLabel); // Agregar el JLabel al panel
        

        this.getContentPane().add(lbl_fondo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(220, 20);
        setSize(1000, 1000);
        setVisible(true);

        // Inicia el recorrido automáticamente
        iniciarrecorrido(bus1, bus2, bus3, bus4, bus5, bus6, bus7, bus8, bus9, bus10);
    }

    private void iniciarrecorrido(JLabel bus1, JLabel bus2, JLabel bus3, JLabel bus4, JLabel bus5, JLabel bus6, JLabel bus7, JLabel bus8, JLabel bus9, JLabel bus10) {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundos++;
                segundosLabel.setText("Segundos: " + segundos); // Actualizar el JLabel

                if (segundos == 5) {
                    
                    bus_1 = new Bus1("Bus 1", bus1, 35000);
                    bus_1.start();
                    bus_2 = new Bus2("Bus 2", bus2, 40000);
                    bus_2.start();
                    bus_3 = new Bus3("Bus 3", bus3, 45000);
                    bus_3.start();
                    bus_4 = new Bus4("Bus 4", bus4, 30000);
                    bus_4.start();
                    bus_5 = new Bus5("Bus 5", bus5, 25000);
                    bus_5.start();
                    bus_6 = new Bus6("Bus 6", bus6, 20000);
                    bus_6.start();
                    bus_7 = new Bus7("Bus 7", bus7, 15000);
                    bus_7.start();
                    bus_8 = new Bus8("Bus 8", bus8, 10000);
                    bus_8.start();
                    bus_9 = new Bus9("Bus 9", bus9, 5000);
                    bus_9.start();
                    bus_10 = new Bus10("Bus 10", bus10, 0);
                    bus_10.start();
                } if (segundos == 100 && bus_10 != null) {
                    bus_10.stop();
                    bus_10 = null;

                } if (segundos == 100 && bus_9 != null) {
                    bus_9.stop();
                    bus_9 = null;

                }if (segundos == 100 && bus_8 != null) {
                    bus_8.stop();
                    bus_8 = null;

                }if (segundos == 100 && bus_7 != null) {
                    bus_7.stop();
                    bus_7 = null;

                }if (segundos == 100 && bus_6 != null) {
                    bus_6.stop();
                    bus_6 = null;

                }if (segundos == 100 && bus_5 != null) {
                    bus_5.stop();
                    bus_5 = null;

                }if (segundos == 100 && bus_4 != null) {
                    bus_4.stop();
                    bus_4 = null;

                }if (segundos == 100 && bus_3 != null) {
                    bus_3.stop();
                    bus_3 = null;

                }if (segundos == 100 && bus_2 != null) {
                    bus_2.stop();
                    bus_2 = null;

                }if (segundos == 100 && bus_1 != null) {
                    bus_1.stop();
                    bus_1 = null;

                }else if (segundos == 150) {
                    JOptionPane.showMessageDialog(null, "Fin del turno", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    ((Timer) e.getSource()).stop();
                }
            }
        });

        timer.start();
    }

}

//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class recorrido extends JFrame {
//
//    JPanel[] paneles;
//    JLabel[] label;
//    String[] nombre = {"bus1", "bus2"};
//    JButton boton;
//    int ANCHO = 700;
//    Bus1 bus_1;
//    int segundos=0;
//    JLabel timerLabel;
//    JLabel timeDisplayLabel;
//    Thread timeDisplayThread;
//    Timer timer;
//
//    public recorrido() {
//        ImageIcon fondo = new ImageIcon(recorrido.class.getResource("Mapa.jpg"));//sirve para traer la foto del mapa para el fondo
//        JLabel lbl_fondo = new JLabel(fondo);//creamos un label para añadir el fondo
//
//        ///////////////////////////////////////////////////////////////////////
//        ImageIcon busUno = new ImageIcon(recorrido.class.getResource("Bus1.png"));//sirve para traer la foto del bus 1
//        JLabel bus1 = new JLabel(busUno);//creamos un label para añadir el primer bus
//        ///////////////////////////////////////////////////////////////////////
//        ImageIcon busDos = new ImageIcon(recorrido.class.getResource("Bus2.png"));
//        JLabel bus2 = new JLabel(busDos);
//        bus2.setBounds(430, 520, 510, 100);// sirve para poner la ubicacion inicial
//        //bus1.setBounds(900, 528, bus_fondo.getIconWidth(), bus_fondo.getIconHeight());
//        bus1.setBounds(430, 520, 510, 100);
//
//        lbl_fondo.setLayout(null);// sirve para poder una imagen sobre el fondo, para hacerla relativamente nula
//        lbl_fondo.add(bus1);// se añade el bus a la interfaz
//        lbl_fondo.setLayout(null);// sirve para poder una imagen sobre el fondo, para hacerla relativamente nula
//        lbl_fondo.add(bus2);// se añade el bus a la interfaz
//        ////////////////////////////////////////////////////////////////////////
//        JFrame frame = new JFrame("Timer Example with Thread");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(300, 200);
//        timerLabel = new JLabel("0 seconds");
//        timeDisplayLabel = new JLabel();
//        lbl_fondo.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
//        ////////////////////////////////////////////////////////////////////////
//        
//        
//        lbl_fondo.add(timerLabel);
//        lbl_fondo.add(timeDisplayLabel);
//        boton = new JButton("Comenzar ruta periferica ");
//
//        boton.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                segundos++;
//
//                timerLabel.setText(segundos + " seconds");
//
//                if (segundos == 5 && timeDisplayThread == null) {
//                    bus_1 = new Bus1("Bus 1", bus1);// instanciamos el bus para agregarlo 
//                    bus_1.start();
//                    Bus2 bus_2 = new Bus2("Bus 2", bus2, 5000);// instanciamos el bus para agregarlo 
//                    bus_2.start();
//                } else if (segundos == 10 && timeDisplayThread != null) {
//                    bus_1.interrupt();
//                    bus_1 = null;
//                } else if (segundos == 20) {
//                    JOptionPane.showMessageDialog(null, "Fin", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
//                    ((Timer) e.getSource()).stop(); // Detiene el timer
//                }
//            }        
//        });
//
//        this.getContentPane().add(lbl_fondo);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setLocation(220, 20);
//        setSize(1000, 1000);
//        setVisible(true);
//
//    }
//}
//                bus_1 = new Bus1("Bus 1", bus1);// instanciamos el bus para agregarlo 
//                Bus2 bus_2 = new Bus2("Bus 2", bus2, 5000);// instanciamos el bus para agregarlo 
//
//                bus_1.start();
//                bus_2.start();
//        boton.setBounds(650, 700, 300, 80);// sirve para la ubicacion del boton
//        lbl_fondo.add(boton);
//lbl_fondo.setBounds(50, 50, 200, 200);
//fondo.setLayout(null);
//fondo.add(lbl_fondo);
//add(lbl_fondo);
        //this.setContentPane(lbl_fondo);
