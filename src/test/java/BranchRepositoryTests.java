import DataJpa.dao.enums.Branch;
import DataJpa.dao.repository.BranchRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import static org.assertj.core.api.Assertions.*;

@DataJpaTest
public class BranchRepositoryTests  {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private BranchRepository repository;

    @Test
    public void testEx() {
        this.entityManager.persist(new Branch(1500, "SPb", 213190, 13876, "Ul. Stalevarov"));
        Branch route = (Branch) this.repository.findByCity("SPb");
        assertThat(route.getIndex()).isEqualTo(213190);
        assertThat(route.getAddress()).isEqualTo("Ul. Stalevarov");
    }
}