package service;

import model.Customer;
import storage.ClientStore;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.UUID;

public class ClientServices {
    private static final ClientStore clientStore = new ClientStore();

    // Função para realização do cadastro de novos clientes
    public static void registerCustomer(Scanner scanner) {
        System.out.print("Nome: ");
        String name = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Telefone: ");
        String phone = scanner.nextLine();

        System.out.print("Patrimônio Atual: ");
        BigDecimal revenue = scanner.nextBigDecimal();
        scanner.nextLine();

        // Dados gerados automáticamentes do usuário
        UUID id = UUID.randomUUID();
        boolean active = true;
        LocalDateTime createdAt = LocalDateTime.now();

        Customer customer = new Customer(id, name, email, phone, active, revenue, createdAt);
        clientStore.addCustomer(customer);
    }

    // Função para realizar a listagem dos clientes
    public static void listCustomers() {
        if (clientStore != null) {
            System.out.println(clientStore);
        } else {

        }
    }
}
