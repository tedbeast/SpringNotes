package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
//@RequestMapping("digimon")
//if we want to access our endpoints, this would change all to digimon/(whatever)
public class DigimonController {
    DigimonService digimonService;
//    inject a service into our controller
//    autowired: will automatically 'wire' (really think of this as selecting
//    the most appropriate bean to use from the IOC container)
    @Autowired
    public DigimonController(DigimonService digimonService){
        this.digimonService = digimonService;
    }
    @GetMapping
    public List<Digimon> getDigimon(){
        return digimonService.findAllDigimon();
    }
    @GetMapping("name/{name}")
    public Digimon getDigimonByName(@PathVariable String name){
        return digimonService.findDigimonByName(name);
    }
    @PostMapping()
    public Digimon postDigimon(@RequestBody Digimon digimon){
        return digimonService.saveDigimon(digimon);
    }
    @GetMapping("power/{pow}")
    public List<Digimon> getDigimonByPower(@PathVariable int pow){
        return digimonService.findAllDigimonByPower(pow);
    }
    /*you're likely to also need
    a delete mapping
    @DeleteMapping
    a patch mapping
    @PatchMapping
     */
}
