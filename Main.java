import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//=======================================================		
		
		/**
		 1) Faça um programa para ler dois valores inteiros,
		 e depois mostrar na tela a soma desses números  com uma 
		 mensagem explicativa, conforme exemplos. 
		 */
		
		/*
		int x,y,soma;
				
		System.out.println("Digite 2 inteiros:");
		x = sc.nextInt();
		y = sc.nextInt();
		soma = x+y;
		
		System.out.println("Soma = "+soma);
		*/
		

		//=======================================================
		
		/**
		 2) Faça um programa para ler o valor do raio de um círculo,
		 e depois mostrar o valor da área deste círculo com quatro 
		 casas decimais conforme exemplos.
		 Fórmula da área: area = π . raio2
		 Considere o valor de π = 3.14159
		 */
		
		/*
			double r,a,pi;
			
			pi = 3.14159;
			System.out.println("Digite o raio do círculo:");
			r = sc.nextDouble();
			
			a = pi * (Math.pow(r, 2));
			System.out.printf("Área = %.4f", a);
		*/
		
		//=======================================================
		
		/*
		 3)Fazer um programa para ler quatro valores inteiros A, B, C e D.
		 A seguir, calcule e mostre a diferença do produto de A e B pelo produto
		 de C e D segundo a fórmula: 
		 DIFERENCA = (A * B - C * D).
		 */
		
		/*
			int A,B,C,D,dif;
			
			System.out.println("Digite 4 inteiros:");
			A = sc.nextInt();
			B = sc.nextInt();
			C = sc.nextInt();
			D = sc.nextInt();
			dif = (A*B)-(C*D);
			
			System.out.println("DIFERENCA = "+dif);
		*/
		
		//=======================================================
		
		/**
		 4) Fazer um programa que leia o número de um funcionário, seu
		 número de horas trabalhadas, o valor que recebe por hora e calcula
		 o salário desse funcionário. A seguir, mostre o número e o salário
		 do funcionário, com duas casas decimais.
		 */
		
		/*
			int numero;
			double horas_trabalhadas,salario_por_hora,salario;
			
			System.out.println("Digite numero funcionario(int):");
			numero = sc.nextInt();
			
			System.out.println("Digite quantidade de horas trabalhadas (float):");
			horas_trabalhadas = sc.nextDouble();
			
			System.out.println("Digite valor salário por hora trabalhada (float):");
			salario_por_hora = sc.nextDouble();
			
			salario = (salario_por_hora * horas_trabalhadas);
			
			System.out.println("Número = "+numero);
			System.out.printf("Salário = %.2f", salario);
		*/
		
		//=======================================================
		
		/**
		 5) Fazer um programa para ler o código de uma peça 1, o número de peças 1,
		 o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2
		 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */
		
		/*
			int cod_1,cod_2;
			double qtd_1,qtd_2,vlr_1,vlr_2,total;
			
			System.out.println("Peça 1, digite código(int), quantidade(float) e valor(float):");
			cod_1 = sc.nextInt();
			qtd_1 = sc.nextDouble();
			vlr_1 = sc.nextDouble();
			
			System.out.println("Peça 2, digite código(int), quantidade(float) e valor(float):");
			cod_2 = sc.nextInt();
			qtd_2 = sc.nextDouble();
			vlr_2 = sc.nextDouble();
			
			total = qtd_1*vlr_1 + qtd_2*vlr_2;
			
			System.out.println("VALOR A PAGAR = "+total);
		*/
		
		//=======================================================
		
		/**
		 6) Fazer um programa que leia três valores com ponto flutuante
		 de dupla precisão: A, B e C. Em seguida, calcule e mostre: 
		 a) a área do triângulo retângulo que tem A por base e C por
		    altura. 
		 b) a área do círculo de raio C. (pi = 3.14159) 
		 c) a área do trapézio que tem A e B por bases e C por altura. 
		 d) a área do quadrado que tem lado B. 
		 e) a área do retângulo que tem lados A e B.
	  */
		
		double A,B,C, area_a,area_b,area_c,area_d,area_e,pi;
		
		System.out.println("Digite 3 numeros(float):");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		// a)
		area_a = (A*C)/2;
		
		// b)
		pi = 3.14159;
		area_b = pi * (Math.pow(C, 2));

		// c)
		area_c =  (A + B) * C / 2;
		
		// d)
		area_d = Math.pow(B, 2);
		
		// e)
		area_e = A * B;
		
		System.out.printf("TRIANGULO = %.3f%n",area_a);
		System.out.printf("CIRCULO = %.3f%n",area_b);
		System.out.printf("TRAPEZIO = %.3f%n",area_c);
		System.out.printf("QUADRADO = %.3f%n",area_d);
		System.out.printf("RETANGULO = %.3f%n",area_e);
		
	}

}
