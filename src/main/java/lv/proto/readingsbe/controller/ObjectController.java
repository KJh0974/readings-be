package lv.proto.readingsbe.controller;

import lv.proto.readingsbe.entity.ObjectDO;
import lv.proto.readingsbe.model.Object;
import lv.proto.readingsbe.service.ObjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/objects")
@CrossOrigin("http://localhost:4200")
public class ObjectController {

    private ObjectService objectService;

    public ObjectController(ObjectService objectService) {
        this.objectService = objectService;
    }

    @GetMapping
    public List<Object> getAll() {
        return objectService.findAll();
    }

    @GetMapping("/{id}")
    public Object getById(@PathVariable("id") Long id) {
        return objectService.findContract(id);
    }

    @PostMapping
    public Object addReading(@RequestBody ObjectDO objectDO) {
        return objectService.add(objectDO);
    }
}
