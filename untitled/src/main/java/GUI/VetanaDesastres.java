package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.*;

public class VetanaDesastres extends Ventana implements ActionListener {
    public VetanaDesastres() {
        lamina();
        add(lamina);
    }

    private JButton boton = new JButton("Detalles");
    private JTextArea area = new JTextArea();

    private void lamina() {
        area.setEditable(false);
        constraints.gridwidth = 2;
        add(area,constraints);
        constraints.gridwidth = 1;
        constraints.gridy = 1;
        add(boton,constraints);

        boton.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        for (int i = 0; i < new evolución(2012, 2016, "Chile").getDesastres().size(); i++) {
            area.append(new evolución(2012,2016,"Chile").getDesastres().toString()+"\n");
        }

    }
}

