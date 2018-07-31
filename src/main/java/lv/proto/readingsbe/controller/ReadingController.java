package lv.proto.readingsbe.controller;

import lv.proto.readingsbe.model.Reading;
import lv.proto.readingsbe.service.ReadingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/readings")
public class ReadingController {

    private ReadingService readingService;

    public ReadingController(ReadingService readingService) {
        this.readingService = readingService;
    }

    @GetMapping
    @CrossOrigin("http://localhost:4200")
    public List<Reading> getAll() {
        return readingService.findAll();
    }

    @GetMapping("/{id}")
    @CrossOrigin("http://localhost:4200")
    public Reading getById(@PathVariable("id") Long id) {
        return readingService.findById(id);
    }
}
