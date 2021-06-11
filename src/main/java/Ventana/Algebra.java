
package Ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class Algebra extends JFrame {
    
    public Recursos operacion=new Recursos();
    public int tam;
    public DefaultTableModel matriz = new DefaultTableModel();
    public JTable Matriz = new JTable(matriz);
    
    public Algebra(int n){
        switch(n){
            case 1:
                ecuacioncuadratica();
                break;
            case 2:
                sistemaecuaciones();
                break;
            case 3:
                binomiocuadrado();
                break;
            case 4:
                diferenciacuadrados();
                break;
            case 5:
                diferenciacubos();
                break;
        }
    }
    
    public void ecuacioncuadratica(){
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        this.setTitle("Ecuaciones");
        this.setSize(350,400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        JPanel Pan=new JPanel();
        Pan.setLayout(null);
        this.getContentPane().add(Pan);
        
        // Textos
        
        JLabel Ltit=new JLabel("Ingrese a, b y c de la ecuación cuadrática", SwingConstants.CENTER);
        Ltit.setBounds(10,10,300,25);
        Ltit.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Ltit);
        
        JLabel La=new JLabel("a", SwingConstants.CENTER);
        La.setBounds(50,50,25,25);
        La.setFont(new Font("arial",Font.PLAIN,16));
        Pan.add(La);
        
        JLabel Lb=new JLabel("b", SwingConstants.CENTER);
        Lb.setBounds(140,50,25,25);
        Lb.setFont(new Font("arial",Font.PLAIN,16));
        Pan.add(Lb);
        
        JLabel Lc=new JLabel("c", SwingConstants.CENTER);
        Lc.setBounds(230,50,25,25);
        Lc.setFont(new Font("arial",Font.PLAIN,16));
        Pan.add(Lc);
        
        
        JLabel Lres=new JLabel("Resultados", SwingConstants.CENTER);
        Lres.setBounds(10,140,300,25);
        Lres.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lres);
        
        JLabel Lres1=new JLabel("Resultado 1", SwingConstants.CENTER);
        Lres1.setBounds(20,180,100,25);
        Lres1.setFont(new Font("arial",Font.PLAIN,16));
        Pan.add(Lres1);
        
        JLabel Lres2=new JLabel("Resultado 2", SwingConstants.CENTER);
        Lres2.setBounds(20,220,100,25);
        Lres2.setFont(new Font("arial",Font.PLAIN,16));
        Pan.add(Lres2);
        
        
        
        
        // Cajas
        
        JTextField Ta=new JTextField("");
        Ta.setBounds(35,90,50,25);
        Pan.add(Ta);
        
        JTextField Tb=new JTextField("");
        Tb.setBounds(125,90,50,25);
        Pan.add(Tb);
        
        JTextField Tc=new JTextField("");
        Tc.setBounds(215,90,50,25);
        Pan.add(Tc);
        
        
        JTextField Tres1=new JTextField(5);
        Tres1.setBounds(130,180,170,25);
        Tres1.setEditable(false);
        Tres1.setHorizontalAlignment(JTextField.LEFT);
        Pan.add(Tres1);
        
        JTextField Tres2=new JTextField(5);
        Tres2.setBounds(130,220,170,25);
        Tres2.setEditable(false);
        Tres2.setHorizontalAlignment(JTextField.LEFT);
        Pan.add(Tres2);
                
        // Botones
                
        JButton Bcal=new JButton("Calcular");
        Bcal.setBounds(130, 260, 90, 25);
        Pan.add(Bcal);
                
        JButton Bres=new JButton("Guardar resultado");
        Bres.setBounds(170, 310, 140, 30);
        Pan.add(Bres);       
        
        // Eventos
        

        ActionListener ABcal = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double p0=10;
                double valor=Double.parseDouble(Tb.getText())*Double.parseDouble(Tb.getText())-4*Double.parseDouble(Ta.getText())*Double.parseDouble(Tc.getText());
                   
                
                
                
                if(valor>=0){
                    
                    for(int i=0;i<100;i++){     // Discriminante
                        double numn=p0*p0-valor;
                        double denn=2*p0;

                        double p1=p0-numn/denn;
                        p0=p1;
                    }

                    double num1=-1*Double.parseDouble(Tb.getText())+p0;
                    double num2=-1*Double.parseDouble(Tb.getText())-p0;
                    double den=2*Double.parseDouble(Ta.getText());

                    Tres1.setText(String.valueOf(num1/den));
                    Tres2.setText(String.valueOf(num2/den));
                }
                else{
                    double num=-1*Double.parseDouble(Tb.getText());
                    double den=2*Double.parseDouble(Ta.getText());
                    double real=num/den;
                    
                    valor=-1*valor;
                    for(int i=0;i<100;i++){     // Discriminante
                        double numn=p0*p0-valor;
                        double denn=2*p0;

                        double p1=p0-numn/denn;
                        p0=p1;
                    }
                    
                    double img=p0/den;
                    
                    Tres1.setText(String.valueOf(real+"+"+img+"i"));
                    Tres2.setText(String.valueOf(real+"-"+img+"i"));
                    
                }
            }
        };     
        Bcal.addActionListener(ABcal);
        
    }     
    
    public boolean tamingresado=false;
    
    public void sistemaecuaciones(){   
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        this.setTitle("Ecuaciones");
        this.setSize(300,150);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        JPanel Pan1=new JPanel();
        Pan1.setLayout(null);
        this.getContentPane().add(Pan1);
        
        
        JLabel Ltit=new JLabel("Tamaño del sistema:", SwingConstants.CENTER);
        Ltit.setBounds(10,10,180,25);
        Ltit.setFont(new Font("arial",Font.PLAIN,14));
        Pan1.add(Ltit);
        
        JTextField Ttam=new JTextField();
        Ttam.setBounds(180,10,50,30);
        Pan1.add(Ttam);
                
        JButton Bcon=new JButton("Continuar");
        Bcon.setBounds(100, 55, 100, 30);
        Pan1.add(Bcon);      
        
        
        KeyListener ATtam = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
                char validar=e.getKeyChar();
                                
                if(Character.isLetter(validar)){
                    tamingresado=false;
                    e.consume();
                }
                else
                    tamingresado=true;
            }

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {}

        };        
        Ttam.addKeyListener(ATtam);
        
        ActionListener ABcon = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(tamingresado==true && Integer.parseInt(Ttam.getText())>=2 && Integer.parseInt(Ttam.getText())<=8){
               
               matriz.setColumnCount(Integer.parseInt(Ttam.getText())+2);
               matriz.setRowCount(Integer.parseInt(Ttam.getText()));
               tam=35*Integer.parseInt(Ttam.getText());
               
               for(int i=0;i<matriz.getRowCount();i++){
                   
               }
                
               Pan1.setVisible(false);
               sistemaecuaciones2();
               }
            }
        };        
        Bcon.addActionListener(ABcon);
    
    }
    
    public void sistemaecuaciones2(){
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
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
        this.setSize((int) 1.1*tam+100,(int)(0.55*tam+180));
        this.setMinimumSize(new Dimension(450, 230));

        JLabel Ltit=new JLabel("Ingrese el sistema de ecuaciones como una matriz", SwingConstants.CENTER);
        Ltit.setBounds(10,10,400,25);
        Ltit.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Ltit);
        
        int posl=45;
        for(int i=1;i<=Matriz.getRowCount();i++){  
            JLabel L1=new JLabel("X"+i);
            L1.setBounds(posl,35,20,25);
            Pan.add(L1);
            posl+=35;            
        }
        
        JLabel Li=new JLabel(" =");
        Li.setBounds(posl,35,20,25);
        Pan.add(Li);

        JLabel Lb=new JLabel(" b");
        Lb.setBounds(posl+30,35,20,25);
        Pan.add(Lb);

        Matriz.setBounds(35, 65, (int) (tam+70), (int)(0.46*tam));
        Matriz.setBackground(Color.lightGray);
        Pan.add(Matriz);               

        JButton Bcal=new JButton("Calcular");
        Bcal.setBounds(180,this.getHeight()-125,100,30);
        Pan.add(Bcal); 

        JButton Bgua=new JButton("Guardar resultado");
        Bgua.setBounds(this.getWidth()-180,this.getHeight()-85,150,30);
        Pan.add(Bgua); 

        ActionListener ABcal = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for(int i=0;i<matriz.getRowCount();i++){
                    for (int j=0;j<matriz.getColumnCount();j++){                        
                        if(matriz.getValueAt(i, j)==null || matriz.getValueAt(i, j).equals(""))                            
                        matriz.setValueAt("0", i, j);
                    }
                }

                double[][] mat=new double[matriz.getRowCount()][matriz.getColumnCount()-1];
                int matrizy;
                for(int i=0;i<matriz.getRowCount();i++){
                    matrizy=0;
                    for (int j=0;j<mat[0].length;j++){
                        if(j==matriz.getColumnCount()-2)
                            matrizy++;
                        mat[i][j]=Double.parseDouble(matriz.getValueAt(i,matrizy).toString());
                        System.out.println("sin error");
                        matrizy++;
                    }
                }
            
                double[] matres=operacion.cramer(mat);
                
                for(int i=0;i<matriz.getRowCount();i++){
                    for (int j=0;j<matriz.getColumnCount();j++){  
                        matriz.setValueAt("", i, j);
                    }
                }

                for(int i=1;i<=matriz.getRowCount();i++){
                    matriz.setValueAt("X"+i+"=", i-1, 0);
                    matriz.setValueAt(matres[i-1], i-1, 1);                    
                }
            }
        };        
        Bcal.addActionListener(ABcal);                
    }
    
    public void binomiocuadrado(){
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        this.setTitle("Factorización");
        this.setSize(350,400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        JPanel Pan=new JPanel();
        Pan.setLayout(null);
        this.getContentPane().add(Pan);
        
        // Textos
        
        JLabel Ltit=new JLabel("Binomio al cuadrado", SwingConstants.CENTER);
        Ltit.setBounds(10,10,250,25);
        Ltit.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Ltit);
        
        JLabel L1=new JLabel("(", SwingConstants.CENTER);
        L1.setBounds(30,50,40,25);
        L1.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L1);
        
        JLabel L2=new JLabel("A²+", SwingConstants.CENTER);
        L2.setBounds(100,50,40,25);
        L2.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L2);
        
        JLabel L3=new JLabel("AB+", SwingConstants.CENTER);
        L3.setBounds(170,50,40,25);
        L3.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L3);
        
        JLabel L4=new JLabel("B²)", SwingConstants.CENTER);
        L4.setBounds(240,50,40,25);
        L4.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L4);
        
        JLabel Lres=new JLabel("Resultado:", SwingConstants.CENTER);
        Lres.setBounds(10,100,200,25);
        Lres.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lres);
        
        JLabel Lr1=new JLabel("(", SwingConstants.CENTER);
        Lr1.setBounds(50,150,40,25);
        Lr1.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lr1);
        
        JLabel Lr2=new JLabel("A", SwingConstants.CENTER);
        Lr2.setBounds(110,150,40,25);
        Lr2.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lr2);
        
        JLabel Lr3=new JLabel("B)²", SwingConstants.CENTER);
        Lr3.setBounds(220,150,40,25);
        Lr3.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lr3);
        
        JLabel Lerr=new JLabel("El trinomio no es cuadrado perfecto.", SwingConstants.CENTER);
        Lerr.setBounds(40,250,250,25);
        Lerr.setFont(new Font("arial",Font.PLAIN,14));
        Lerr.setVisible(false);
        Pan.add(Lerr);

        //Cajas
        
        JTextField T1=new JTextField();
        T1.setBounds(62,50,44,25);
        Pan.add(T1);
        
        JTextField T2=new JTextField();
        T2.setBounds(132,50,44,25);
        Pan.add(T2);
        
        JTextField T3=new JTextField();
        T3.setBounds(204,50,44,25);
        Pan.add(T3);
        
        JTextField Tr1=new JTextField();
        Tr1.setBounds(80,150,40,25);
        Tr1.setEditable(false);
        Tr1.setHorizontalAlignment(SwingConstants.LEFT);
        Pan.add(Tr1);
        
        JTextField Tr2=new JTextField();
        Tr2.setBounds(140,150,30,25);
        Tr2.setEditable(false);
        Tr2.setHorizontalAlignment(SwingConstants.LEFT);
        Pan.add(Tr2);
        
        JTextField Tr3=new JTextField();
        Tr3.setBounds(180,150,50,25);
        Tr3.setEditable(false);
        Tr3.setHorizontalAlignment(SwingConstants.LEFT);
        Pan.add(Tr3);
        
        // Botones

        JButton Bcal=new JButton("Calcular");
        Bcal.setBounds(115, 200, 100, 30);
        Pan.add(Bcal);  

        JButton Bgua=new JButton("Guardar resultado");
        Bgua.setBounds(120, 300, 180, 30);
        Pan.add(Bgua);  
        
        // Eventos 

        ActionListener ABcal = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(Double.parseDouble(T1.getText())==0 && Double.parseDouble(T2.getText())==0 && Double.parseDouble(T3.getText())==0){}
                else{
                    double p0=10,r1=0,r2=0;

                    for(int i=0;i<100;i++){     
                        double numn=p0*p0-Double.parseDouble(T1.getText());
                        double denn=2*p0;

                        r1=p0-numn/denn;
                        p0=r1;
                    }

                    p0=10;

                    for(int i=0;i<100;i++){   
                        double numn=p0*p0-Double.parseDouble(T3.getText());
                        double denn=2*p0;

                        r2=p0-numn/denn;
                        p0=r2;                        
                    }                    
                    double cond;      
                    if(Double.parseDouble(T2.getText())<0){
                        cond=-2*r1*r2;
                    }
                    else{                                                          
                        cond=2*r1*r2;
                    }

                    if(Double.parseDouble(T2.getText())>cond-0.1 &&Double.parseDouble(T2.getText())<cond+0.1){
                        Lerr.setVisible(false);
                        Tr1.setText(String.valueOf(r1));                        
                        
                        if(Double.parseDouble(T2.getText())<0)
                            Tr2.setText("  -");
                        else                            
                            Tr2.setText("  +");
                        
                        Tr3.setText(String.valueOf(r2));
                    }   
                    else{
                        T1.setText("");
                        T2.setText("");
                        T3.setText("");
                        Lerr.setVisible(true);
                    }
                }      
            }
        };        
        Bcal.addActionListener(ABcal);
        
    }
    
    public void diferenciacuadrados(){ 
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        this.setTitle("Factorización");
        this.setSize(350,350);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        JPanel Pan=new JPanel();
        Pan.setLayout(null);
        this.getContentPane().add(Pan);
        
        // Textos
        
        JLabel Ltit=new JLabel("Diferencia de cuadrados", SwingConstants.CENTER);
        Ltit.setBounds(10,10,200,25);
        Ltit.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Ltit);
        
        JLabel L1=new JLabel("(", SwingConstants.CENTER);
        L1.setBounds(50,50,40,25);
        L1.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L1);
        
        JLabel L2=new JLabel("A²) - (", SwingConstants.CENTER);
        L2.setBounds(130,50,40,25);
        L2.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L2);
        
        JLabel L3=new JLabel("B²)", SwingConstants.CENTER);
        L3.setBounds(215,50,40,25);
        L3.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L3);
        
        JLabel Lres=new JLabel("Resultado:", SwingConstants.CENTER);
        Lres.setBounds(10,100,200,25);
        Lres.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lres);
        
        JLabel Lr1=new JLabel("(", SwingConstants.CENTER);
        Lr1.setBounds(30,150,40,25);
        Lr1.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lr1);
        
        JLabel Lr2=new JLabel("A+", SwingConstants.CENTER);
        Lr2.setBounds(90,150,40,25);
        Lr2.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lr2);
        
        JLabel Lr3=new JLabel("B) (", SwingConstants.CENTER);
        Lr3.setBounds(150,150,40,25);
        Lr3.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lr3);
        
        JLabel Lr4=new JLabel("A-", SwingConstants.CENTER);
        Lr4.setBounds(210,150,40,25);
        Lr4.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lr4);
        
        JLabel Lr5=new JLabel("B)", SwingConstants.CENTER);
        Lr5.setBounds(270,150,40,25);
        Lr5.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lr5);

        //Cajas
        
        JTextField T1=new JTextField();
        T1.setBounds(80,50,50,25);
        Pan.add(T1);
        
        JTextField T2=new JTextField();
        T2.setBounds(170,50,50,25);
        Pan.add(T2);
        
        JTextField Tr1=new JTextField();
        Tr1.setBounds(60,150,35,25);
        Tr1.setEditable(false);
        Pan.add(Tr1);
        
        JTextField Tr2=new JTextField();
        Tr2.setBounds(120,150,35,25);
        Tr2.setEditable(false);
        Pan.add(Tr2);
        
        JTextField Tr3=new JTextField();
        Tr3.setBounds(185,150,35,25);
        Tr3.setEditable(false);
        Pan.add(Tr3);
        
        JTextField Tr4=new JTextField();
        Tr4.setBounds(240,150,35,25);
        Tr4.setEditable(false);
        Pan.add(Tr4);
        
        // Botones

        JButton Bcal=new JButton("Calcular");
        Bcal.setBounds(115, 200, 100, 30);
        Pan.add(Bcal);  

        JButton Bgua=new JButton("Guardar resultado");
        Bgua.setBounds(120, 250, 180, 30);
        Pan.add(Bgua);   
        
        // Eventos
        
        ActionListener ABcal = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Double.parseDouble(T1.getText())<0)
                    T1.setText(String.valueOf(-1*Double.parseDouble(T1.getText())));
                if(Double.parseDouble(T2.getText())<0)
                    T1.setText(String.valueOf(-1*Double.parseDouble(T2.getText())));
                
                double p0=10,p1,r1,r2;
                
                for(int i=0;i<100;i++){   
                    double numn=p0*p0-Double.parseDouble(T1.getText());
                    double denn=2*p0;

                    p1=p0-numn/denn;
                    p0=p1;    
                }   
                r1=p0;
                
                p0=10;
                for(int i=0;i<100;i++){   
                    double numn=p0*p0-Double.parseDouble(T2.getText());
                    double denn=2*p0;

                    p1=p0-numn/denn;
                    p0=p1;    
                }   
                r2=p0;
                
                Tr1.setText(String.valueOf(r1));
                Tr2.setText(String.valueOf(r2));
                Tr3.setText(String.valueOf(r1));
                Tr4.setText(String.valueOf(r2));
                
            }
        };        
        Bcal.addActionListener(ABcal);
        
    }    
        
    public void diferenciacubos(){ 
        
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Factorización");
        this.setSize(550,350);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        JPanel Pan=new JPanel();
        Pan.setLayout(null);
        this.getContentPane().add(Pan);
        
        // Textos
        
        JLabel Ltit=new JLabel("Diferencia de cubos", SwingConstants.CENTER);
        Ltit.setBounds(10,10,200,25);
        Ltit.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Ltit);
        
        JLabel L1=new JLabel("(", SwingConstants.CENTER);
        L1.setBounds(50,50,40,25);
        L1.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L1);
        
        JLabel L2=new JLabel("A³)", SwingConstants.CENTER);
        L2.setBounds(120,50,40,25);
        L2.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L2);
        
        String[] signo={"+","-"};
        
        JComboBox Csgn=new JComboBox(signo);
        Csgn.setBounds(155, 50, 40, 25);  
        Csgn.setSelectedItem("+");
        Pan.add(Csgn);
        
        
        JLabel L3=new JLabel("(", SwingConstants.CENTER);
        L3.setBounds(180,50,40,25);
        L3.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L3);
        
        JLabel L4=new JLabel("B³)", SwingConstants.CENTER);
        L4.setBounds(250,50,40,25);
        L4.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L4);
        
        JLabel Lres=new JLabel("Resultado:", SwingConstants.CENTER);
        Lres.setBounds(10,100,200,25);
        Lres.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lres);
        
        JLabel Lr1=new JLabel("(", SwingConstants.CENTER);
        Lr1.setBounds(30,150,40,25);
        Lr1.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lr1);
        
        JLabel Lr2=new JLabel("A", SwingConstants.CENTER);
        Lr2.setBounds(85,150,40,25);
        Lr2.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lr2);
        
        JLabel Lr3=new JLabel("B) (", SwingConstants.CENTER);
        Lr3.setBounds(185,150,40,25);
        Lr3.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lr3);
        
        JLabel Lr4=new JLabel("A² -", SwingConstants.CENTER);
        Lr4.setBounds(260,150,40,25);
        Lr4.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lr4);
        
        JLabel Lr5=new JLabel("B)", SwingConstants.CENTER);
        Lr5.setBounds(290,150,40,25);
        Lr5.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lr5);
        
        JLabel Lr6=new JLabel("AB +", SwingConstants.CENTER);
        Lr6.setBounds(360,150,40,25);
        Lr6.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lr6);
        
        JLabel Lr7=new JLabel("B²)", SwingConstants.CENTER);
        Lr7.setBounds(430,150,40,25);
        Lr7.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lr7);

        //Cajas
        
        JTextField T1=new JTextField();
        T1.setBounds(80,50,50,25);
        Pan.add(T1);
        
        JTextField T2=new JTextField();
        T2.setBounds(210,50,50,25);
        Pan.add(T2);
        
        JTextField Tr1=new JTextField();
        Tr1.setBounds(60,150,35,25);
        Tr1.setEditable(false);
        Pan.add(Tr1);
        
        JTextField Tr2=new JTextField();
        Tr2.setBounds(120,150,30,25);
        Tr2.setEditable(false);
        Pan.add(Tr2);
        
        JTextField Tr3=new JTextField();
        Tr3.setBounds(155,150,35,25);
        Tr3.setEditable(false);
        Pan.add(Tr3);
        
        JTextField Tr4=new JTextField();
        Tr4.setBounds(225,150,35,25);
        Tr4.setEditable(false);
        Pan.add(Tr4);
        
        JTextField Tr5=new JTextField();
        Tr5.setBounds(295,150,30,25);
        Tr5.setEditable(false);
        Pan.add(Tr5);
        
        JTextField Tr6=new JTextField();
        Tr6.setBounds(330,150,35,25);
        Tr6.setEditable(false);
        Pan.add(Tr6);
        
        JTextField Tr7=new JTextField();
        Tr7.setBounds(400,150,35,25);
        Tr7.setEditable(false);
        Pan.add(Tr7);
        
        // Botones

        JButton Bcal=new JButton("Calcular");
        Bcal.setBounds(190, 200, 100, 30);
        Pan.add(Bcal);  

        JButton Bgua=new JButton("Guardar resultado");
        Bgua.setBounds(320, 250, 180, 30);
        Pan.add(Bgua);          
        
        // Eventos
        
        ActionListener ABcal = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(T1.getText().equals("") && T2.getText().equals("")){}
                else{                
                    double p0=10,p1,r1,r2;
                    for(int i=0;i<100;i++){   
                        double numn=p0*p0*p0-Double.parseDouble(T1.getText());
                        double denn=3*p0*p0;

                        p1=p0-numn/denn;
                        p0=p1;    
                    }
                    r1=p0;

                    p0=10;
                    for(int i=0;i<100;i++){   
                        double numn=p0*p0*p0-Double.parseDouble(T2.getText());
                        double denn=3*p0*p0;

                        p1=p0-numn/denn;
                        p0=p1;    
                    }
                    r2=p0;

                    if(Csgn.getSelectedItem().equals("+")){
                        Tr2.setText("  +");
                        Tr5.setText("  -");
                    }
                    else{                
                        Tr2.setText("  -");
                        Tr5.setText("  +");
                    }

                    Tr1.setText(String.valueOf(r1));
                    Tr3.setText(String.valueOf(r2));
                    Tr4.setText(String.valueOf(r1*r1));
                    Tr6.setText(String.valueOf(r1*r2));
                    Tr7.setText(String.valueOf(r2*r2));
                }
            }
        };        
        Bcal.addActionListener(ABcal);
        
    }
    
    
}
