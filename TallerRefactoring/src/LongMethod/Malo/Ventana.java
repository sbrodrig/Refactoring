/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LongMethod.Malo;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author RODRIGUEZ
 */
public class Ventana {
    
    private Label name, lname, id, add;
    private Button registrar, clean, exit;
    
    private String btstyle="-fx-background-color: \n" + "#000000,\n" + "linear-gradient(#7ebcea, #2f4b8f),\n" + "linear-gradient(#426ab7, #263e75),\n" +
                       "linear-gradient(#395cab, #223768);\n" + "-fx-background-insets: 0,1,2,3;\n" + "-fx-background-radius: 3,2,2,2;\n" +
                       "-fx-padding: 12 30 12 30;\n" + "-fx-text-fill: white;\n" + "-fx-font-size: 12px;"+  
                       "-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);";
    private String lbstyle="-fx-font-size: 11pt;\n" + "-fx-font-family: \"Segoe UI Semibold\";\n" + "-fx-text-fill: white;\n" 
                           +"-fx-opacity: 0.6;";
    
    public void setUpWindow(){
        name=new Label("Nombre");
        lname=new Label("Apellido");
        id=new Label("Cédula");
        add=new Label("Dirección");
        name.setStyle(lbstyle);
        lname.setStyle(lbstyle);
        add.setStyle(lbstyle);
        id.setStyle(lbstyle);
        registrar=new Button("Registrar");
        clean=new Button("Limpiar Datos");
        exit=new Button("Salir");
        registrar.setStyle(btstyle);
        clean.setStyle(btstyle);
        exit.setStyle(btstyle);
    }
    
    
}
