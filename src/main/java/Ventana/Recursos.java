package Ventana;

public class Recursos {
    
    public double p0=10;
    final double pi=3.141592654;
    final double e=2.718281828;
    
    public Recursos(){      
                
    }
    
    public double raizcuadrada(double valor){
         
        for(int i=0;i<15;i++){
            double num=p0*p0-valor;
            double den=2*p0;

            double p1=p0-num/den;
            p0=p1;
        }
        return p0;
                    
    }
    
    public double raizcubica(double valor){  
        for(int i=0;i<15;i++){
            double num=p0*p0*p0-valor;
            double den=2*p0*p0;

            double p1=p0-num/den;
            p0=p1;
        }
        return p0;
        
    }
    
    public double raizN(double valor, int grado){  
        for(int i=0;i<15;i++){
            double num=potencia(p0,grado)-valor;
            double den=grado*potencia(p0,grado-1);

            double p1=p0-num/den;
            p0=p1;
        }
        return p0;
        
    }
    
    public double potencia(double opizq, int valor){
        // Ciclos                   
        
        double op=1;
        boolean neg=false;

        if(valor<0){
            neg=true;
            valor=-1*valor;    
        }

        for(int i=0;i<valor;i++){
            op*=opizq;
        }   

        if(neg==true)
            return 1/op;
        else
            return op;         
    }
    
    public int factorial(int valor){    
        // Metodo recursivo
        
        int fact=1;
        
        if(valor<=1)
            return 1;
        else{
            fact=valor*factorial(valor-1);
            
            return fact;            
        }        
    }
    
    public double[][] matrizvar(double[][] matriz, int sustituir,boolean sistema){
    double[][] matrizvar=new double[matriz.length][matriz.length];

    for(int i=0;i<matrizvar.length;i++){
        for(int j=0;j<matrizvar.length;j++){            
            matrizvar[i][j]=matriz[i][j]; 
        }
    }
    if(sistema==false)
        for(int i=0;i<matrizvar.length;i++)
            matrizvar[i][sustituir]=matriz[i][matriz[0].length-1];
       
     return matrizvar;
    }
    
    public double[] cramer(double[][] matriz){
        double[] cramer=new double[matriz.length];
        double Det=determinante(matrizvar(matriz,matriz[0].length-1,true));
        
        for(int i=0;i<matriz.length;i++){
            cramer[i]=determinante(matrizvar(matriz,i,false))/Det;
        }        
        return cramer;
    }
    
    public double seno(double valor){
        // Serie de McLaurin
        double mcl=0;
        double signo=1;
        
        for(int i=0;i<7;i++){
            int k=2*i+1;
            mcl+=signo*potencia(valor,k)/factorial(k);            
            signo=-1*signo;
        }
        return mcl;        
    }
    
    public double coseno(double valor){
        // Serie de Taylor
        double tay=0;
        double signo=-1;
                
        for(int i=0;i<7;i++){
            tay+=signo*potencia(valor-pi,2*i)/factorial(2*i);            
            signo=-1*signo;
        }
        return tay;            
    }
    
    public double tangente(double valor){
        
        double tan=seno(valor)/coseno(valor);                
        return tan;
        
    }
    
    public double anguloequivalente(double valor, int op){
        
        int vueltas;
        double vueltacom=2*pi;
        switch(op){
            case 1:
                valor+=pi;
                vueltas=(int) (valor/vueltacom);                 
                valor-=pi;                
                valor-=vueltas*vueltacom;
                break;
            case 2:
                vueltas=(int) (valor/vueltacom);                               
                valor-=vueltas*vueltacom;
                break;                
            case 3:
                vueltas=(int) (valor/pi);  
                valor-=vueltas*pi;
                break;
        } 
        
        return valor;             
    }
      
    public double funcioncuadratica(double valor){
        
        valor*=valor;
        return valor;

    }
      
    public double funcioncubica(double valor){
        
        valor*=valor*valor;
        return valor;

    }
      
    public double funcionexponencial(double valor){
        
        double exp=0;
        
        for(int i=0;i<15;i++){
            
            exp+=potencia(valor,i)/factorial(i);
            
        }
        return exp;        
    }
    
    public double[][] matrizmenor(double[][] matriz,int x,int y){        
        double[][] matrizmenor=new double[matriz.length-1][matriz.length-1];
        
        int matrizx=0;
        for(int i=0;i<matrizmenor.length;i++){
            if(i==x)
                matrizx++;
            
            int matrizy=0;
            for(int j=0;j<matrizmenor[0].length;j++){   
                if(j==y)
                    matrizy++;
                
                matrizmenor[i][j]=matriz[matrizx][matrizy];
                matrizy++;
            }
            matrizx++;
        }        
        return matrizmenor;   
    }
    
    public double[][] matriztraspuesta(double[][] matriz){
    
        double[][] mat=new double[matriz.length][matriz.length];
        
        for(int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){
                mat[j][i]=matriz[i][j];
            }
        }
        for(int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){
                matriz[i][j]=mat[i][j];                            
            }
        }
        return matriz;
    }
    
    public double determinante(double[][] matriz){
        double det=0;
        int sgn=1;
        
        if(matriz.length==2)
            det=matriz[0][0]*matriz[1][1]-matriz[0][1]*matriz[1][0];
        else{        
            for(int i=0;i<matriz.length;i++){
                det+=sgn*matriz[0][i]*determinante(matrizmenor(matriz,0,i));
                sgn*=-1;
            }
        }        
        return det;
    }    
    
    public double[][] matrizcofactores (double[][] matriz){
        
        double[][] matrizcof=new double[matriz.length][matriz.length];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                matrizcof[i][j]=cofactor(true,matriz,i,j);
            }
        }        
        return matrizcof;
    }
    
    public double cofactor (boolean primer,double[][] matriz, int x, int y){
        int sgn;
        int z=x+y;
        if(z%2==0)
            sgn=1;
        else
            sgn=-1;        
            
        double cofactor=1;
        if(matriz.length==2){
            if(primer==true){
                if(x==0)
                    if(y==0)
                        cofactor=sgn*matriz[1][1];
                    else
                        cofactor=sgn*matriz[1][0];
                else
                    if(y==0)
                        cofactor=sgn*matriz[0][1];
                    else
                        cofactor=sgn*matriz[0][0];
            }
            else
                cofactor=cofactor*matriz[0][0]*matriz[1][1]-cofactor*matriz[0][1]*matriz[1][0];
        }
        else
            cofactor*=sgn*determinante(matrizmenor(matriz,x,y));
        return cofactor;
    }
    
}
