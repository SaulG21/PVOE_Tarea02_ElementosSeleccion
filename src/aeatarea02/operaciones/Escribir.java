/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeatarea02.operaciones;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author saulg
 */
public class Escribir {
    //Ruta al archivo de registro
    private String rutaArchivo= "C:\\Usuarios\\emilionava\\Descargas\\registro.dat";

    public void agregarRegistro(String datos){
    try (BufferedWriter writer = new BufferedWriter (new FileWriter (rutaArchivo, true))){
    writer.write(datos);
    writer.newLine();}
    catch (IOException e){
    System.err.println("Error al escribir en el archivo"+e.getMessage());
    }
    }
}
