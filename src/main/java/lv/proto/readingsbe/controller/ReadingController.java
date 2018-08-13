package lv.proto.readingsbe.controller;

import lv.proto.readingsbe.entity.ReadingDO;
import lv.proto.readingsbe.model.Reading;
import lv.proto.readingsbe.service.ReadingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/readings")
@CrossOrigin("http://localhost:4200")
public class ReadingController {

    private ReadingService readingService;

    public ReadingController(ReadingService readingService) {
        this.readingService = readingService;
    }

    @GetMapping
    public List<Reading> getAll() {
        return readingService.findAll();
    }

    @GetMapping("/{id}")
    public Reading getById(@PathVariable("id") Long id) {
        return readingService.findById(id);
    }

    @PostMapping
    public Reading addReading(@RequestBody ReadingDO reading) {
        return readingService.add(reading);
    }
}
