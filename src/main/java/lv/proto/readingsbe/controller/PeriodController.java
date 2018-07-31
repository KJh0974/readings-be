package lv.proto.readingsbe.controller;

import lv.proto.readingsbe.model.Period;
import lv.proto.readingsbe.service.PeriodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/periods")
public class PeriodController {

    private PeriodService periodService;

    public PeriodController(PeriodService periodService) {
        this.periodService = periodService;
    }

    @GetMapping
    @CrossOrigin("http://localhost:4200")
    public List<Period> getAll() {
        return periodService.findAll();
    }

    @GetMapping("/{id}")
    @CrossOrigin("http://localhost:4200")
    public Period getById(@PathVariable("id") Long id) {
        return periodService.findPeriod(id);
    }
}
