package Ventana;

import java.awt.Color;
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
import javax.swing.text.Document;



public class Calculo extends JFrame {
    
    public Calculo(int n){
        switch(n){
            case 1:
                derivacion();
                break;
            case 2:
                integracion();
                break;
            case 3:
                riemann();
                break;
        }        
    }
   
    public int pag;
    public void derivacion(){
       
       
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Calculo Diferencial");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);       
        
        JPanel Pan=new JPanel();
        Pan.setLayout(null);
        Pan.setBackground(Color.white);
        this.getContentPane().add(Pan);
        
        pag=1;
        // Pagina 1

        JLabel Lpag1=new JLabel("¿Qué es una derivada?", SwingConstants.LEFT);
        Lpag1.setBounds(40,10,450,25);
        Lpag1.setFont(new Font("arial",Font.PLAIN,18));
        Pan.add(Lpag1);
        
        JTextArea pag1=new JTextArea("La derivación, matemáticamente, es un concepto esencial para deter-\n"
                + ""+"minar los espacios tangentes sobre variedades diferenciables, sus cua-\n"
                + ""+"lidades, sus propiedades y sus consecuencias.\n"
                +"\n"
                +"Es una pieza fundamental, clave en el desarrollo de la teoría para la geo-\n"
                +"metría diferencial tal y como está estructurada actualmente."+"En cálculo\n"
                +"diferencial y análisis matemático, la derivada de una función es la razón\n"
                +"de cambio instantánea con la que varía el valor de dicha función matemáti\n"
                +"ca, según se modifique el valor de su variable independiente. La derivada\n"
                +"de una función es un concepto local, es decir, se calcula como el límite\n"
                +"de la rapidez de cambio media de la función en cierto intervalo, cuando el\n"
                +"intervalo considerado para la variable independiente se torna cada vez\n"
                +"más pequeño. Por eso se habla del valor de la derivada de una función en\n"
                +"un punto dado."+"Entonces el valor de la derivada de una función en un+\n"
                +"punto puede interpretarse geométricamente, ya que se corresponde con la+\n"
                +"pendiente de la recta tangente a la gráfica de la función en dicho punto.\n"
                +"\n"
                +"La recta tangente es, a su vez, la gráfica de la mejor aproximación lineal\n"
                +"de la función alrededor de dicho punto. La noción de derivada puede gene-\n"
                +"ralizarse para el caso de funciones de más de una variable con la deri-\n"
                +"vada parcial y el diferencial.");
        
        pag1.setBounds(35, 45, 410, 350);
        pag1.setBackground(Color.white);
        pag1.setEditable(false);
        Pan.add(pag1);      
                
        // Pagina 2

        JLabel Lpag2=new JLabel("Derivada de una función de grado n", SwingConstants.LEFT);
        Lpag2.setBounds(40,10,450,25);
        Lpag2.setFont(new Font("arial",Font.PLAIN,18));
        Pan.add(Lpag2);
        
        JTextArea pag2=new JTextArea("En una función polinómica de grado n f(x)=x^{n},\n"
                +"donde n es un entero positivo, su derivada es f'(x)=nx^{n-1}\n"
                +"\n"
                +"Algunos tipos de este tipo de funciones son: Función cuadrática, función\n"
                +" cúbica, entre otras"
                +"\n"
                +"\n"
                +"Por ejemplo la función:\n"
                +"\n"
                +"  f(x)=x^{3}\n"
                +"\n"
                +"Se \"baja\" el exponente de tal forma que éste multiplique a la variable\n"
                +"con respecto a la cual estamos derivando, luego al mismo exponente se le\n"
                +"resta la unidad formando uno nuevo, así:\n"
                +"\n"
                +"  f'(x)=3x^{3-1}\n"
                +"\n"
                +"Quedando finalmente:\n"
                +"\n"
                +"  f'(x)=3x^{2}");

        pag2.setBounds(35, 45, 410, 350);
        pag2.setBackground(Color.white);
        pag2.setEditable(false);
        Pan.add(pag2);      
        
        Lpag2.setVisible(false);
        pag2.setVisible(false);
                
        // Pagina 3

        JLabel Lpag3=new JLabel("Derivada de una constante por una función", SwingConstants.LEFT);
        Lpag3.setBounds(40,10,450,25);
        Lpag3.setFont(new Font("arial",Font.PLAIN,18));
        Pan.add(Lpag3);
        
        JTextArea pag3=new JTextArea("Cuando una función esté representada por medio de f(x)=cx^{n},\n"
                +"su derivada equivale a f'(x)=n(cx^{n-1}) de la siguiente manera:\n"
                +"\n"
                +"\n"
                +"Consideremos la siguiente función:  f(x)=8x^{4}, lo primero a hacer es\n"
                +"\"bajar\" el exponente a multiplicar por la variable y el coeficiente\n"
                +"que la acompaña, y de nuevo se halla un nuevo exponente de la misma\n"
                +"manera explicada anteriormente:\n"
                +"\n"
                +"  f'(x)=4(8x^{4-1})\n"
                +"\n"
                +"Para obtener:\n"
                +"\n"
                +"  f'(x)=32x^{3}");
        
        pag3.setBounds(35, 45, 410, 350);
        pag3.setBackground(Color.white);
        pag3.setEditable(false);
        Pan.add(pag3);      
        
        Lpag3.setVisible(false);
        pag3.setVisible(false);
                
        // Pagina 4

        JLabel Lpag4=new JLabel("Derivada de una suma", SwingConstants.LEFT);
        Lpag4.setBounds(40,10,450,25);
        Lpag4.setFont(new Font("arial",Font.PLAIN,18));
        Pan.add(Lpag4);
        
        JTextArea pag4=new JTextArea("Se puede demostrar a partir de la definición de derivada, que la\n"
                +"derivada de la suma de dos funciones es la suma de las derivadas\n"
                +"de cada una.​\n"
                +"\n"
                +"Es decir, (f+g)'(x)=f'(x)+g'(x)}.\n" 
                +"\n"
                +"Como ejemplo consideremos la función:\n"
                +"\n"
                +"\n"
                +"  f(x)=3x^{5}+x^{3}}, para determinar su derivada se trabaja la derivada de\n"
                +"cada término aparte y la suma de ambos será la derivada de la función:\n"
                +"\n"
                +"  f'(x)=15x^{4}+3x^{2}");
        
        pag4.setBounds(35, 45, 410, 350);
        pag4.setBackground(Color.white);
        pag4.setEditable(false);
        Pan.add(pag4);      
        
        Lpag4.setVisible(false);
        pag4.setVisible(false);
                
        // Pagina 5

        JLabel Lpag5=new JLabel("Derivada de un producto", SwingConstants.LEFT);
        Lpag5.setBounds(40,10,450,25);
        Lpag5.setFont(new Font("arial",Font.PLAIN,18));
        Pan.add(Lpag5);
        
        JTextArea pag5=new JTextArea("La derivada se expresa literalmente de la siguiente forma:\n"
                +"\n"
                +"\"La derivada de un producto de dos funciones es equivalente a la suma\n"
                +"entre el producto de la primera función sin derivar y la derivada de la\n"
                +"segunda función y el producto de la derivada de la primera función por\n"
                +"la segunda función sin derivar.\"\n"
                +"\n"
                +"Y matemáticamente expresado por la relación (f*g)'=f'*g+f*g'.\n"
                +"\n"
                +"Consideremos la siguiente función como ejemplo:\n"
                +"\n"
                +"  h(x)=(4x+2)(3x^{7}+2)\n"
                +"\n"
                +"Identificamos a f(x)=(4x+2) y g(x)=(3x^{7}+2), utilizando las reglas ante\n"
                +"riormente expuestas, vemos que:\n"
                +"\n"
                +"  f'(x)=4} y que g'(x)=21x^{6}\n"
                +"\n"
                +"Por lo tanto\n"
                +"\n"
                +"  h'(x)=4*(3x^{7}+2)+(4x+2)*(21x^{6})");
        
        pag5.setBounds(35, 45, 410, 350);
        pag5.setBackground(Color.white);
        pag5.setEditable(false);
        Pan.add(pag5);      
        
        Lpag5.setVisible(false);
        pag5.setVisible(false);
                
        // Pagina 6

        JLabel Lpag6=new JLabel("Derivada de un cociente", SwingConstants.LEFT);
        Lpag6.setBounds(40,10,450,25);
        Lpag6.setFont(new Font("arial",Font.PLAIN,18));
        Pan.add(Lpag6);
        
        JTextArea pag6=new JTextArea("La derivada de un cociente se determina por la siguiente relación:\n"
                +"\n"
                +"  (f(x)/g(x))'=(f'(x)g(x)-f(x)g'(x))/(g(x)^{2})\n"
                +"\n"
                +"\"La derivada de un cociente de dos funciones es la función ubicada en el\n"
                +"denominador por la derivada del numerador menos la derivada de la fun-\n"
                +"ción en el denominador por la función del numerador sin derivar, todo\n"
                +"sobre la función del denominador al cuadrado\".\n"
                +"\n"
                +"Ya explicado lo dicho anteriormente consideremos como ejemplo la\n"
                +"siguiente función:\n"
                +"\n" 
                +"  h(x)=(3x+1)/(2x)\n"
                +"\n"
                +"Ahora se trabaja el enunciado anterior el cual nos dice que multipliquemos\n"
                +"el denominador que en este caso es g(x)=2x y se multiplique por la derivada\n"
                +"del numerador que seria f'(x)=3; luego la segunda parte dice que tomemos la\n"
                +"función del numerador f(x) sin derivar y lo multipliquemos por la derivada\n"
                +"de g(x), que seria g'(x)=2, todo esto lo dividimos entre el f(x) al cuadrado:\n"
                +"\n"
                +"  h'(x)=((3)(2x)-(3x+1)(2))/((2x)^{2})");
        
        pag6.setBounds(35, 45, 410, 350);
        pag6.setBackground(Color.white);
        pag6.setEditable(false);
        Pan.add(pag6);  
        
        Lpag6.setVisible(false);
        pag6.setVisible(false);    
                
        // Pagina 7

        JLabel Lpag7=new JLabel("Regla de la cadena", SwingConstants.LEFT);
        Lpag7.setBounds(40,10,450,25);
        Lpag7.setFont(new Font("arial",Font.PLAIN,18));
        Pan.add(Lpag7);
        
        JTextArea pag7=new JTextArea("La regla de la cadena es una fórmula para calcular la derivada de\n"
                +"la composición de dos o más funciones. Esto es, si f y g son dos funcio-\n"
                +"nes, entonces la regla de la cadena expresa la derivada de la función\n"
                +"compuesta f ∘ g en términos de las derivadas de f y g. Por ejemplo, la\n"
                +"regla de la cadena de f ∘ g (x) ≡ f [g (x)] es:\n"
                +"\n"
                +"\n"
                +"  (f ∘ g)'(x)=f'(g(x))*g'(x)");
        
        pag7.setBounds(35, 45, 410, 350);
        pag7.setBackground(Color.white);
        pag7.setEditable(false);
        Pan.add(pag7);      
        
        Lpag7.setVisible(false);
        pag7.setVisible(false);                
        
        //Botones

        JButton Breg=new JButton("Anterior");
        Breg.setBounds(140, 410, 90, 30);
        Breg.setEnabled(false);
        Pan.add(Breg); 

        JButton Bsig=new JButton("Siguiente");
        Bsig.setBounds(260, 410, 90, 30);
        Pan.add(Bsig); 
        

        ActionListener ABreg = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                switch(pag){
                    case 2:        
                        Lpag2.setVisible(false);
                        pag2.setVisible(false);  
                        Lpag1.setVisible(true);
                        pag1.setVisible(true);   
                        Breg.setEnabled(false);
                        pag=1;
                        break;
                    case 3:        
                        Lpag3.setVisible(false);
                        pag3.setVisible(false);  
                        Lpag2.setVisible(true);
                        pag2.setVisible(true);   
                        pag=2;
                        break;
                    case 4:        
                        Lpag4.setVisible(false);
                        pag4.setVisible(false);  
                        Lpag3.setVisible(true);
                        pag3.setVisible(true);   
                        pag=3;
                        break;
                    case 5:        
                        Lpag5.setVisible(false);
                        pag5.setVisible(false);  
                        Lpag4.setVisible(true);
                        pag4.setVisible(true);   
                        pag=4;
                        break;
                    case 6:        
                        Lpag6.setVisible(false);
                        pag6.setVisible(false);  
                        Lpag5.setVisible(true);
                        pag5.setVisible(true);   
                        pag=5;
                        break;
                    case 7:        
                        Lpag7.setVisible(false);
                        pag7.setVisible(false);  
                        Lpag6.setVisible(true);
                        pag6.setVisible(true);   
                        Bsig.setEnabled(true);
                        pag=6;
                        break;
                }                
            }
        };        
        Breg.addActionListener(ABreg);

        ActionListener ABsig = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(pag){
                    case 1:        
                        Lpag1.setVisible(false);
                        pag1.setVisible(false);  
                        Lpag2.setVisible(true);
                        pag2.setVisible(true);   
                        Breg.setEnabled(true);
                        pag=2;
                        break;
                    case 2:        
                        Lpag2.setVisible(false);
                        pag2.setVisible(false);  
                        Lpag3.setVisible(true);
                        pag3.setVisible(true);   
                        pag=3;
                        break;
                    case 3:        
                        Lpag3.setVisible(false);
                        pag3.setVisible(false);  
                        Lpag4.setVisible(true);
                        pag4.setVisible(true);   
                        pag=4;
                        break;
                    case 4:        
                        Lpag4.setVisible(false);
                        pag4.setVisible(false);  
                        Lpag5.setVisible(true);
                        pag5.setVisible(true);   
                        pag=5;
                        break;
                    case 5:        
                        Lpag5.setVisible(false);
                        pag5.setVisible(false);  
                        Lpag6.setVisible(true);
                        pag6.setVisible(true);   
                        pag=6;
                        break;
                    case 6:        
                        Lpag6.setVisible(false);
                        pag6.setVisible(false);  
                        Lpag7.setVisible(true);
                        pag7.setVisible(true);   
                        Bsig.setEnabled(false);
                        pag=7;
                        break;
                }
            }
        };        
        Bsig.addActionListener(ABsig);
   }  
   public void integracion(){

    this.setTitle("Calculo Integral");
    this.setSize(500,500);
    this.setLocationRelativeTo(null);
    this.setResizable(false);       

    JPanel Pan=new JPanel();
    Pan.setLayout(null);
    Pan.setBackground(Color.white);
    this.getContentPane().add(Pan);

    pag=1;
    // Pagina 1     ∫  ∘

    JLabel Lpag1=new JLabel("¿Qué es una integral?", SwingConstants.LEFT);
    Lpag1.setBounds(40,10,450,25);
    Lpag1.setFont(new Font("arial",Font.PLAIN,18));
    Pan.add(Lpag1);

    JTextArea pag1=new JTextArea("Dada una función f(x) de una variable real x y un intervalo [a,b] de\n"
            +"la recta real, la integral es igual al área de la región del plano xy\n"
            +"limitada entre la gráfica de f, el eje x, y las líneas verticales x=a y\n"
            +"x=b, donde son negativas las áreas por debajo del eje x.\n"
            +"\n"
            +"∫f(x)dx, entre a y b.\n"
            +"\n"
            +"La palabra \"integral\" también puede hacer referencia a la noción de\n"
            +"primitiva: una función F, cuya derivada es la función dada f. En este\n"
            +"caso se denomina integral indefinida.");

    pag1.setBounds(35, 45, 410, 350);
    pag1.setBackground(Color.white);
    pag1.setEditable(false);
    Pan.add(pag1);      

    // Pagina 2

    JLabel Lpag2=new JLabel("Integración por sustitución", SwingConstants.LEFT);
    Lpag2.setBounds(40,10,450,25);
    Lpag2.setFont(new Font("arial",Font.PLAIN,18));
    Pan.add(Lpag2);

    JTextArea pag2=new JTextArea("El método de integración por sustitución o por cambio de variable se\n"
            +"basa en realizar un reemplazo de variables adecuado que permita convertir\n"
            +"el integrando en algo sencillo con una integral o antiderivada simple. En\n"
            +"muchos casos, donde las integrales no son triviales, se puede llevar a una\n"
            +"integral de tabla para encontrar fácilmente su primitiva. Este método reali-\n"
            +"za lo opuesto a la regla de la cadena en la derivación.\n"
            +"\n"
            +"\n"
            +"Suponiendo que la integral a resolver es:\n"
            +"\n"
            +"∫xcos(2x^{2}+3)dx\n"
            +"\n"
            +"En la integral se reemplaza 2x^{2}+3 con u=u(x):\n"
            +"\n"
            +"∫xcos(u(x))dx"
            +"\n"
            +"Ahora se necesita sustituir también dx para que la integral quede solo en fun-\n"
            +"ción de u. Se tiene que 2x^{2}+3=u, por tanto derivando se obtiene 4xdx=du.\n"
            +"\n"
            +"∫cos(u)*du/4");

    pag2.setBounds(35, 45, 410, 350);
    pag2.setBackground(Color.white);
    pag2.setEditable(false);
    Pan.add(pag2);      

    Lpag2.setVisible(false);
    pag2.setVisible(false);

    // Pagina 3

    JLabel Lpag3=new JLabel("Integración por partes", SwingConstants.LEFT);
    Lpag3.setBounds(40,10,450,25);
    Lpag3.setFont(new Font("arial",Font.PLAIN,18));
    Pan.add(Lpag3);

    JTextArea pag3=new JTextArea("En el cálculo y en general en el análisis matemático, integración por\n"
            +"partes es el proceso que encuentra la integral de un producto de funciones en\n"
            +"términos de la integral de sus derivadas y antiderivadas. Frecuentemente\n"
            +"usado para transformar la antiderivada de un producto de funciones en una\n"
            +"antiderivada, por lo cual, una solución puede ser hallada más fácilmente.\n"
            +"\n"
            +"El método de integración por partes es el que resulta de aplicar:\n"
            +"\n"
            +"si u = u(x) y du = u′(x) dx, a la vez v = v(x) y dv = v′(x) dx, entonces:\n"
            +"\n"
            +"∫u(x)v'(x)dx = [u(x)v(x)] - ∫u'(x)v(x)dx");

    pag3.setBounds(35, 45, 410, 350);
    pag3.setBackground(Color.white);
    pag3.setEditable(false);
    Pan.add(pag3);      

    Lpag3.setVisible(false);
    pag3.setVisible(false);

    // Pagina 4     ∫  ∘

    JLabel Lpag4=new JLabel("Integración por cambio de variables", SwingConstants.LEFT);
    Lpag4.setBounds(40,10,450,25);
    Lpag4.setFont(new Font("arial",Font.PLAIN,18));
    Pan.add(Lpag4);

    JTextArea pag4=new JTextArea("El cambio de variables es uno de los métodos más usados en la inte-\n"
            +"gración. Permite expresar la integral inicial mediante un nuevo integrando\n"
            +"y un nuevo dominio siendo la integral equivalente a la primera. Para inte-\n"
            +"grales simples de una sola variable si u es la variable original y\n"
            +"v = φ(u) es una función invertible, se tiene:\n"
            +"\n"
            +"\n"
            +"∫f(u)du, desde a a b = ∫(f ∘ φ^{-1})(v)(dφ^{-1}(v)/(dv)^{-1} dv, desde φ(a)\n"
            +"a φ(b).");

    pag4.setBounds(35, 45, 410, 350);
    pag4.setBackground(Color.white);
    pag4.setEditable(false);
    Pan.add(pag4);      

    Lpag4.setVisible(false);
    pag4.setVisible(false);
            

    //Botones

    JButton Breg=new JButton("Anterior");
    Breg.setBounds(140, 410, 90, 30);
    Breg.setEnabled(false);
    Pan.add(Breg); 

    JButton Bsig=new JButton("Siguiente");
    Bsig.setBounds(260, 410, 90, 30);
    Pan.add(Bsig); 


    ActionListener ABreg = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {                
            switch(pag){
                case 2:        
                    Lpag2.setVisible(false);
                    pag2.setVisible(false);  
                    Lpag1.setVisible(true);
                    pag1.setVisible(true);   
                    Breg.setEnabled(false);
                    pag=1;
                    break;
                case 3:        
                    Lpag3.setVisible(false);
                    pag3.setVisible(false);  
                    Lpag2.setVisible(true);
                    pag2.setVisible(true);   
                    pag=2;
                    break;
                case 4:        
                    Lpag4.setVisible(false);
                    pag4.setVisible(false);  
                    Lpag3.setVisible(true);
                    pag3.setVisible(true);   
                    Bsig.setEnabled(true);
                    pag=3;
                    break;
            }                
        }
    };        
    Breg.addActionListener(ABreg);

    ActionListener ABsig = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            switch(pag){
                case 1:        
                    Lpag1.setVisible(false);
                    pag1.setVisible(false);  
                    Lpag2.setVisible(true);
                    pag2.setVisible(true);   
                    Breg.setEnabled(true);
                    pag=2;
                    break;
                case 2:        
                    Lpag2.setVisible(false);
                    pag2.setVisible(false);  
                    Lpag3.setVisible(true);
                    pag3.setVisible(true);   
                    pag=3;
                    break;
                case 3:        
                    Lpag3.setVisible(false);
                    pag3.setVisible(false);  
                    Lpag4.setVisible(true);
                    pag4.setVisible(true);  
                    Bsig.setEnabled(false); 
                    pag=4;
                    break;
            }
        }
    };        
    Bsig.addActionListener(ABsig);
   }
   
   public void riemann(){
            Recursos operacion=new Recursos();
                      
        this.setTitle("Cálculo Integral");
        this.setSize(320,420);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        JPanel Pan=new JPanel();
        Pan.setLayout(null);
        this.getContentPane().add(Pan);
        
        // Textos
        
        JLabel Ltit=new JLabel("Suma de Riemann", SwingConstants.CENTER);
        Ltit.setBounds(10,10,180,25);
        Ltit.setFont(new Font("arial",Font.PLAIN,16));
        Pan.add(Ltit);

        JLabel L1=new JLabel("Límite inferior:", SwingConstants.CENTER);
        L1.setBounds(10,60,100,25);
        L1.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L1);
        Pan.add(Ltit);

        JTextField T1=new JTextField();
        T1.setBounds(160,60,100,30);
        Pan.add(T1);

        JLabel L2=new JLabel("Límite superior:", SwingConstants.CENTER);
        L2.setBounds(10,100,100,25);
        L2.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L2);

        JTextField T2=new JTextField();
        T2.setBounds(160,100,100,30);
        Pan.add(T2);
        
        JLabel L3=new JLabel("Función:", SwingConstants.CENTER);
        L3.setBounds(10,140,100,25);
        L3.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L3);
        
        String[] funciones={"Cuadrática","Cúbica","Exponencial"};

        JComboBox Cfnc=new JComboBox(funciones);
        Cfnc.setBounds(160, 140, 100, 25);  
        Cfnc.setSelectedItem("Cuadrática");
        Pan.add(Cfnc);

        JLabel L4=new JLabel("Diferencial:", SwingConstants.CENTER);
        L4.setBounds(10,180,100,25);
        L4.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L4);

        JTextField T4=new JTextField();
        T4.setBounds(160,180,100,30);
        Pan.add(T4);

        JLabel L5=new JLabel("Resultado", SwingConstants.CENTER);
        L5.setBounds(10,230,100,25);
        L5.setFont(new Font("arial",Font.PLAIN,14));
        Pan.add(L5);
              
        JTextField T5=new JTextField();
        T5.setBounds(130,230,160,30);
        T5.setEditable(false);
        T5.setCaretPosition(0);
        T5.setHorizontalAlignment(SwingConstants.LEFT);
        Pan.add(T5);
       
        // Botones

        JButton Bcal=new JButton("Calcular");
        Bcal.setBounds(160,260,100,30);
        Pan.add(Bcal);        

        JButton Bgua=new JButton("Guardar resultado");
        Bgua.setBounds(130,330,150,30);
        Pan.add(Bgua); 
        
        // Eventos

        ActionListener ABcal = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(T1.getText().equals(""))
                    T1.setText("0");
                if(T2.getText().equals(""))
                    T2.setText("0");
                if(T4.getText().equals(""))
                    T4.setText("0");
                
                double inf=Double.parseDouble(T1.getText());
                double sup=Double.parseDouble(T2.getText());
                double dif=Double.parseDouble(T4.getText());
                double valor=0;
                double i;
                
                if(Cfnc.getSelectedItem().equals("Cuadrática")){
                    i=inf;
                    while(i<sup){
                        i+=dif;
                        valor+=dif*operacion.funcioncuadratica(i);
                    }      
                }else{
                    if(Cfnc.getSelectedItem().equals("Cúbica")){
                        i=inf;
                        while(i<sup){
                            i+=dif;
                            valor+=dif*operacion.funcioncubica(i);
                    }      
                        
                    }else{
                        i=inf;
                        while(i<sup){
                            i+=dif;
                            valor+=dif*operacion.funcionexponencial(i);
                        }      
                        
                    }
                    
                }
                T5.setText(String.valueOf(valor));
                
            }
        };        
        Bcal.addActionListener(ABcal);
   }
}
