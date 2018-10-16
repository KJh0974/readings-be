package lv.proto.readingsbe.controller;

import lv.proto.readingsbe.model.Period;
import lv.proto.readingsbe.service.PeriodService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/periods")
public class PeriodController {

    private PeriodService periodService;

    public PeriodController(PeriodService periodService) {
        this.periodService = periodService;
    }

    @GetMapping
    public List<Period> getAll() {
        return periodService.findAll();
    }

    @GetMapping("/{id}")
    public Period getById(@PathVariable("id") Long id) {
        return periodService.findPeriod(id);
    }
}
