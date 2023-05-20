import java.util.Scanner;

class Imc {
	
    public static void main (String args []){
   
		Scanner teclado = new Scanner(System.in);
	  
		double peso ;
		double altura;
		double imc;
		  
		System.out.println("por favor insira o seu peso:");
		peso = teclado.nextInt();
		 
		System.out.println("Por Favor insira a sua altura:");
		altura = teclado.nextDouble();
		 
		 imc = peso / (altura * altura);
		
		if (imc < 1.8){
			 System.out.printf("você está passando fome, seu é %f",imc);
		}else if (imc >= 18.5 && imc <= 24.9){
			   System.out.printf("você está no peso normal, seu é %f",imc);
		}else if(imc >= 25 && imc <= 29.9){
			System.out.printf("você está pré-obeso, seu é %f",imc);
		}else if (imc >= 30 && imc <= 34.9){
			System.out.printf("você está com peso de q possuem obesidade, seu é %f",imc);
		}else if (imc >= 35 && imc <= 39.9){
			System.out.printf("você está com peso de q possuem obesidadee, seu é %f",imc);
		}else if ( imc > 40.0){
		    System.out.printf("você está com peso de q possuem obesidadee, seu é %f",imc);
		}		
		
		else{
			System.out.printf("Ultimo %f",imc);
		}  
      
    System.exit(0);
		
  
  }
}






























































