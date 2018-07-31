package lv.proto.readingsbe.controller;

import lv.proto.readingsbe.model.Object;
import lv.proto.readingsbe.service.ObjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/objects")
public class ObjectController {

    private ObjectService objectService;

    public ObjectController(ObjectService objectService) {
        this.objectService = objectService;
    }

    @GetMapping
    @CrossOrigin("http://localhost:4200")
    public List<Object> getAll() {
        return objectService.findAll();
    }

    @GetMapping("/{id}")
    @CrossOrigin("http://localhost:4200")
    public Object getById(@PathVariable("id") Long id) {
        return objectService.findContract(id);
    }

}
