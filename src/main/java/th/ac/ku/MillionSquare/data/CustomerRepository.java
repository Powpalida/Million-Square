package th.ac.ku.MillionSquare.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.MillionSquare.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
