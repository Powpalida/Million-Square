package th.ac.ku.MillionSquare.service;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import th.ac.ku.MillionSquare.data.AdminRepository;
import th.ac.ku.MillionSquare.model.Ad_min;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AdminService {

    private AdminRepository repository;

    public AdminService(AdminRepository repository){
        this.repository = repository;
    }

    public void createCustomer(Ad_min admin){
        String hashPin = hash(admin.getPin());
        admin.setPin(hashPin);
        repository.save(admin);
    }

    public List<Ad_min> getCustomers(){
        try {
            return repository.findAll();
        }catch (NoSuchElementException e){
            return null;
        }

    }

    public Ad_min findAdmin(int id){
        return repository.findById(id).get();
    }

    public Ad_min checkPin(Ad_min inputAdmin){
        Ad_min storedAdmin = findAdmin(inputAdmin.getId());

        if (storedAdmin != null){
            String hashPin = storedAdmin.getPin();

            if (BCrypt.checkpw(inputAdmin.getPin(),hashPin))
                return storedAdmin;
        }
        return null;
    }

    private String hash(String pin){
        String salt = BCrypt.gensalt(12);
        return BCrypt.hashpw(pin,salt);
    }
}