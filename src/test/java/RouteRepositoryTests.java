import DataJpa.dao.enums.Route;
import DataJpa.dao.repository.RouteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import static org.assertj.core.api.Assertions.*;

@DataJpaTest
public class RouteRepositoryTests {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private RouteRepository repository;

    @Test
    public void testEx() {
        this.entityManager.persist(new Route(12, "Gatchina", "Kislovodsk", 2400));
        Route route = this.repository.findById(12);
        assertThat(route.getArrival()).isEqualTo("Kislovodsk");
        assertThat(route.getDeparture()).isEqualTo("Gatchina");
    }
}