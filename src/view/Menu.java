package view;

import service.ClientServices;

import java.util.Scanner;

public class Menu {
    public static void optionsMenu(Scanner scanner) {
        int choice = 0;

        while (choice != 4) {
            showMenu();

            // Verificação e correção da opção informada
            try {
                System.out.print("Opção: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> ClientServices.registerCustomer(scanner);
                    case 2 -> ClientServices.listCustomers();
                    case 3 -> ClientServices.deleteClient(scanner);
                    case 4 -> {
                        System.out.println("✌️ Fechando Programa!");
                        break;
                    }
                    default -> {
                        System.out.println("🤖 Ops, Digite Outra Opção do Menu!");
                        scanner.nextLine();
                    }
                }

            } catch (Exception e) {
                System.out.println("🤖 Ops, Opção Não Enconstrada!");
                scanner.nextLine();
            }
        }
    }

    public static void showMenu() {
        System.out.println("=".repeat(30));
        System.out.println("Sistema Empresarial ABC");
        System.out.println("=".repeat(30));

        System.out.println("\n1. Novo Cliente");
        System.out.println("2. Listar Clientes");
        System.out.println("3. Excluir Cliente");
        System.out.println("4. Sair do Programa");
    }
}
