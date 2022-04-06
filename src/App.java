import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int escolha;

        String resp = "";

        do{
            System.out.println("[1] IDADE");
            System.out.println("[2] AREA");
            System.out.println("[3] IMC"); // OK
            System.out.println("[4] DADOS");
            System.out.println("[5] DATA");
            System.out.println("[6] DESCONTO");
            System.out.println("[7] COMPRIMENTO");
            System.out.println("[8] MASSA");
            System.out.println("[9] SISTEMA NUMERAL");
            System.out.println("[10] VELOCIDADE");
            System.out.println("[11] TEMPERATURA"); // OK
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

                    float peso;
                    float altura;
                    float imc;

                    System.out.println("========================================");
                    System.out.println("");
                    System.out.print("Digite seu peso em KG (ex: 69,2): ");
                    peso = input.nextFloat();
                    System.out.println("---------------------------------------");
                    System.out.print("Digite sua altura em M (ex: 1,70): ");
                    altura = input.nextFloat();
                    System.out.println("========================================");
                    System.out.println("");

                    imc = (peso / (altura * altura));

                    if (imc < 17){
                        System.out.println("Você está muito abaixo do peso ideal.");
                        System.out.format("Seu IMC é de %.2f\n", imc);
                        System.out.println("========================================");
                        System.out.println("");
                    }else if (imc >= 17 && imc < 18.5){
                        System.out.println("Você esta abaixo do peso ideal.");
                        System.out.format("Seu IMC é de %.2f\n", imc);
                        System.out.println("========================================");
                        System.out.println("");
                    }else if (imc >= 18.5 && imc < 25){
                        System.out.println("Você está no peso ideal.");
                        System.out.format("Seu IMC é de %.2f\n", imc);
                        System.out.println("========================================");
                        System.out.println("");
                    }else if (imc >= 25 && imc < 30){
                        System.out.println("Você está com sobrepeso.");
                        System.out.format("Seu IMC é de %.2f\n", imc);
                        System.out.println("========================================");
                        System.out.println("");
                    }else if (imc >= 30 && imc < 35){
                        System.out.println("Você está com obesidade.");
                        System.out.format("Seu IMC é de %.2f\n", imc);
                        System.out.println("========================================");
                        System.out.println("");
                    }else if (imc >= 35 && imc < 40){
                        System.out.println("Você está com obesidade severa.");
                        System.out.format("Seu IMC é de %.2f\n", imc);
                        System.out.println("========================================");
                        System.out.println("");
                    }else if (imc > 40){
                        System.out.println("Você está com obesidade morbida.");
                        System.out.format("Seu IMC é de %.2f\n", imc);
                        System.out.println("========================================");
                        System.out.println("");
                    }else{
                    }





                    System.out.print("Deseja calcular novamente? ");
                    resp = input.next();
                    break;
                case 4:

                    System.out.print("Deseja calcular novamente? ");
                    resp = input.next();
                    break;
                case 5:
                    System.out.println("[1] Binário para Decimal.");
                    System.out.println("[2] Binário para Hexadecimal.");
                    System.out.println("[3] Binário para Octal.");
                    System.out.println("[4] Decimal para Binário.");
                    System.out.println("[5] Decimal para Hexadecimal.");
                    System.out.println("[6] Decimal para Octal.");
                    System.out.println("[7] Hexadecimal para Decimal.");
                    System.out.println("[8] Hexadecimal para Binário.");
                    System.out.println("[9] Hexadecimal para Octal.");
                    System.out.println("[10] Octal para Decimal.");
                    System.out.println("[11] Octal para Binário.");
                    System.out.println("[12] Octal para Hexadecimal.");

                    System.out.print("Escolha uma opção desejada: ");
                    int escolha_5 = input.nextInt();

                    switch(escolha_5){

                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6: 
                            break;
                        case 7:
                            break;
                        case 8:
                            break;
                        case 9:
                            break;
                        case 10:
                            break;
                        case 11:
                            break;
                        case 12:
                            break;

                    

                        default:
                            break;

                    }




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

                    /*
                                  
                    Kilograma (kg)
                    Hectograma (hg) x
                    Decagrama (dag) x
                    Grama (g)
                    Decigrama (dg) x
                    Centigrama (cg) x
                    Miligrama (mg)
                
                    Tonelada (t) 
                    Quilate 
                    Arroba (@)

                    */

                    System.out.println("[1] Kilograma (kg) para Grama (g).");
                    System.out.println("[2] Kilograma (kg) para Miligrama (mg).");
                    System.out.println("[3] Kilograma (kg) para Tonelada (t).");
                    System.out.println("[4] Kilograma (kg) para Quilate.");
                    System.out.println("[5] Kilograma (kg) para Arroba (@).");
                    System.out.println("[6] Grama (g) para Kilograma (kg).");
                    System.out.println("[7] Grama (g) para Miligrama (mg).");
                    System.out.println("[8] Grama (g) para Tonelada (t).");
                    System.out.println("[9] Grama (g) para Quilate .");
                    System.out.println("[10] Grama (g) para Arroba (@).");
                    
                    System.out.print("Escolha uma opção: ");
                    int escolha_8 = input.nextInt();

                    switch (escolha_8){

                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6: 
                            break;
                        case 7:
                            break;
                        case 8:
                            break;
                        case 9:
                            break;
                        case 10:
                            break;

                        default:
                        break;


                    }

                   


                    

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

                    System.out.println("========================================");
                    System.out.println("");
                    System.out.println("[1] Celsius °C para Fahrenheit °F");
                    System.out.println("[2] Fahrenheit °F para Celsius °C");
                    System.out.println("[3] Celsius °C para Kelvin °K");
                    System.out.println("[4] Fahrenheit °F para Kelvin °K");
                    System.out.println("[5] Kelvin °K para Celsius °C");
                    System.out.println("[6] Kelvin °K para Fahrenheit °F");
                    System.out.println("========================================");
                    System.out.println("");
                    System.out.print("Escolha alguma das converções: ");
                    int escolha_11 = input.nextInt();
                    System.out.println("========================================");
                    System.out.println("");

                    switch(escolha_11){
                        case 1:
                            System.out.print("Digite a temperatura em °C: ");
                            double cel = input.nextFloat();
                            double fahrenheit = 1.8 * cel + 32; 

                            
                            System.out.println("");
                            System.out.format(" %.2f °C é igual a %.2f °F\n", cel, fahrenheit);
                            System.out.println("========================================");
                            System.out.println("");

                            break;
                        case 2:
                            System.out.print("Digite a temperatura em °F: ");
                            double fah = input.nextFloat();
                            double celsius = (fah - 32) / 1.8;

                            System.out.println("");
                            System.out.format("%.2f °F é igual a %.2f °C\n", fah, celsius);
                            System.out.println("========================================");
                            System.out.println("");


                            break;
                        case 3:
                            System.out.print("Digite a temperatura em °C: ");
                            double cels = input.nextFloat();
                            double kel = cels + 273.15;

                            System.out.println("");
                            System.out.format("%.2f °C é igual a %.2f °K\n", cels, kel);
                            System.out.println("========================================");
                            System.out.println("");
                            break;
                        case 4:
                            System.out.print("Digite a temperatura em °F: ");
                            double fahr = input.nextFloat();
                            double kelv = (fahr - 32) * 5/9 + 273.15;

                            System.out.println("");
                            System.out.format("%.2f °F é igual a %.2f °K\n", fahr, kelv);
                            System.out.println("========================================");
                            System.out.println("");
                            break;
                        case 5:
                            System.out.print("Digite a temperatura em °K: ");
                            double kelvi = input.nextFloat();
                            double celsi = kelvi - 273.15;

                            System.out.println("");
                            System.out.format("%.2f °K é igual a %.2f °C\n", kelvi, celsi);
                            System.out.println("========================================");
                            System.out.println("");
                            break;
                        case 6:
                            System.out.print("Digite a temperatura em °K: ");
                            double kelvin = input.nextFloat();
                            double fahre = (kelvin - 273.15) * 1.8 + 32;

                            System.out.println("");
                            System.out.format("%.2f °K é igual a %.2f °F\n", kelvin, fahre);
                            System.out.println("========================================");
                            System.out.println("");
                            break;

                    }
        
                    
                    

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
        System.out.println("========================================");
        System.out.println("");
        System.out.println("VOLTE SEMPRE!!!");  

        input.close();
    }


    }

