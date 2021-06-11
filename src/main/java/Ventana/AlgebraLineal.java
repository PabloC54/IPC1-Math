package Ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class AlgebraLineal extends JFrame {
    
    public boolean ingresomanual=true;
    public int tam,tam1,tam2,tam11,tam21,tamp;
    public DefaultTableModel matriz = new DefaultTableModel();
    public JTable Matriz = new JTable(matriz);
    public DefaultTableModel matriz2 = new DefaultTableModel();
    public JTable Matriz2 = new JTable(matriz2);
    public DefaultTableModel matriz3 = new DefaultTableModel();
    public JTable Matriz3 = new JTable(matriz3);
    
    public Recursos operacion=new Recursos();
    
    public AlgebraLineal(int n){
                      
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Operaciones con Matrices");
        this.setSize(350,160);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        JPanel Pan1=new JPanel();
        Pan1.setLayout(null);
        this.getContentPane().add(Pan1);

        JLabel Ltit=new JLabel("Ingrese tamaño de la matriz nxn:", SwingConstants.CENTER);
        Ltit.setBounds(20,30,180,25);
        Ltit.setFont(new Font("arial",Font.PLAIN,12));
        Pan1.add(Ltit);

        JTextField Ttam=new JTextField();
        Ttam.setBounds(210,30,100,25);
        Pan1.add(Ttam);
        
        String[] ing={"Ingreso manual","Análisis de datos"};
        
        JComboBox Cing=new JComboBox(ing);
        Cing.setBounds(20, 70, 150, 30);  
        Cing.setSelectedItem("Ingreso manual");
        Pan1.add(Cing);
        

        JButton Bcon=new JButton("Continuar");
        Bcon.setBounds(200,70,100,30);
        Pan1.add(Bcon); 
        

        ActionListener ABcon = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(Ttam.getText().equals(""))
                    Ttam.setText("2");
                
                if(Integer.parseInt(Ttam.getText())<2 || Integer.parseInt(Ttam.getText())>25)
                  Ttam.setText("2");  
                
                if(Cing.getSelectedItem().equals("Análisis de datos"))
                    ingresomanual=false;
                else
                    tam=35*Integer.parseInt(Ttam.getText());
                
                matriz.setColumnCount(Integer.parseInt(Ttam.getText()));
                matriz.setRowCount(Integer.parseInt(Ttam.getText()));
                
                Pan1.setVisible(false);
                switch(n){
                case 1:
                    traspuesta(ingresomanual);
                    break;
                case 2:
                    inversa(ingresomanual);
                    break;
                case 3:
                    determinante(ingresomanual);
                    break;
                case 4:
                    potencia(ingresomanual);
                    break;
                }                
            }
        };  
        Bcon.addActionListener(ABcon);               
        
        
    }
    
    
    public AlgebraLineal(boolean get){
                      
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Operaciones con Matrices");
        this.setSize(380,240);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        JPanel Pan1=new JPanel();
        Pan1.setLayout(null);
        this.getContentPane().add(Pan1);

        JLabel Ltit=new JLabel("Matriz 1", SwingConstants.CENTER);
        Ltit.setBounds(50,30,100,25);
        Ltit.setFont(new Font("arial",Font.ITALIC,14));
        Pan1.add(Ltit);

        JLabel Ltit2=new JLabel("Matriz 2", SwingConstants.CENTER);
        Ltit2.setBounds(205,30,100,25);
        Ltit2.setFont(new Font("arial",Font.ITALIC,14));
        Pan1.add(Ltit2);

        JTextField Tfil1=new JTextField();
        Tfil1.setBounds(50,70,40,25);
        Pan1.add(Tfil1);

        JTextField Tcol1=new JTextField();
        Tcol1.setBounds(110,70,40,25);
        Pan1.add(Tcol1);

        JTextField Tfil2=new JTextField();
        Tfil2.setBounds(210,70,40,25);
        Pan1.add(Tfil2);

        JTextField Tcol2=new JTextField();
        Tcol2.setBounds(270,70,40,25);
        Pan1.add(Tcol2);
        
        JLabel L1=new JLabel("x", SwingConstants.CENTER);
        L1.setBounds(90,70,20,25);
        Pan1.add(L1);
        
        JLabel L2=new JLabel("x", SwingConstants.CENTER);
        L2.setBounds(248,70,20,25);
        Pan1.add(L2);
        
        String[] ing={"Suma","Resta","Multiplicación"};
        
        JComboBox Cing=new JComboBox(ing);
        Cing.setBounds(40, 130, 150, 30);  
        Cing.setSelectedItem("Suma");
        Pan1.add(Cing);        

        JButton Bcon=new JButton("Continuar");
        Bcon.setBounds(220,130,100,30);
        Pan1.add(Bcon); 
        

        ActionListener ABcon = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(Tfil1.getText().equals(""))
                    Tfil1.setText("2");
                
                if(Integer.parseInt(Tfil1.getText())<1 || Integer.parseInt(Tfil1.getText())>8)
                  Tfil1.setText("2");  
                
                if(Tcol1.getText().equals(""))
                    Tcol1.setText("2");
                
                if(Integer.parseInt(Tcol1.getText())<1 || Integer.parseInt(Tcol1.getText())>8)
                  Tcol1.setText("2");  
                
                if(Tfil2.getText().equals(""))
                    Tfil2.setText("2");
                
                if(Integer.parseInt(Tfil2.getText())<1 || Integer.parseInt(Tfil2.getText())>8)
                  Tfil2.setText("2");  
                
                if(Tcol2.getText().equals(""))
                    Tcol2.setText("2");
                
                if(Integer.parseInt(Tcol2.getText())<1 || Integer.parseInt(Tcol2.getText())>8)
                  Tcol2.setText("2");  
                
                matriz.setRowCount(Integer.parseInt(Tfil1.getText()));
                matriz.setColumnCount(Integer.parseInt(Tcol1.getText()));
                matriz2.setRowCount(Integer.parseInt(Tfil2.getText()));
                matriz2.setColumnCount(Integer.parseInt(Tcol2.getText()));
                matriz3.setRowCount(Integer.parseInt(Tfil1.getText()));
                matriz3.setColumnCount(Integer.parseInt(Tcol2.getText()));
                  
                tam1=60*matriz.getColumnCount();
                tam11=16*matriz.getRowCount();
                tam2=60*matriz2.getColumnCount();
                tam21=16*matriz2.getRowCount();
                
                if(tam11>tam21)
                    tamp=tam11;
                else
                    tamp=tam21;
                
                if(Cing.getSelectedItem().equals("Suma"))
                    if(Tfil1.getText().equals(Tfil2.getText()) && Tcol1.getText().equals(Tcol2.getText())){
                        operaciones(1);
                        Pan1.setVisible(false);
                    }
                
                if(Cing.getSelectedItem().equals("Resta"))
                    if(Tfil1.getText().equals(Tfil2.getText()) && Tcol1.getText().equals(Tcol2.getText())){
                        operaciones(2);
                        Pan1.setVisible(false);
                    }
                                
                if(Cing.getSelectedItem().equals("Multiplicación"))
                    if(Tcol1.getText().equals(Tfil2.getText())){
                        operaciones(3);
                        Pan1.setVisible(false);
                    }             
            }
        };  
        Bcon.addActionListener(ABcon);   
    }
    
    public void traspuesta(boolean ingresomanual){
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width; 
        double x=0.5*width-0.5*tam;
        double y=0.5*height-0.35*tam;
        
        this.setLocation((int)(x),(int)(y));
        
        JPanel Pan=new JPanel();
        Pan.setLayout(null);
        Pan.setBackground(Color.white);
        this.getContentPane().add(Pan);
        
        if(ingresomanual==true){
            this.setSize(tam+100,(int)(0.46*tam+180));
            this.setMinimumSize(new Dimension(430, 220));
            
            JLabel Ltit=new JLabel("Ingrese la matriz", SwingConstants.CENTER);
            Ltit.setBounds(10,10,200,25);
            Ltit.setFont(new Font("arial",Font.PLAIN,14));
            Pan.add(Ltit);

            Matriz.setBounds(35, 35, tam, (int)(0.45*tam));
            Matriz.setBackground(Color.lightGray);
            Pan.add(Matriz);               

            JButton Bcal=new JButton("Calcular");
            Bcal.setBounds(30,this.getHeight()-125,100,30);
            Pan.add(Bcal); 

            JButton Bgua=new JButton("Guardar resultado");
            Bgua.setBounds(this.getWidth()-180,this.getHeight()-85,150,30);
            Pan.add(Bgua); 
            
            ActionListener ABcal = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    for(int i=0;i<matriz.getRowCount();i++){
                        for (int j=0;j<matriz.getColumnCount();j++){
                            if(matriz.getValueAt(i, j)==null)                            
                            matriz.setValueAt("0", i, j);
                        }
                    }
                    double[][] mat=new double[matriz.getColumnCount()][matriz.getColumnCount()];
                    for(int i=0;i<mat.length;i++){
                        for (int j=0;j<mat.length;j++){
                            mat[j][i]=Double.parseDouble(matriz.getValueAt(i, j).toString());
                        }
                    }
                    
                    for(int i=0;i<mat.length;i++){
                        for (int j=0;j<mat.length;j++){
                        matriz.setValueAt(mat[i][j],i,j);
                        }
                    }
                }
            };        
            Bcal.addActionListener(ABcal);
        }
        else{
            height = pantalla.height;
            width = pantalla.width; 
            x=0.5*width-0.5*tam;
            y=0.5*height-0.35*tam;
        
            this.setLocation((int)(x),(int)(y));
            this.setSize(450, 250);
            int tam=matriz.getColumnCount();
            
            double[][] mat=new double[tam][tam];
            
            JLabel Ltit=new JLabel("Ingrese la matriz, separada por comas y sin espacios", SwingConstants.CENTER);
            Ltit.setBounds(10,10,350,25);
            Ltit.setFont(new Font("arial",Font.PLAIN,14));
            Pan.add(Ltit);
            
            JTextField Tmat=new JTextField();
            Tmat.setBounds(10,60,400,30);
            Pan.add(Tmat);              

            JButton Bcal=new JButton("Calcular");
            Bcal.setBounds(130,100,100,30);
            Pan.add(Bcal); 

            JButton Bgua=new JButton("Guardar resultado");
            Bgua.setBounds(230,150,150,30);
            Pan.add(Bgua);             
            
            ActionListener ABcal = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        
                    int sub=0;
                    for(int i=0;i<matriz.getRowCount();i++){
                        for (int j=0;j<matriz.getColumnCount();j++){                                                            
                            mat[i][j]=Double.parseDouble(Tmat.getText().substring(sub, sub+1));
                            sub+=2;
                        }
                    }
                    
                    double[][] mattras=operacion.matriztraspuesta(mat);
                     for(int i=0;i<matriz.getRowCount();i++){
                        for (int j=0;j<matriz.getColumnCount();j++){ 
                            mat[i][j]=mattras[i][j];
                        }
                    }
                    
                    Tmat.setText("");  
                    
                    for(int i=0;i<matriz.getRowCount();i++){
                        for (int j=0;j<matriz.getColumnCount();j++){ 
                            Tmat.setText(Tmat.getText()+String.valueOf(mattras[i][j])+",");  
                        }
                    }
                    
                                       
                }
            };        
            Bcal.addActionListener(ABcal);
            
            
        }      
    }
    
    public void inversa(boolean ingresomanual){ 
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width; 
        double x=0.5*width-0.5*tam;
        double y=0.5*height-0.35*tam;
        
        this.setLocation((int)(x),(int)(y));
        
        JPanel Pan=new JPanel();
        Pan.setLayout(null);
        Pan.setBackground(Color.white);
        this.getContentPane().add(Pan);
        
        if(ingresomanual==true){
            this.setSize(tam+100,(int)(0.46*tam+180));
            this.setMinimumSize(new Dimension(430, 220));
            
            JLabel Ltit=new JLabel("Ingrese la matriz", SwingConstants.CENTER);
            Ltit.setBounds(10,10,200,25);
            Ltit.setFont(new Font("arial",Font.PLAIN,14));
            Pan.add(Ltit);

            Matriz.setBounds(35, 35, tam, (int)(0.45*tam));
            Matriz.setBackground(Color.lightGray);
            Pan.add(Matriz);               

            JButton Bcal=new JButton("Calcular");
            Bcal.setBounds(150,this.getHeight()-125,100,30);
            Pan.add(Bcal); 
            
            JButton Bgua=new JButton("Guardar resultado");
            Bgua.setBounds(this.getWidth()-180,this.getHeight()-85,150,30);
            Pan.add(Bgua); 
            
            ActionListener ABcal = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    for(int i=0;i<matriz.getRowCount();i++){
                        for (int j=0;j<matriz.getColumnCount();j++){
                            if(matriz.getValueAt(i, j)==null)                            
                            matriz.setValueAt("0", i, j);
                        }
                    }
                    
                    double[][] mat=new double[matriz.getRowCount()][matriz.getColumnCount()];
                    for(int i=0;i<matriz.getRowCount();i++){
                        for (int j=0;j<matriz.getColumnCount();j++){
                            mat[i][j]=Double.parseDouble(matriz.getValueAt(i,j).toString());
                        }
                    }
                    
                    double[][] matcof=operacion.matrizcofactores(mat);
                    double[][] matadj=operacion.matriztraspuesta(matcof);
                    double[][] matinv=new double[mat.length][mat.length];
                    
                    for(int i=0;i<matriz.getRowCount();i++){
                        for (int j=0;j<matriz.getColumnCount();j++){
                            matinv[i][j]=matadj[i][j]/operacion.determinante(mat);
                        }
                    }                    
                    
                    for(int i=0;i<matriz.getRowCount();i++){
                        for (int j=0;j<matriz.getColumnCount();j++){
                            matriz.setValueAt(matinv[i][j], i, j);
                        }
                    }
                }
            };        
            Bcal.addActionListener(ABcal);
        }
        else{
            height = pantalla.height;
            width = pantalla.width; 
            x=0.5*width-0.5*tam;
            y=0.5*height-0.35*tam;
        
            this.setLocation((int)(x),(int)(y));
            this.setSize(450, 250);
            int tam=matriz.getColumnCount();
            
            double[][] mat=new double[tam][tam];
            
            JLabel Ltit=new JLabel("Ingrese la matriz, separada por comas y sin espacios", SwingConstants.CENTER);
            Ltit.setBounds(10,10,350,25);
            Ltit.setFont(new Font("arial",Font.PLAIN,14));
            Pan.add(Ltit);
            
            JTextField Tmat=new JTextField();
            Tmat.setBounds(10,60,400,30);
            Pan.add(Tmat);              

            JButton Bcal=new JButton("Calcular");
            Bcal.setBounds(30,100,100,30);
            Pan.add(Bcal); 
            
            JLabel Lres=new JLabel("Resultado:", SwingConstants.CENTER);
            Lres.setBounds(20,150,100,25);
            Lres.setFont(new Font("arial",Font.PLAIN,14));
            Pan.add(Lres);
            
            JTextField Tres=new JTextField();
            Tres.setBounds(120,150,100,30);
            Tres.setEditable(false);
            Pan.add(Tres);

            JButton Bgua=new JButton("Guardar resultado");
            Bgua.setBounds(230,150,150,30);
            Pan.add(Bgua);             
            
            ActionListener ABcal = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        
                    int sub=0;
                    for(int i=0;i<matriz.getRowCount();i++){
                        for (int j=0;j<matriz.getColumnCount();j++){                                                            
                            mat[i][j]=Double.parseDouble(Tmat.getText().substring(sub, sub+1));
                            sub+=2;
                        }
                    }
                    
                    double[][] matcof=operacion.matrizcofactores(mat);
                    double[][] matadj=operacion.matriztraspuesta(matcof);
                    double[][] matinv=new double[mat.length][mat.length];
                    
                    for(int i=0;i<matriz.getRowCount();i++){
                        for (int j=0;j<matriz.getColumnCount();j++){
                            matinv[i][j]=matadj[i][j]/operacion.determinante(mat);
                        }
                    }
                    
                    Tmat.setText("");  
                    
                    for(int i=0;i<matriz.getRowCount();i++){
                        for (int j=0;j<matriz.getColumnCount();j++){ 
                            Tmat.setText(Tmat.getText()+String.valueOf(matinv[i][j])+",");  
                        }
                    }
                    
                    
                }
            };        
            Bcal.addActionListener(ABcal);
        }             
    }
    
    public void determinante(boolean ingresomanual){
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width; 
        double x=0.5*width-0.5*tam;
        double y=0.5*height-0.35*tam;
        
        this.setLocation((int)(x),(int)(y));
        
        JPanel Pan=new JPanel();
        Pan.setLayout(null);
        Pan.setBackground(Color.white);
        this.getContentPane().add(Pan);
        
        if(ingresomanual==true){
            this.setSize(tam+100,(int)(0.46*tam+180));
            this.setMinimumSize(new Dimension(430, 220));
            
            JLabel Ltit=new JLabel("Ingrese la matriz", SwingConstants.CENTER);
            Ltit.setBounds(10,10,200,25);
            Ltit.setFont(new Font("arial",Font.PLAIN,14));
            Pan.add(Ltit);

            Matriz.setBounds(35, 35, tam, (int)(0.45*tam));
            Matriz.setBackground(Color.lightGray);
            Pan.add(Matriz);               

            JButton Bcal=new JButton("Calcular");
            Bcal.setBounds(30,this.getHeight()-125,100,30);
            Pan.add(Bcal); 
                        
            JLabel Lres=new JLabel("Resultado:", SwingConstants.CENTER);
            Lres.setBounds(20,this.getHeight()-85,100,25);
            Lres.setFont(new Font("arial",Font.PLAIN,14));
            Pan.add(Lres);
            
            JTextField Tres=new JTextField();
            Tres.setBounds(120,this.getHeight()-85,100,30);
            Tres.setEditable(false);
            Pan.add(Tres);

            JButton Bgua=new JButton("Guardar resultado");
            Bgua.setBounds(this.getWidth()-180,this.getHeight()-85,150,30);
            Pan.add(Bgua); 
            
            ActionListener ABcal = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    for(int i=0;i<matriz.getRowCount();i++){
                        for (int j=0;j<matriz.getColumnCount();j++){
                            if(matriz.getValueAt(i, j)==null)                            
                            matriz.setValueAt("0", i, j);
                        }
                    }
                    
                    double[][] mat=new double[matriz.getRowCount()][matriz.getColumnCount()];
                    for(int i=0;i<matriz.getRowCount();i++){
                        for (int j=0;j<matriz.getColumnCount();j++){
                            mat[i][j]=Double.parseDouble(matriz.getValueAt(i,j).toString());
                        }
                    }                    
                    Tres.setText(String.valueOf(operacion.determinante(mat)));                     
                }
            };        
            Bcal.addActionListener(ABcal);
        }
        else{
            height = pantalla.height;
            width = pantalla.width; 
            x=0.5*width-0.5*tam;
            y=0.5*height-0.35*tam;
        
            this.setLocation((int)(x),(int)(y));
            this.setSize(450, 250);
            int tam=matriz.getColumnCount();
            
            double[][] mat=new double[tam][tam];
            
            JLabel Ltit=new JLabel("Ingrese la matriz, separada por comas y sin espacios", SwingConstants.CENTER);
            Ltit.setBounds(10,10,350,25);
            Ltit.setFont(new Font("arial",Font.PLAIN,14));
            Pan.add(Ltit);
            
            JTextField Tmat=new JTextField();
            Tmat.setBounds(10,60,400,30);
            Pan.add(Tmat);              

            JButton Bcal=new JButton("Calcular");
            Bcal.setBounds(30,100,100,30);
            Pan.add(Bcal); 
            
            JLabel Lres=new JLabel("Resultado:", SwingConstants.CENTER);
            Lres.setBounds(20,150,100,25);
            Lres.setFont(new Font("arial",Font.PLAIN,14));
            Pan.add(Lres);
            
            JTextField Tres=new JTextField();
            Tres.setBounds(120,150,100,30);
            Tres.setEditable(false);
            Pan.add(Tres);

            JButton Bgua=new JButton("Guardar resultado");
            Bgua.setBounds(230,150,150,30);
            Pan.add(Bgua);    
            
            ActionListener ABcal = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        
                    int sub=0;
                    for(int i=0;i<matriz.getRowCount();i++){
                        for (int j=0;j<matriz.getColumnCount();j++){                                                            
                            mat[i][j]=Double.parseDouble(Tmat.getText().substring(sub, sub+1));
                            sub+=2;
                        }
                    }
                    Tres.setText(String.valueOf(operacion.determinante(mat)));                     
                }
            };        
            Bcal.addActionListener(ABcal);
        }        
    }
    
    public void potencia(boolean ingresomanual){
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width; 
        double x=0.5*width-0.5*tam;
        double y=0.5*height-0.35*tam;
        
        this.setLocation((int)(x),(int)(y));
        
        JPanel Pan=new JPanel();
        Pan.setLayout(null);
        Pan.setBackground(Color.white);
        this.getContentPane().add(Pan);
        
        if(ingresomanual==true){
            this.setSize(tam+100,(int)(0.46*tam+180));
            this.setMinimumSize(new Dimension(430, 220));
            
            JLabel Ltit=new JLabel("Ingrese la matriz", SwingConstants.CENTER);
            Ltit.setBounds(10,10,200,25);
            Ltit.setFont(new Font("arial",Font.PLAIN,14));
            Pan.add(Ltit);

            Matriz.setBounds(35, 35, tam, (int)(0.45*tam));
            Matriz.setBackground(Color.lightGray);
            Pan.add(Matriz);               

            JButton Bcal=new JButton("Calcular");
            Bcal.setBounds(30,this.getHeight()-125,100,30);
            Pan.add(Bcal); 

            JButton Bgua=new JButton("Guardar resultado");
            Bgua.setBounds(this.getWidth()-180,this.getHeight()-85,150,30);
            Pan.add(Bgua); 
            
            ActionListener ABcal = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    for(int i=0;i<matriz.getRowCount();i++){
                        for (int j=0;j<matriz.getColumnCount();j++){
                            if(matriz.getValueAt(i, j)==null)                            
                            matriz.setValueAt("0", i, j);
                        }
                    }
                    
                    int mult;
                    double[][] mat=new double[matriz.getRowCount()][matriz.getColumnCount()];
                    for(int i=0;i<matriz.getRowCount();i++){
                        for (int j=0;j<matriz.getColumnCount();j++){
                            mult=0;
                            
                            for(int k=0;k<mat.length;k++){
                                mult+=Double.parseDouble(matriz.getValueAt(i,k).toString())*Double.parseDouble(matriz.getValueAt(k,j).toString());
                            }
                            
                            mat[i][j]=mult;
                        }
                    }          
                     
                    for(int i=0;i<matriz.getRowCount();i++){
                        for (int j=0;j<matriz.getColumnCount();j++){
                            matriz.setValueAt(mat[i][j], i, j);                            
                        }
                    }      
                }
            };        
            Bcal.addActionListener(ABcal);
        }
        else{
            height = pantalla.height;
            width = pantalla.width; 
            x=0.5*width-0.5*tam;
            y=0.5*height-0.35*tam;
        
            this.setLocation((int)(x),(int)(y));
            this.setSize(450, 250);
            int tam=matriz.getColumnCount();
            
            double[][] mat=new double[tam][tam];
            
            JLabel Ltit=new JLabel("Ingrese la matriz, separada por comas y sin espacios", SwingConstants.CENTER);
            Ltit.setBounds(10,10,350,25);
            Ltit.setFont(new Font("arial",Font.PLAIN,14));
            Pan.add(Ltit);
            
            JTextField Tmat=new JTextField();
            Tmat.setBounds(10,60,400,30);
            Pan.add(Tmat);              

            JButton Bcal=new JButton("Calcular");
            Bcal.setBounds(30,100,100,30);
            Pan.add(Bcal);

            JButton Bgua=new JButton("Guardar resultado");
            Bgua.setBounds(230,150,150,30);
            Pan.add(Bgua);    
            
            ActionListener ABcal = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        
                    int sub=0;
                    for(int i=0;i<matriz.getRowCount();i++){
                        for (int j=0;j<matriz.getColumnCount();j++){                                                            
                            mat[i][j]=Double.parseDouble(Tmat.getText().substring(sub, sub+1));
                            sub+=2;
                        }
                    }
                    
                    int mult;
                    for(int i=0;i<matriz.getRowCount();i++){
                        for (int j=0;j<matriz.getColumnCount();j++){
                            mult=0;                            
                            for(int k=0;k<mat.length;k++){
                                mult+=mat[i][k]*mat[k][j];
                            }                            
                            mat[i][j]=mult;
                        }
                    }  
                    Tmat.setText("");
                    
                    for(int i=0;i<matriz.getRowCount();i++){
                        for (int j=0;j<matriz.getColumnCount();j++){                                                            
                            Tmat.setText(Tmat.getText()+mat[i][j]+",");
                            sub+=2;
                        }
                    }                    
                }
            };        
            Bcal.addActionListener(ABcal);
        }        
        
    }
    
    public void operaciones(int op){  
        
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width; 
        double x=0.5*width-0.5*tamp;
        double y=0.5*height-0.35*tamp;
        
        this.setLocation((int)(x),(int)(y));
        
        JPanel Pan=new JPanel();
        Pan.setLayout(null);
        Pan.setBackground(Color.white);
        this.getContentPane().add(Pan);

        this.setSize(tam1+tam2+100,(tamp+180));
        this.setMinimumSize(new Dimension(390, 160));

        JLabel Ltit=new JLabel("Ingrese las dos matrices", SwingConstants.CENTER);
        Ltit.setBounds(20,10,200,25);
        Ltit.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Ltit);

        Matriz.setBounds(35, 35, tam1, tam11);
        Matriz.setBackground(Color.lightGray);
        Pan.add(Matriz);  

        Matriz2.setBounds(tam1+60, 35, tam2,tam21);
        Matriz2.setBackground(Color.lightGray);
        Pan.add(Matriz2);  

        Matriz3.setBounds(35, 35, tam2, tam11);
        Matriz3.setBackground(Color.lightGray);
        Matriz3.setVisible(false);
        Pan.add(Matriz3);               

        JButton Bcal=new JButton("Calcular");
        Bcal.setBounds(40,this.getHeight()-125,100,30);
        Pan.add(Bcal); 

        JButton Bgua=new JButton("Guardar resultado");
        Bgua.setBounds(this.getWidth()-180,this.getHeight()-85,150,30);
        Pan.add(Bgua); 
        
           
        ActionListener ABcal = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double[][] mat=new double[matriz.getRowCount()][matriz2.getColumnCount()];
                switch(op){
                    case 1:
                        for(int i=0;i<matriz.getRowCount();i++){
                            for(int j=0;j<matriz.getColumnCount();j++){
                                mat[i][j]=Double.parseDouble(matriz.getValueAt(i, j).toString())+Double.parseDouble(matriz2.getValueAt(i, j).toString());
                            }
                        }                        
                        break;
                    case 2:
                        for(int i=0;i<matriz.getRowCount();i++){
                            for(int j=0;j<matriz.getColumnCount();j++){
                                mat[i][j]=Double.parseDouble(matriz.getValueAt(i, j).toString())-Double.parseDouble(matriz2.getValueAt(i, j).toString());
                            }
                        }  
                        break;
                    case 3:
                        double mult;
                        for(int i=0;i<mat.length;i++){
                            for(int j=0;j<mat[0].length;j++){
                                mult=0;                                
                                for(int k=0;k<matriz.getColumnCount();k++){
                                    mult+=Double.parseDouble(matriz.getValueAt(i, k).toString())*Double.parseDouble(matriz2.getValueAt(k, j).toString());
                                }       
                                mat[i][j]=mult;
                            }
                        }        
                        break;
                }
                
                for(int i=0;i<mat.length;i++){
                    for(int j=0;j<mat[0].length;j++){
                        matriz3.setValueAt(mat[i][j], i, j);
                    }
                }   
                
                Matriz.setVisible(false);
                Matriz2.setVisible(false);
                Matriz3.setVisible(true);
                
            }
        };        
        Bcal.addActionListener(ABcal);        
    }
    
}
