package taskDB.repository;
import taskDB.model.SupervisorsByTeams;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupervisorsByTeamsRepository extends CrudRepository<SupervisorsByTeams, Integer> {

}
