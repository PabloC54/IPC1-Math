package Ventana;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class Aritmetica extends JFrame {
    
    public int opselec=0;  
    // 0:nada  1:suma  2:resta  3:multip.  4:division  
    public Double opizq, op,p0;
    public boolean err=false;
    
    
    public Recursos operacion=new Recursos();
    
    public Aritmetica(){
        calculadora();
        
    }
    
    public void calculadora(){
        
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Calculadora");
        this.setSize(420,520);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        JPanel Pan=new JPanel();
        Pan.setLayout(null);
        this.getContentPane().add(Pan);
        
        //Campo de calculo
        
        JTextField Tnum=new JTextField("");
        Tnum.setBounds(20,20,250,60);
        Tnum.setFont(new Font("arial",Font.PLAIN,25));
        Tnum.setHorizontalAlignment(JTextField.RIGHT);
        Tnum.setEditable(false);
        Pan.add(Tnum);
        
        //Boton calcular
                
        JButton Bcal=new JButton("Calcular");
        Bcal.setBounds(290, 30, 90, 40);
        Pan.add(Bcal);
        
        //Boton eliminar
        
        JButton Beli=new JButton("C");
        Beli.setFont(new Font("arial",Font.PLAIN,20));
        Beli.setBounds(300, 120, 70, 70);
        Pan.add(Beli);
        
        //Boton guardar
        
        JButton Bgua=new JButton("Guardar resultado");
        Bgua.setBounds(240, 435, 140, 25);
        Pan.add(Bgua);
        
        // Botones
        
        JButton B1=new JButton("1");
        B1.setFont(new Font("arial",Font.PLAIN,16));
        B1.setBounds(30, 300, 45, 45);
        Pan.add(B1);
        
        JButton B2=new JButton("2");
        B2.setFont(new Font("arial",Font.PLAIN,16));
        B2.setBounds(90, 300, 45, 45);
        Pan.add(B2);
        
        JButton B3=new JButton("3");
        B3.setFont(new Font("arial",Font.PLAIN,16));
        B3.setBounds(150, 300, 45, 45);
        Pan.add(B3);       
        
        JButton B4=new JButton("4");
        B4.setFont(new Font("arial",Font.PLAIN,16));
        B4.setBounds(30, 240, 45, 45);
        Pan.add(B4);
        
        JButton B5=new JButton("5");
        B5.setFont(new Font("arial",Font.PLAIN,16));
        B5.setBounds(90, 240, 45, 45);
        Pan.add(B5);
        
        JButton B6=new JButton("6");
        B6.setFont(new Font("arial",Font.PLAIN,16));
        B6.setBounds(150, 240, 45, 45);
        Pan.add(B6);
        
        JButton B7=new JButton("7");
        B7.setFont(new Font("arial",Font.PLAIN,16));
        B7.setBounds(30, 180, 45, 45);
        Pan.add(B7);
        
        JButton B8=new JButton("8");
        B8.setFont(new Font("arial",Font.PLAIN,16));
        B8.setBounds(90, 180, 45, 45);
        Pan.add(B8);
        
        JButton B9=new JButton("9");
        B9.setFont(new Font("arial",Font.PLAIN,16));
        B9.setBounds(150, 180, 45, 45);
        Pan.add(B9);
        
        JButton Bneg=new JButton("(-)");
        Bneg.setFont(new Font("arial",Font.PLAIN,14));
        Bneg.setBounds(25, 360, 55, 45);
        Pan.add(Bneg);
        
        JButton B0=new JButton("0");
        B0.setFont(new Font("arial",Font.PLAIN,16));
        B0.setBounds(90, 360, 45, 45);
        Pan.add(B0);
        
        JButton Binv=new JButton("1/x");
        Binv.setFont(new Font("arial",Font.PLAIN,14));
        Binv.setBounds(145, 360, 55, 45);
        Pan.add(Binv);
        
        
        JButton Bsqr=new JButton("√");
        Bsqr.setFont(new Font("arial",Font.PLAIN,18));
        Bsqr.setBounds(25, 120, 55, 35);
        Pan.add(Bsqr);
        
        JButton Bnrt=new JButton("n√");
        Bnrt.setFont(new Font("arial",Font.PLAIN,18));
        Bnrt.setBounds(85, 120, 55, 35);
        Pan.add(Bnrt);
        
        JButton Bpot=new JButton("^");
        Bpot.setFont(new Font("arial",Font.PLAIN,18));
        Bpot.setBounds(145, 120, 55, 35);
        Pan.add(Bpot);
        
        
        JButton Bfac=new JButton("!");
        Bfac.setFont(new Font("arial",Font.PLAIN,18));
        Bfac.setBounds(225, 120, 45, 45);
        Pan.add(Bfac);
        
        JButton Bsum=new JButton("+");
        Bsum.setFont(new Font("arial",Font.PLAIN,18));
        Bsum.setBounds(225, 180, 45, 45);
        Pan.add(Bsum);
        
        JButton Bres=new JButton("-");
        Bres.setFont(new Font("arial",Font.PLAIN,18));
        Bres.setBounds(225, 240, 45, 45);
        Pan.add(Bres);
        
        JButton Bmul=new JButton("*");
        Bmul.setFont(new Font("arial",Font.PLAIN,18));
        Bmul.setBounds(225, 300, 45, 45);
        Pan.add(Bmul);
        
        JButton Bdiv=new JButton("/");
        Bdiv.setFont(new Font("arial",Font.PLAIN,18));
        Bdiv.setBounds(225, 360, 45, 45);
        Pan.add(Bdiv);
                
        // Eventos
        
        ActionListener AB1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(err==false)                    
                Tnum.setText(Tnum.getText()+"1");
            }
        };        
        B1.addActionListener(AB1);

        ActionListener AB2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                if(err==false)                                  
                Tnum.setText(Tnum.getText()+"2");                
            }
        };        
        B2.addActionListener(AB2);

        ActionListener AB3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(err==false)                   
                Tnum.setText(Tnum.getText()+"3");
            }
        };        
        B3.addActionListener(AB3);

        ActionListener AB4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(err==false)                   
                Tnum.setText(Tnum.getText()+"4");
            }
        };        
        B4.addActionListener(AB4);

        ActionListener AB5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(err==false)                   
                Tnum.setText(Tnum.getText()+"5");
            }
        };        
        B5.addActionListener(AB5);

        ActionListener AB6 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(err==false)                   
                Tnum.setText(Tnum.getText()+"6");
            }
        };        
        B6.addActionListener(AB6);

        ActionListener AB7 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(err==false)                   
                Tnum.setText(Tnum.getText()+"7");
            }
        };        
        B7.addActionListener(AB7); 

        ActionListener AB8 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(err==false)                   
                Tnum.setText(Tnum.getText()+"8");
            }
        };        
        B8.addActionListener(AB8);

        ActionListener AB9 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(err==false)                   
                Tnum.setText(Tnum.getText()+"9");
            }
        };        
        B9.addActionListener(AB9);

        ActionListener AB0 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(err==false)                   
                Tnum.setText(Tnum.getText()+"0");
            }
        };        
        B0.addActionListener(AB0);
        
        // Eliminar

        ActionListener ABeli = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tnum.setText("");
                opselec=0;
                err=false;
            }
        };        
        Beli.addActionListener(ABeli);
        
        // Eventos Aritmeticos

        ActionListener ABneg = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                if(err==false || Tnum.getText().equals("")){                   
                    op=-1*Double.parseDouble(Tnum.getText());
                    Tnum.setText(String.valueOf(op));
                }
            }
        };        
        Bneg.addActionListener(ABneg);

        ActionListener ABinv = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(err==false || Tnum.getText().equals("")){                   
                    op=1/Double.parseDouble(Tnum.getText());
                    Tnum.setText(String.valueOf(op));
                }
            }                
        };        
        Binv.addActionListener(ABinv);

        ActionListener ABsum = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(opselec==0 && err==false){
                    
                    opizq=Double.parseDouble(Tnum.getText());
                    Tnum.setText("");
                    opselec=1;
                }
            }
        };     
        Bsum.addActionListener(ABsum);

        ActionListener ABres = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(opselec==0 && err==false){
                    
                    opizq=Double.parseDouble(Tnum.getText());
                    Tnum.setText("");
                    opselec=2;
                }
            }
        };     
        Bres.addActionListener(ABres);

        ActionListener ABmul = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(opselec==0 && err==false){
                    
                    opizq=Double.parseDouble(Tnum.getText());
                    Tnum.setText("");
                    opselec=3;
                }
            }
        };     
        Bmul.addActionListener(ABmul);        

        ActionListener ABdiv = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(opselec==0 && err==false){                    
                    opizq=Double.parseDouble(Tnum.getText());
                    Tnum.setText("");
                    opselec=4;
                }
            }
        };     
        Bdiv.addActionListener(ABdiv);
        
        ActionListener ABpot = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(opselec==0 && err==false){                    
                    opizq=Double.parseDouble(Tnum.getText());
                    Tnum.setText("");
                    opselec=5;
                }
            }
        };        
        Bpot.addActionListener(ABpot);
        
        ActionListener ABsqr = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {              
                if(Double.parseDouble(Tnum.getText())>0 && opselec==0 && err==false)
                    Tnum.setText(String.valueOf(operacion.raizcuadrada(Double.parseDouble(Tnum.getText()))));      
                else{
                    Tnum.setText("Error matemático");
                    err=true;
                }
            }
        };        
        Bsqr.addActionListener(ABsqr);
                
        ActionListener ABnrt = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                                                                    
                if(opselec==0 && err==false){                    
                    opizq=Double.parseDouble(Tnum.getText());
                    Tnum.setText("");
                    opselec=6;
                }      
            }
        };        
        Bnrt.addActionListener(ABnrt);
        
        ActionListener ABfac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {              
                if(Double.parseDouble(Tnum.getText())>0 && Double.parseDouble(Tnum.getText())%1==0 && opselec==0 && err==false)
                    Tnum.setText(String.valueOf(operacion.factorial(Integer.parseInt(Tnum.getText()))));      
                else{
                    Tnum.setText("Error matemático");
                    err=true;
                }
            }
        };        
        Bfac.addActionListener(ABfac);
        
        
        // Evento Calcular
        
        ActionListener ABcal = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(opselec){
                    case 1:
                        op=opizq+Double.parseDouble(Tnum.getText());
                        Tnum.setText(String.valueOf(op));  
                        break;
                    
                    case 2:
                        op=opizq-Double.parseDouble(Tnum.getText());
                        Tnum.setText(String.valueOf(op));  
                        break;
                    
                    case 3:
                        op=opizq*Double.parseDouble(Tnum.getText());
                        Tnum.setText(String.valueOf(op));  
                        break;
                    
                    case 4:
                        if(Double.parseDouble(Tnum.getText())==0){
                            Tnum.setText("Error Matemático");
                            err=true;
                        }
                        else{                        
                            op=opizq/Double.parseDouble(Tnum.getText());
                            Tnum.setText(String.valueOf(op));  
                            break;    
                        }   
                    
                    case 5:
                        if(Double.parseDouble(Tnum.getText())==0 || Tnum.getText().equals("")) 
                            Tnum.setText("1");                             
                        else{                            
                            Tnum.setText(String.valueOf(operacion.potencia(opizq, Integer.parseInt(Tnum.getText()))));
                            }     
                        break;
                                   
                    case 6:
                        if(Double.parseDouble(Tnum.getText())==0 || Tnum.getText().equals("")) 
                            Tnum.setText("1");                             
                        else        
                            if(Integer.parseInt(Tnum.getText())%2==0)
                                Tnum.setText(String.valueOf(operacion.raizN(opizq,Integer.parseInt(Tnum.getText()))));
                            else{
                                Tnum.setText("Error matemático");
                                err=true;
                            }
                               
                        break;    
                           
                }
                opselec=0;
            }
        };        
        Bcal.addActionListener(ABcal);        
        
        
    }
    
    
}
