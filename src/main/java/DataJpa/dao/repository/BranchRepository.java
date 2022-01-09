package DataJpa.dao.repository;

import DataJpa.dao.enums.Branch;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BranchRepository extends CrudRepository<Branch, Long> {
    List<Branch> findByCity(String city);
}
