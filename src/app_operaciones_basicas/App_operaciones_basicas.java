package app_operaciones_basicas;

import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author danie
 */
public class App_operaciones_basicas extends JFrame implements ActionListener{
    
    JButton btn_uno_diez, btn_uno_veinte, btn_uno_cincuenta;

    
    public static void main(String[] args) {
        
        //Se crea el objeto que va a contener los items de la interfaz
        App_operaciones_basicas form = new App_operaciones_basicas();
        form.setSize(500, 500);
        form.setLocationRelativeTo(null);
        form.setVisible(true);
        form.setResizable(false);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
    }
    
    public App_operaciones_basicas(){
        
        setLayout(null);
        btn_uno_diez = new JButton("1 - 10");
        btn_uno_diez.setBounds(200, 160, 80 ,40);
        add(btn_uno_diez);
        
        btn_uno_veinte = new JButton("1 - 20");
        btn_uno_veinte.setBounds(200, 230, 80 ,40);
        add(btn_uno_veinte);
        
        btn_uno_cincuenta = new JButton("1 - 10");
        btn_uno_cincuenta.setBounds(200, 300, 80 ,40);
        add(btn_uno_cincuenta);
    
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

}
