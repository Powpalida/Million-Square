package th.ac.ku.MillionSquare.service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import th.ac.ku.MillionSquare.data.ContactRepository;
import th.ac.ku.MillionSquare.model.Contact;
import th.ac.ku.MillionSquare.model.Customer;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ContactService {

    private ContactRepository repository;

    public ContactService(ContactRepository repository){
        this.repository = repository;
    }

    public void saveContact(Contact contact){
        repository.save(contact);
    }

    public List<Contact> getContact(){
        try {
            return repository.findAll();
        }catch (NoSuchElementException e){
            return null;
        }

    }

    public Contact findContact(int id){
        return repository.findById(id).get();
    }
}
