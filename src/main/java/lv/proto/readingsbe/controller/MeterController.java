package lv.proto.readingsbe.controller;

import lv.proto.readingsbe.model.Meter;
import lv.proto.readingsbe.service.MeterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meters")
public class MeterController {

    private MeterService meterService;

    public MeterController(MeterService meterService) {
        this.meterService = meterService;
    }

    @GetMapping
    @CrossOrigin("http://localhost:4200")
    public List<Meter> getAll() {
        return meterService.findAll();
    }

    @GetMapping("/{id}")
    @CrossOrigin("http://localhost:4200")
    public Meter getById(@PathVariable("id") Long id) {
        return meterService.findContract(id);
    }

}
