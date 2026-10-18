package storage;

import model.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientStore {
    private final List<Customer> customerList;

    public ClientStore() {
        this.customerList = new ArrayList<>();
    }

    // Construtor alternativo: permite inicializar com uma lista já existente
    public ClientStore(List<Customer> initialList) {
        this.customerList = initialList != null ? new ArrayList<>(initialList) : new ArrayList<>();
    }

    // Retorna uma lista imutável para proteger o estado interno contra modificações externas acidentais
    public List<Customer> getCustomerList() {
        return Collections.unmodifiableList(customerList);
    }

    // Método para gerenciar e adicionar novos clientes de forma segura
    public void addCustomer(Customer customer) {
        if (customer != null) {
            this.customerList.add(customer);
        }
    }
}