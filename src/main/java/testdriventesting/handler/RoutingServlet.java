package testdriventesting.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import testdriventesting.service.Assignment;
import testdriventesting.service.UnitList;

@Controller
public class RoutingServlet {

    @Autowired
    private UnitList unitListService;

    @GetMapping("/")
    public String welcome(Model model) {
        System.out.println("Welcome ...");

        // Retrieve the unit list and add it to the model
        String[] unitList = unitListService.getUnitList();
        model.addAttribute("unitList", unitList);

        return "view-welcome"; 
    }

    @GetMapping("/selectUnit")
    public String selectUnit(@RequestParam("unit") String unit) {
        return "redirect:/" + unit;
    }

    @GetMapping("/{unit}")
    public String viewAssignments(@PathVariable("unit") String unit, Model model) {
        System.out.println("View assignments for unit: " + unit);

        // Retrieve the assignment list for the specified unit and add it to the model
        Assignment[] assignments = unitListService.getAssignmentListForUnit(unit);
        model.addAttribute("assignments", assignments);
        model.addAttribute("unit", unit);

        return "view-assignments"; 
    }
}
