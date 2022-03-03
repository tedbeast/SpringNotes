package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DigimonController {
    DigimonService digimonService;

    @Autowired
    public DigimonController(DigimonService digimonService){
        this.digimonService = digimonService;
    }

    @GetMapping
    public List<Digimon> getAllDigimon(){
        return digimonService.getAllDigimon();
    }

    @GetMapping({"name"})
    public List<Digimon> getAllDigimonByName(@PathVariable String name){
        return digimonService.getAllDigimonByName(name);
    }

}
