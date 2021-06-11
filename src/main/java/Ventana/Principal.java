package Ventana;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class Principal extends JFrame {
    
    public Principal(){
                      
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Aplicación");
        this.setSize(1050,600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        JPanel Pan=new JPanel();
        Pan.setLayout(null);
        this.getContentPane().add(Pan);
        
        // Titulo
        
        JLabel Ltit=new JLabel("Proyecto 1", SwingConstants.CENTER);
        Ltit.setBounds(10,10,150,25);
        Ltit.setFont(new Font("arial",Font.PLAIN,20));
        Pan.add(Ltit);
        
        
        // Subtitulos de la ventana
        
        JLabel Lari=new JLabel("Aritmética", SwingConstants.CENTER);
        Lari.setBounds(20,50,110,25);
        Lari.setFont(new Font("arial",Font.PLAIN,16));
        Pan.add(Lari);
        
        JLabel Lalg=new JLabel("Álgebra", SwingConstants.CENTER);
        Lalg.setBounds(220,50,110,25);
        Lalg.setFont(new Font("arial",Font.PLAIN,16));
        Pan.add(Lalg);
        
        JLabel Ltri=new JLabel("Trigonometría", SwingConstants.CENTER);
        Ltri.setBounds(420,50,110,25);
        Ltri.setFont(new Font("arial",Font.PLAIN,16));
        Pan.add(Ltri);
        
        JLabel Lcal=new JLabel("Cálculo", SwingConstants.CENTER);
        Lcal.setBounds(620,50,110,25);
        Lcal.setFont(new Font("arial",Font.PLAIN,16));
        Pan.add(Lcal);
        
        JLabel Lall=new JLabel("Álgebra lineal", SwingConstants.CENTER);
        Lall.setBounds(820,50,110,25);
        Lall.setFont(new Font("arial",Font.PLAIN,16));
        Pan.add(Lall);
        
        /*
        BOTONES
        */        
        
        //Algebra
        
        JButton Bcal=new JButton("Calculadora");
        Bcal.setBounds(25, 100, 180, 25);
        Pan.add(Bcal);
        
        //Aritmetica
        
        JLabel Lecu=new JLabel("Ecuaciones", SwingConstants.CENTER);
        Lecu.setBounds(220,90,110,25);
        Lecu.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lecu);        
        
        JButton Bcua=new JButton("Ecuación cuadrática");
        Bcua.setBounds(225, 140, 180, 25);
        Pan.add(Bcua);
        
        JButton Bsis=new JButton("Sistema de ecuaciones");
        Bsis.setBounds(225, 180, 180, 25);
        Pan.add(Bsis);
        
        
        JLabel Lfac=new JLabel("Factorización", SwingConstants.CENTER);
        Lfac.setBounds(220,230,110,25);
        Lfac.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lfac);    
        
        JButton Bbin=new JButton("Binomio cuadrado");
        Bbin.setBounds(225, 280, 180, 25);
        Pan.add(Bbin);   
        
        JButton Bdif=new JButton("Diferencia de cuadrados");
        Bdif.setBounds(225, 320, 180, 25);
        Pan.add(Bdif);   
        
        JButton Bcub=new JButton("Suma y diferencia de cubos");
        Bcub.setBounds(215, 360, 200, 25);       
        Pan.add(Bcub);
        
        //Trigonometria
                
        JLabel Lftr=new JLabel("Funciones trigonométricas", SwingConstants.CENTER);
        Lftr.setBounds(420,90,170,25);
        Lftr.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lftr); 
        
        JButton Bsen=new JButton("Seno");
        Bsen.setBounds(425, 140, 180, 25);
        Pan.add(Bsen);
        
        JButton Bcos=new JButton("Coseno");
        Bcos.setBounds(425, 180, 180, 25);
        Pan.add(Bcos);
        
        JButton Btan=new JButton("Tangente");
        Btan.setBounds(425, 220, 180, 25);
        Pan.add(Btan);
        
                
        JLabel Lang=new JLabel("Ángulos", SwingConstants.CENTER);
        Lang.setBounds(420,270,170,25);
        Lang.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lang); 
        
        JButton Blon=new JButton("Longitud de arco");
        Blon.setBounds(425, 320, 180, 25);
        Pan.add(Blon);
        
        //Calculo
                
        JLabel Ldif=new JLabel("Cálculo diferencial", SwingConstants.CENTER);
        Ldif.setBounds(620,90,170,25);
        Ldif.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Ldif); 
        
        JButton Bder=new JButton("Casos de derivación");
        Bder.setBounds(625, 140, 180, 25);
        Pan.add(Bder);
        
                
        JLabel Lint=new JLabel("Cálculo integral", SwingConstants.CENTER);
        Lint.setBounds(620,190,170,25);
        Lint.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lint); 
        
        JButton Bint=new JButton("Casos de integración");
        Bint.setBounds(625, 240, 180, 25);
        Pan.add(Bint);
        
        JButton Brie=new JButton("Sumas de Riemann");
        Brie.setBounds(625, 280, 180, 25);
        Pan.add(Brie);
        
        //Algebra lineal
        
        JLabel Lmat=new JLabel("Operaciones con matrices", SwingConstants.CENTER);
        Lmat.setBounds(820,90,170,25);
        Lmat.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lmat); 
        
        JButton Btra=new JButton("Traspuesta");
        Btra.setBounds(825, 140, 180, 25);
        Pan.add(Btra);
        
        JButton Binv=new JButton("Inversa");
        Binv.setBounds(825, 180, 180, 25);
        Pan.add(Binv);
        
        JButton Bdet=new JButton("Determinante");
        Bdet.setBounds(825, 220, 180, 25);
        Pan.add(Bdet);
        
        JButton Bpot=new JButton("Potencia");
        Bpot.setBounds(825, 260, 180, 25);
        Pan.add(Bpot);
        
        
        JLabel Lmat2=new JLabel("Operaciones con matrices", SwingConstants.CENTER);
        Lmat2.setBounds(820,310,170,25);
        Lmat2.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(Lmat2); 
        
        JButton Bope=new JButton("Operaciones entre matrices");
        Bope.setBounds(815, 360, 200, 25);
        Pan.add(Bope);        
        
        /*
        OTROS BOTONES
        */        
        
        JButton Bfav=new JButton("Favoritos");
        Bfav.setBounds(550, 470, 210, 50);
        Pan.add(Bfav);
        
        JButton Bhis=new JButton("Historial");
        Bhis.setBounds(800, 470, 210, 50);
        Pan.add(Bhis);   
        
        /*
        EVENTOS
        */
              

        ActionListener ABcal = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            Aritmetica va=new Aritmetica();
            va.setVisible(true);
            };        
        };
        Bcal.addActionListener(ABcal);

        ActionListener ABcua = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            Algebra va=new Algebra(1);
            va.setVisible(true);
            };        
        };
        Bcua.addActionListener(ABcua);

        ActionListener ABsis = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            Algebra va=new Algebra(2);
            va.setVisible(true);
            };        
        };
        Bsis.addActionListener(ABsis);

        ActionListener ABbin = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            Algebra va=new Algebra(3);
            va.setVisible(true);
            };        
        };
        Bbin.addActionListener(ABbin);

        ActionListener ABdif = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            Algebra va=new Algebra(4);
            va.setVisible(true);
            };        
        };
        Bdif.addActionListener(ABdif);

        ActionListener ABcub = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            Algebra va=new Algebra(5);
            va.setVisible(true);
            };        
        };
        Bcub.addActionListener(ABcub);

        ActionListener ABsen = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            Trigonometria va=new Trigonometria(1);
            va.setVisible(true);
            };        
        };
        Bsen.addActionListener(ABsen);

        ActionListener ABcos = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            Trigonometria va=new Trigonometria(2);
            va.setVisible(true);
            };        
        };
        Bcos.addActionListener(ABcos);

        ActionListener ABtan = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            Trigonometria va=new Trigonometria(3);
            va.setVisible(true);
            };        
        };
        Btan.addActionListener(ABtan);

        ActionListener ABlon = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            Trigonometria va=new Trigonometria(4);
            va.setVisible(true);
            };        
        };
        Blon.addActionListener(ABlon);

        ActionListener ABder = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            Calculo va=new Calculo(1);
            va.setVisible(true);
            };        
        };
        Bder.addActionListener(ABder);

        ActionListener ABint = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            Calculo va=new Calculo(2);
            va.setVisible(true);
            };        
        };
        Bint.addActionListener(ABint);

        ActionListener ABrie = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            Calculo va=new Calculo(3);
            va.setVisible(true);
            };        
        };
        Brie.addActionListener(ABrie);

        ActionListener ABtra = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            AlgebraLineal va=new AlgebraLineal(1);
            va.setVisible(true);
            };        
        };
        Btra.addActionListener(ABtra);

        ActionListener ABinv = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            AlgebraLineal va=new AlgebraLineal(2);
            va.setVisible(true);
            };        
        };
        Binv.addActionListener(ABinv);

        ActionListener ABdet = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            AlgebraLineal va=new AlgebraLineal(3);
            va.setVisible(true);
            };        
        };
        Bdet.addActionListener(ABdet);

        ActionListener ABpot = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            AlgebraLineal va=new AlgebraLineal(4);
            va.setVisible(true);
            };        
        };
        Bpot.addActionListener(ABpot);

        ActionListener ABope = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            AlgebraLineal va=new AlgebraLineal(false);
            va.setVisible(true);
            };        
        };
        Bope.addActionListener(ABope);

        ActionListener ABfav = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            AlgebraLineal va=new AlgebraLineal(false);
            va.setVisible(true);
            };        
        };
        Bfav.addActionListener(ABfav);

        ActionListener ABhis = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            AlgebraLineal va=new AlgebraLineal(false);
            va.setVisible(true);
            };        
        };
        Bhis.addActionListener(ABhis);
    }
    
    public void Historial(){
                      
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Historial");
        this.setSize(300,500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        JPanel Pan1=new JPanel();
        Pan1.setLayout(null);
        this.getContentPane().add(Pan1);
        
    }
    
    public void Favoritos(){
                      
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Favoritos");
        this.setSize(300,500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        JPanel Pan1=new JPanel();
        Pan1.setLayout(null);
        this.getContentPane().add(Pan1);
        
    }
    
}
