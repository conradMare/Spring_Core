package dev.danvega.runnerz.run;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RunController {

    // Get an instance that returns the RunRepository:

//    WRONG WAY TO GET AN INSTANCE -> Spring is an inversion of control framework(note the 'new' keyword):
//    private final RunRepository runRepository {
//        this.runRepository = new RunRepository();
//    }

    //    DO THIS:
    private final RunRepository runRepository;
    public RunController(RunRepository runRepository) {
        this.runRepository = runRepository;
    }

    // Write a method that returns a List of runs:
    @GetMapping("api/runs")
    List<Run> findAll() {
        return runRepository.findAll();
    }
}
