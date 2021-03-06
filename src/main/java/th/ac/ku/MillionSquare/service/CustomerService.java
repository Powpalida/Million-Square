package th.ac.ku.MillionSquare.service;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import th.ac.ku.MillionSquare.data.CustomerRepository;
import th.ac.ku.MillionSquare.model.Customer;
import javax.annotation.PostConstruct;
import java.util.List;
import java.util.NoSuchElementException;


@Service
public class CustomerService {

    private CustomerRepository repository;

    public CustomerService(CustomerRepository repository){
        this.repository = repository;
    }

    public void createCustomer(Customer customer){
        String hashPin = hash(customer.getPin());
        customer.setPin(hashPin);
        repository.save(customer);
    }

    public List<Customer> getCustomers(){
        try {
            return repository.findAll();
        }catch (NoSuchElementException e){
            return null;
        }

    }

    public Customer findCustomer(int id){
        return repository.findById(id).get();
    }

    public Customer checkPin(Customer inputCustomer){
        Customer storedCustomer = findCustomer(inputCustomer.getId());

        if (storedCustomer != null){
            String hashPin = storedCustomer.getPin();

            if (BCrypt.checkpw(inputCustomer.getPin(),hashPin))
                return storedCustomer;
        }
        return null;
    }

    private String hash(String pin){
        String salt = BCrypt.gensalt(12);
        return BCrypt.hashpw(pin,salt);
    }
}
