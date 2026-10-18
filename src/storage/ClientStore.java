package storage;

import model.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientStore {
    private final List<Customer> customerList;

    public ClientStore(List<Customer> customerList) {
        this.customerList = customerList != null ? new ArrayList<>(customerList) : new ArrayList<>();
    }

    // Retorna uma lista imutável para proteger o estado interno
    public List<Customer> getCustomerList() {
        return Collections.unmodifiableList(customerList);
    }

    // Métodos para gerenciar os clientes de forma segura
    public void addCustomer(Customer customer) {
        if (customer != null) {
            this.customerList.add(customer);
        }
    }
}
