package th.ac.ku.MillionSquare.data;

import org.springframework.data.jpa.repository.JpaRepository;
import th.ac.ku.MillionSquare.model.Ad_min;

public interface AdminRepository extends JpaRepository<Ad_min,Integer> {
}
