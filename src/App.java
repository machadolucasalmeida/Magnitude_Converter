import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int escolha;

        String resp = "";

        do{
            System.out.println("[1] IDADE");
            System.out.println("[2] AREA");
            System.out.println("[3] IMC");
            System.out.println("[4] DADOS");
            System.out.println("[5] DATA");
            System.out.println("[6] DESCONTO");
            System.out.println("[7] COMPRIMENTO");
            System.out.println("[8] MASSA");
            System.out.println("[9] SISTEMA NUMERAL");
            System.out.println("[10] VELOCIDADE");
            System.out.println("[11] TEMPERATURA");
            System.out.println("[12] TEMPO");
            System.out.println("[13] VOLUME");

            System.out.print("Digite a opção desejada: ");
            escolha = input.nextInt();

        
            switch(escolha){
                case 1: 

                    System.out.print("Deseja calcular novamente? ");
                    resp = input.next();
                    break;
                case 2: 

                    System.out.print("Deseja calcular novamente? ");
                    resp = input.next();
                    break;
                case 3:

                    System.out.print("Deseja calcular novamente? ");
                    resp = input.next();
                    break;
                case 4:

                    System.out.print("Deseja calcular novamente? ");
                    resp = input.next();
                    break;
                case 5:

                    System.out.print("Deseja calcular novamente? ");
                    resp = input.next();
                    break;
                case 6:

                    System.out.print("Deseja calcular novamente? ");
                    resp = input.next();
                    break;
                case 7:

                    System.out.print("Deseja calcular novamente? ");
                    resp = input.next();
                    break;
                case 8: 

                    System.out.print("Deseja calcular novamente? ");
                    resp = input.next();
                    break;
                case 9:

                    System.out.print("Deseja calcular novamente? ");
                    resp = input.next();
                    break;
                case 10:

                    System.out.print("Deseja calcular novamente? ");
                    resp = input.next();
                    break;
                case 11:

                    System.out.print("Deseja calcular novamente? ");
                    resp = input.next();
                    break;
                case 12:

                    System.out.print("Deseja calcular novamente? ");
                    resp = input.next();
                    break;
                case 13:

                    System.out.print("Deseja calcular novamente? ");
                    resp = input.next();
                    break;
                default:
                    break;
            }
        }while(resp.equals("sim") || resp.equals("s") || resp.equals("Sim") || resp.equals("S"));

        System.out.println("VOLTE SEMPRE!!!");  

        input.close();
    }


    }

