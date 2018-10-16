package lv.proto.readingsbe.controller;

import lv.proto.readingsbe.model.Meter;
import lv.proto.readingsbe.service.MeterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/meters")
public class MeterController {

    private MeterService meterService;

    public MeterController(MeterService meterService) {
        this.meterService = meterService;
    }

    @GetMapping
    public List<Meter> getAll() {
        return meterService.findAll();
    }

    @GetMapping("/{id}")
    public Meter getById(@PathVariable("id") Long id) {
        return meterService.findContract(id);
    }

}
