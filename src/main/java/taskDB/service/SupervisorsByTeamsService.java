package taskDB.service;
import taskDB.model.SupervisorsByTeams;
import java.util.List;
import taskDB.repository.SupervisorsByTeamsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupervisorsByTeamsService implements IsupervisorsByTeamsService {
    @Autowired
    private SupervisorsByTeamsRepository repository;

    @Override
    public List<SupervisorsByTeams> findAll() {
        List<SupervisorsByTeams> supervisors = (List<SupervisorsByTeams>) repository.findAll();
        return supervisors;
    }
}
