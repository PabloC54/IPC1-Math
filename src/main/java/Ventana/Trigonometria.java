package Ventana;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Trigonometria extends JFrame{
    
    public Trigonometria(int n){
        switch(n){
            case 1:
                seno();
                break;
            case 2:
                coseno();
                break;
            case 3:
                tangente();
                break;
            case 4:
                longitudarco();
                break;
        }
    }    
    
    public Recursos operacion=new Recursos();
    final double pi=3.141592654;
    
    public void seno(){       
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
        this.setTitle("Funciones Trigonométricas");
        this.setSize(300,350);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        JPanel Pan=new JPanel();
        Pan.setLayout(null);
        this.getContentPane().add(Pan);
        
        
        JLabel Ltit=new JLabel("Cálculo del seno de un ángulo", SwingConstants.CENTER);
        Ltit.setBounds(10,10,250,25);
        Ltit.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Ltit);
        
        JLabel L1=new JLabel("sen(", SwingConstants.CENTER);
        L1.setBounds(20,60,40,25);
        L1.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L1);
        
        JTextField Tsen=new JTextField();
        Tsen.setBounds(60,60,40,30);
        Tsen.setCaretPosition(0);
        Pan.add(Tsen);
        
        JLabel L2=new JLabel(")", SwingConstants.CENTER);
        L2.setBounds(90,60,40,25);
        L2.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L2);
        
        String[] ang={"Grados","Radianes"};

        JComboBox Cang=new JComboBox(ang);
        Cang.setBounds(140, 60, 80, 25);  
        Cang.setSelectedItem("Grados");
        Pan.add(Cang);
        
        JLabel Lres=new JLabel("Resultado:", SwingConstants.CENTER);
        Lres.setBounds(10,110,100,25);
        Lres.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lres);
        
        JTextField Tres=new JTextField();
        Tres.setBounds(20,150,140,30);
        Tres.setEditable(false);
        Tres.setHorizontalAlignment(SwingConstants.LEFT);
        Tres.setCaretPosition(0);
        Pan.add(Tres);
        
        JButton Bcal=new JButton("Calcular");
        Bcal.setBounds(180, 150, 80, 30);
        Pan.add(Bcal);  
        
        JButton Bgua=new JButton("Guardar resultado");
        Bgua.setBounds(130, 250, 130, 35);
        Pan.add(Bgua);   
        
        ActionListener ABcal = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Tsen.getText().equals(""))
                    Tsen.setText("0");
                    
                if(Cang.getSelectedItem().equals("Grados")){
                   Tsen.setText(String.valueOf(Double.parseDouble(Tsen.getText())*pi/180));                    
                   Tsen.setText(String.valueOf(operacion.anguloequivalente(Double.parseDouble(Tsen.getText()),1)));
                   Tres.setText(String.valueOf(operacion.seno(Double.parseDouble(Tsen.getText()))));
                }
                else{
                    Tsen.setText(String.valueOf(operacion.anguloequivalente(Double.parseDouble(Tsen.getText()),1)));
                    Tres.setText(String.valueOf(operacion.seno(Double.parseDouble(Tsen.getText()))));             
                }
                
            }
        };        
        Bcal.addActionListener(ABcal);
        
    }
    
   public void coseno(){
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Funciones Trigonométricas");
        this.setSize(300,350);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        JPanel Pan=new JPanel();
        Pan.setLayout(null);
        this.getContentPane().add(Pan);
        
        
        JLabel Ltit=new JLabel("Cálculo del coseno de un ángulo", SwingConstants.CENTER);
        Ltit.setBounds(10,10,250,25);
        Ltit.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Ltit);
        
        JLabel L1=new JLabel("Cos(", SwingConstants.CENTER);
        L1.setBounds(20,60,40,25);
        L1.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L1);
        
        JTextField Tsen=new JTextField();
        Tsen.setBounds(60,60,40,30);
        Pan.add(Tsen);
        
        JLabel L2=new JLabel(")", SwingConstants.CENTER);
        L2.setBounds(90,60,40,25);
        L2.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L2);
        
        String[] ang={"Grados","Radianes"};

        JComboBox Cang=new JComboBox(ang);
        Cang.setBounds(140, 60, 80, 25);  
        Cang.setSelectedItem("Grados");
        Pan.add(Cang);
        
        JLabel Lres=new JLabel("Resultado:", SwingConstants.CENTER);
        Lres.setBounds(10,110,100,25);
        Lres.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lres);        
        
        JTextField Tres=new JTextField();
        Tres.setBounds(20,150,140,30);
        Tres.setEditable(false);
        Tres.setHorizontalAlignment(SwingConstants.LEFT);
        Tres.setCaretPosition(0);
        Pan.add(Tres);
        
        JButton Bcal=new JButton("Calcular");
        Bcal.setBounds(180, 150, 80, 30);
        Pan.add(Bcal);  
        
        JButton Bgua=new JButton("Guardar resultado");
        Bgua.setBounds(130, 250, 130, 35);
        Pan.add(Bgua);  
        
        ActionListener ABcal = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Tsen.getText().equals(""))
                    Tsen.setText("0");
                    
                if(Cang.getSelectedItem().equals("Grados")){
                    Tsen.setText(String.valueOf(Double.parseDouble(Tsen.getText())*pi/180));                    
                    Tsen.setText(String.valueOf(operacion.anguloequivalente(Double.parseDouble(Tsen.getText()),2)));
                    Tres.setText(String.valueOf(operacion.coseno(Double.parseDouble(Tsen.getText()))));
                }
                else{
                    Tsen.setText(String.valueOf(operacion.anguloequivalente(Double.parseDouble(Tsen.getText()),2)));
                    Tres.setText(String.valueOf(operacion.coseno(Double.parseDouble(Tsen.getText()))));             
                }
                
            }
        };        
        Bcal.addActionListener(ABcal);
        
    }    
    
   public void tangente(){
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Funciones Trigonométricas");
        this.setSize(300,350);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        JPanel Pan=new JPanel();
        Pan.setLayout(null);
        this.getContentPane().add(Pan);
        
        
        JLabel Ltit=new JLabel("Cálculo de la tangente de un ángulo", SwingConstants.CENTER);
        Ltit.setBounds(10,10,250,25);
        Ltit.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Ltit);
        
        JLabel L1=new JLabel("Tan(", SwingConstants.CENTER);
        L1.setBounds(20,60,40,25);
        L1.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L1);
        
        JTextField Tsen=new JTextField();
        Tsen.setBounds(60,60,40,30);
        Pan.add(Tsen);
        
        JLabel L2=new JLabel(")", SwingConstants.CENTER);
        L2.setBounds(90,60,40,25);
        L2.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L2);
        
        String[] ang={"Grados","Radianes"};

        JComboBox Cang=new JComboBox(ang);
        Cang.setBounds(140, 60, 80, 25);  
        Cang.setSelectedItem("Grados");
        Pan.add(Cang);
        
        JLabel Lres=new JLabel("Resultado:", SwingConstants.CENTER);
        Lres.setBounds(10,110,100,25);
        Lres.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lres); 
        
        JTextField Tres=new JTextField();
        Tres.setBounds(20,150,140,30);
        Tres.setEditable(false);
        Tres.setHorizontalAlignment(SwingConstants.LEFT);
        Tres.setCaretPosition(0);
        Pan.add(Tres);
        
        JButton Bcal=new JButton("Calcular");
        Bcal.setBounds(180, 150, 80, 30);
        Pan.add(Bcal);       
        
        JButton Bgua=new JButton("Guardar resultado");
        Bgua.setBounds(130, 250, 130, 35);
        Pan.add(Bgua);  
        
        
        ActionListener ABcal = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Cang.getSelectedItem().equals("Grados"))
                    Tsen.setText(String.valueOf(Double.parseDouble(Tsen.getText())*pi/180)); 
                
                Tsen.setText(String.valueOf(operacion.anguloequivalente(Double.parseDouble(Tsen.getText()),3)));
                Tres.setText(String.valueOf(operacion.tangente(Double.parseDouble(Tsen.getText()))));
            }
        };        
        Bcal.addActionListener(ABcal);
    }    
       
   public void longitudarco(){
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Ángulos");
        this.setSize(380,340);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        JPanel Pan=new JPanel();
        Pan.setLayout(null);
        this.getContentPane().add(Pan);
        
        
        JLabel Ltit=new JLabel("Cálculo del arco de una circunferencia", SwingConstants.CENTER);
        Ltit.setBounds(10,10,250,25);
        Ltit.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Ltit);
        
        JLabel L1=new JLabel("Ángulo:", SwingConstants.CENTER);
        L1.setBounds(20,60,80,25);
        L1.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L1);
        
        JTextField Tang=new JTextField();
        Tang.setBounds(90,60,60,30);
        Pan.add(Tang);
        
        JLabel L2=new JLabel("Radio:", SwingConstants.CENTER);
        L2.setBounds(20,110,80,25);
        L2.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L2);
        
        JTextField Trad=new JTextField();
        Trad.setBounds(90,110,60,30);
        Pan.add(Trad);
        
        String[] ang={"Grados","Radianes"};

        JComboBox Cang=new JComboBox(ang);
        Cang.setBounds(200, 60, 80, 25);  
        Cang.setSelectedItem("Grados");
        Pan.add(Cang);
        
        JLabel Lres=new JLabel("Resultado:", SwingConstants.CENTER);
        Lres.setBounds(10,190,100,25);
        Lres.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lres);
        
        JTextField Tres=new JTextField();
        Tres.setBounds(100,190,80,30);
        Tres.setEditable(false);
        Tres.setHorizontalAlignment(SwingConstants.LEFT);
        Tres.setCaretPosition(0);
        Pan.add(Tres);
        
        JButton Bcal=new JButton("Calcular");
        Bcal.setBounds(240, 190, 100, 30);
        Pan.add(Bcal);       
        
        JButton Bgua=new JButton("Guardar resultado");
        Bgua.setBounds(210, 250, 130, 35);
        Pan.add(Bgua);  
        
        ActionListener ABcal = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(Tang.getText()=="")
                    Tang.setText("0");
                
                if(Trad.getText()=="")
                    Trad.setText("0");
                
                if(Cang.getSelectedItem().equals("Grados"))
                    Tang.setText(String.valueOf(Double.parseDouble(Tang.getText())*pi/180));
                
                double lon=Double.parseDouble(Tang.getText())*Double.parseDouble(Trad.getText());
                
                Tres.setText(String.valueOf(lon));
                
            }
        };        
        Bcal.addActionListener(ABcal);
    }   
}
