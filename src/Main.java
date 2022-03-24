import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    private static void start(){
        int quantidade, opcao;
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();

        System.out.printf("Informe ano:"  );
        int ano = scanner.nextInt();

        System.out.printf("Informe mes:"  );
        int mes = scanner.nextInt();

        System.out.printf("Informe dia:"  );
        int dia = scanner.nextInt();

        System.out.printf("Informe hora:"  );
        int hora = scanner.nextInt();

        System.out.printf("Informe minuto:"  );
        int minuto = scanner.nextInt();

        System.out.printf("Informe segundo:"  );
        int segundo = scanner.nextInt();

        calendar.set(ano,mes,dia,hora,minuto,segundo);

        do {
            System.out.println("\n\tDigite a opção desejada:\n");
            System.out.printf("Escolha uma opção:\n" +
                    "\t1) Adicionar dia;\n"+
                    "\t2) Adicionar meses;\n"+
                    "\t3) Adicionar anos;\n"+
                    "\t4) Subtrair dias;\n"+
                    "\t5) Subtrair meses;\n"+
                    "\t6) Subtrair anos;\n"+
                    "\t0) Finalizar/Sair;\n");

            opcao = scanner.nextInt();
            switch (opcao) {
                case 0:
                    break;

                case 1:
                    System.out.println("Informe um valor:");
                    quantidade = scanner.nextInt();
                    calendar.set(Calendar.DAY_OF_MONTH, calendar.get(calendar.DAY_OF_MONTH)+quantidade);
                    printData(calendar);
                    break;

                case 2:
                    System.out.println("Informe um valor:");
                    quantidade = scanner.nextInt();
                    calendar.set(Calendar.MONTH, calendar.get(calendar.MONTH)+quantidade);
                    printData(calendar);
                    break;

                case 3:
                    System.out.println("Informe um valor:");
                    quantidade = scanner.nextInt();
                    calendar.set(Calendar.YEAR, calendar.get(calendar.YEAR)+quantidade);
                    printData(calendar);
                    break;


                case 4:
                    System.out.println("Informe um valor:");
                    quantidade = scanner.nextInt();
                    calendar.set(Calendar.DAY_OF_MONTH, calendar.get(calendar.DAY_OF_MONTH)-quantidade);
                    printData(calendar);
                    break;

                case 5:
                    System.out.println("Informe um valor:");
                    quantidade = scanner.nextInt();
                    calendar.set(Calendar.MONTH, calendar.get(calendar.MONTH)-quantidade);
                    printData(calendar);
                    break;

                case 6:
                    System.out.println("Informe um valor:");
                    quantidade = scanner.nextInt();
                    calendar.set(Calendar.YEAR, calendar.get(calendar.YEAR)-quantidade);
                    printData(calendar);
                    break;

                default: System.out.println("Opção inválida.");
                    break;
            }
        }while(opcao!=0);
        scanner.close();
        System.out.println("\n\tAté breve!");
    }


    private static void printData(Calendar calendar){
        System.out.println("\nA data atualizada é:".toUpperCase());
        System.out.println("\nAno:" + calendar.get(Calendar.YEAR));
        System.out.println("\nMes:" + calendar.get(Calendar.MONTH));
        System.out.println("\nDia:" + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("\nHorario:" + calendar.get(Calendar.HOUR));
        System.out.println("\nMinuto:" + calendar.get(Calendar.MINUTE));
        System.out.println("\nSegundo:" + calendar.get(Calendar.SECOND));
    }


    public static void main(String[] args) {
        start();

    }

}

