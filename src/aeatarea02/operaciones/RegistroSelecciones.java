/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeatarea02.operaciones;

import java.util.LinkedList;
import javax.swing.JCheckBox;

/**
 *
 * @author emilionava
 */
    public class RegistroSelecciones {

    public String registrarActividades(LinkedList<JCheckBox> lista) {
        String resultado = "";
        LinkedList<String> listaActividades = new LinkedList();

        for (int i = 0; i < lista.size(); i++) {
            JCheckBox aux = lista.get(i);
            if (aux.isSelected()) {
                listaActividades.add(aux.getText());
            }
        }
        if (listaActividades.isEmpty()) {
            return "NINGUNA";
        }
        for (String item : listaActividades) {
            // code block to be executed
            resultado += item +", " ;
        }
        return resultado;
    }
}
