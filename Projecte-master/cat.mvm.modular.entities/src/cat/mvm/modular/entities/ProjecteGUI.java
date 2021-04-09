package cat.mvm.modular.entities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProjecteGUI extends JFrame { //Atributos, total 6 JLabel, 6 JTextField y un JButton

    private JLabel jlbCodi;
    private JLabel jlbName;
    private JLabel jlbFamily;
    private JLabel jlbType;
    private JLabel jlbPrice;
    private JLabel jlbAmount;
    private JTextField jtfCodi;
    private JTextField jtfName;
    //private JTextField jtfFamily;
    private JComboBox jtfFamily;
    private JTextField jtfType;
    private JTextField jtfPrice;
    private JTextField jtfAmount;
    private JButton jbtCalcul;
    private JButton jbtResult;
    private Object objCodi;
    private Object objPrice;
    private Object objAmount;
    private JLabel jlbTitle;
    private JTextArea jtaResult;

    public ProjecteGUI() { //Configuración básica de la ventana GUI------------------------------
        this.setSize(700, 700); //Mida de la ventana
        this.setResizable(false); //Quitar la opcion de modificar el size de la ventana
        this.setTitle("Projecte"); //Título de la ventana
        this.setVisible(true); //Visibilidad on
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar el programa al cerrar la app

        Toolkit screen = Toolkit.getDefaultToolkit();
        Dimension screenSize = screen.getScreenSize(); //Coger la dimension de la pantalla
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        this.setSize(screenWidth / 3, screenHeight / 2);
        this.setLocation(screenWidth / 3, screenHeight / 4);
        initComponents(); //Método que contiene el diseño de la interfaz gráfica
    }

    private void initComponents() { //Método que contiene el diseño de la interfaz gráfica
        jlbTitle = new JLabel();
        jlbCodi = new JLabel();
        jlbName = new JLabel();
        jlbFamily = new JLabel();
        jlbType = new JLabel();
        jlbPrice = new JLabel();
        jlbAmount = new JLabel();
        jtfCodi = new JTextField();
        jtfName = new JTextField();
        //jtfFamily = new JTextField();
        jtfFamily = new JComboBox();
        jtfType = new JTextField();
        jtfPrice = new JTextField();
        jtfAmount = new JTextField();
        jbtCalcul = new JButton();
        jbtResult = new JButton();
        jtaResult = new JTextArea();

        getContentPane().setLayout(null);

        jlbTitle.setText("Agregar un artículo: "); //-------------Títol---------------------------------
        jlbTitle.setFont(new Font("Serif", Font.PLAIN, 18));
        getContentPane().add(jlbTitle);
        jlbTitle.setBounds(30,30,200,30);

        jlbCodi.setText("Codi: "); //-----------------------------Codi (0-999)---------------------------
        getContentPane().add(jlbCodi);
        jlbCodi.setBounds(30, 80, 116, 14);

        jtfCodi.setHorizontalAlignment(JTextField.RIGHT);
        getContentPane().add(jtfCodi);
        jtfCodi.setBounds(100, 80, 130, 20);
        jtfCodi.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfDadafocusGained(e);
            }
        });
        jtfCodi.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                jtfCodiKeyTyped(e);
            }
        });

        jlbName.setText("Nom: "); //------------------------------Nom (String)----------------------------
        getContentPane().add(jlbName);
        jlbName.setBounds(30, 120, 116, 14);

        jtfName.setHorizontalAlignment(JTextField.RIGHT);
        getContentPane().add(jtfName);
        jtfName.setBounds(100, 120, 130, 20);
        jtfName.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfDadafocusGained(e);
            }
        });

        jlbFamily.setText("Familia: "); //------------------------Familia (1,2,3)--------------------------
        getContentPane().add(jlbFamily);
        jlbFamily.setBounds(30, 160, 116, 14);

        //jtfFamily.setHorizontalAlignment(JTextField.RIGHT);
        jtfFamily.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Cosmetica", "Perfumeria", "Maquillatge"}));
        getContentPane().add(jtfFamily);
        jtfFamily.setBounds(100, 160, 130, 20);

        jlbType.setText("Tipus: "); //-----------------------------Tipus (String)---------------------------
        getContentPane().add(jlbType);
        jlbType.setBounds(30, 200, 116, 14);

        jtfType.setHorizontalAlignment(JTextField.RIGHT);
        getContentPane().add(jtfType);
        jtfType.setBounds(100, 200, 130, 20);
        jtfType.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfDadafocusGained(e);
            }
        });

        jlbPrice.setText("Preu: "); //------------------------------Preu (decimal)---------------------------
        getContentPane().add(jlbPrice);
        jlbPrice.setBounds(30, 240, 116, 14);

        jtfPrice.setHorizontalAlignment(JTextField.RIGHT);
        getContentPane().add(jtfPrice);
        jtfPrice.setBounds(100, 240, 130, 20);
        jtfPrice.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfDadafocusGained(e);
            }
        });
        jtfPrice.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                jtfPriceKeyTyped(e);
            }
        });

        jlbAmount.setText("Quantitat: "); //------------------------Quantitat (0=<X)--------------------------
        getContentPane().add(jlbAmount);
        jlbAmount.setBounds(30, 280, 116, 14);

        jtfAmount.setHorizontalAlignment(JTextField.RIGHT);
        getContentPane().add(jtfAmount);
        jtfAmount.setBounds(100, 280, 130, 20);
        jtfAmount.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfDadafocusGained(e);
            }
        });
        jtfAmount.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                jtfAmountKeyTyped(e);
            }
        });

        jbtCalcul.setText("Test"); //-------------------------------Botón de validación------------------------
        getContentPane().add(jbtCalcul);
        jbtCalcul.setBounds(160, 320, 70, 20);
        jbtCalcul.addActionListener(e -> jbtCalculActionPerformed(e));

        jbtResult.setText("Done"); //-------------------------------Botón pasar info---------------------------
        getContentPane().add(jbtResult);
        jbtResult.setBounds(70,320,70,20);
        jbtResult.addActionListener(e -> jbtResultActionPerformed(e));

        getContentPane().add(jtaResult); //-------------------------Text area----------------------------------
        jtaResult.setBounds(280,80,300,300);
    }

    private void jtfDadafocusGained(FocusEvent evt) { //Método que selecciona todos los datos de la casilla
        JTextField objEnfocado = (JTextField) evt.getSource();
        objEnfocado.selectAll();
    }

    private void jbtCalculActionPerformed(ActionEvent evt) { //Método del botón, validación del los datos
        int Codi;
        if (objCodi == jtfCodi) { //Validacion del input Codi
            try {
                Codi = Integer.parseInt(jtfCodi.getText());
                if (Codi < 0 || Codi > 999) {
                    jtfCodi.setText("Error");
                }
            } catch (NumberFormatException n) {
                jtfCodi.setText("Error");
            }
        }
        if (objPrice == jtfPrice){ //Validacion del input Price
            try {
                Codi = Integer.parseInt(jtfPrice.getText());
            } catch (NumberFormatException n) {
                jtfPrice.setText("Error");
            }
        }
        if (objAmount == jtfAmount){
            try {
                Codi = Integer.parseInt(jtfAmount.getText());
                if (Codi < 0) {
                    jtfAmount.setText("Error");
                }
            } catch (NumberFormatException n) {
                jtfAmount.setText("Error");
            }
        }
    }

    private void jbtResultActionPerformed(ActionEvent evt) {
        var showDates = jtfCodi.getText() + "\n" + jtfName.getText() + "\n" + jtfType.getText() + "\n" + jtfPrice.getText() + "\n" + jtfAmount.getText();
        jtaResult.setText(showDates);
    }

    private void jtfCodiKeyTyped(KeyEvent evt) { //Método de comprobación de los datos validados
        objCodi = evt.getSource();
    }
    private void jtfPriceKeyTyped(KeyEvent evt) { //Método de comprobación de los datos validados
        objPrice = evt.getSource();
    }
    private void jtfAmountKeyTyped(KeyEvent evt) { //Método de comprobación de los datos validados
        objAmount = evt.getSource();
    }
}