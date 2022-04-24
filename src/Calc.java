import java.util.Scanner;

public class Calc {

    static public void main(String[] args){
        Scanner scan=new Scanner(System.in);

        float n1, n2, resultado = 0;
        int opcao;

        String opc="S";

        while(opc.equals("s") || opc.equals("S")) {

            System.out.println("1 -> Soma \n2 -> Subtracao \n3 -> Multiplicação \n4 -> Divisão");
            System.out.println("Digite o valor correspondente a operação qeu deseja: ");
            opcao = scan.nextInt();

            System.out.println("Digite o valor 1: ");
            n1 = scan.nextFloat();

            System.out.println("Digite o valor 2: ");
            n2 = scan.nextFloat();

            switch(opcao){
                case 1:
                    resultado = n1+n2;
                    break;
                case 2:
                    resultado = n1-n2;
                    break;
                case 3:
                    resultado = n1*n2;
                    break;
                case 4:
                    resultado = n1/n2;
                    break;
            }
            System.out.printf("O valor da Operação é de: %f \n", resultado);
            System.out.println("---------");

            System.out.printf("%nDeseja somar outro valor?");
            opc=scan.next();
            System.out.printf("---------%n");
        }
    }
}
