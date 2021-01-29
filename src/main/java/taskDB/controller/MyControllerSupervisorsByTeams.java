package taskDB.controller;
import org.springframework.beans.factory.annotation.Autowired;
import taskDB.model.SupervisorsByTeams;
import taskDB.service.IsupervisorsByTeamsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class MyControllerSupervisorsByTeams {
    @Autowired
    private IsupervisorsByTeamsService supervisorsByTeamsService;

    @GetMapping("/showSupervisors")
    public String findSupervisors(Model model) {
        List<SupervisorsByTeams> supervisorsByTeams = (List<SupervisorsByTeams>) supervisorsByTeamsService.findAll();
        model.addAttribute("supervisors_by_teams", supervisorsByTeams);
        return "showSupervisorsByTeams";
    }

}
