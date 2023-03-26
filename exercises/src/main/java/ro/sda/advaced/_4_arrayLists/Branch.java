package ro.sda.advaced._4_arrayLists;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Branch {

    private List<Customer> customers;
    private String branchName;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }

    public List<Customer> getCustomers() {
        return Collections.unmodifiableList(customers);
    }

    public String getBranchName() {
        return branchName;
    }

    public void addCustomer(String customerName, double initialAmount) {
        if (customers.contains(new Customer(customerName, initialAmount))) {
            throw new RuntimeException("Client already exists!");
        }
        customers.add(new Customer(customerName, initialAmount));
    }

    public void addCustomerTransaction(String customerName, double amount) {
        // Initial amount doesn't matter(hence it's zero) because in Customer class we've implemented equals and hashcode
        // which allows us to check only if the customer names are equal hence we can have two reference objects
        // @765 and @786 that are objects referring to a customer with the same name
        Customer search = new Customer(customerName, 0);
        if (customers.contains(search)) {
            Customer found = customers.get(customers.indexOf(search));
            found.addTransaction(amount);
        }else {
            throw new RuntimeException("Customer doesn't exist!");
        }
    }


}
