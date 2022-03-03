package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.lang.annotation.*;
import java.util.List;
@Component
/*@Scope("prototype")
scopes:
singleton(default): a single bean of this component is instantiated, and reused,
like the singleton desgin pattern
prototype: a bean is generated every time this component is wire
session: a bean is generated for every session
request: a bean is generated for every httprequest
globalsession: a bean is generated for the lifecycle of a global httpsession
websocket scope: a bean is generated for the lifecycle of a spring websocket (niche)
 */
public class DigimonService {
    DigimonRepository digimonRepository;
    public DigimonService(DigimonRepository digimonRepository){
        this.digimonRepository = digimonRepository;
    }

    public List<Digimon> findAllDigimon(){
        return digimonRepository.findAll();
    }

    public Digimon findDigimonByName(String name){
        return digimonRepository.findByName(name);
    }
    public Digimon saveDigimon(Digimon digimon){
        return digimonRepository.save(digimon);
    }
    public List<Digimon> findAllDigimonByPower(int power){
        return digimonRepository.findAllByPower(power);
    }

}
