package org.ensias.tp3.Module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ModuleController {
    @Autowired
    private ModuelService moduelService;
    @RequestMapping("/modules")
    public List<Module> getModules(){
        return moduelService.getAllModules();
    }
    @RequestMapping("/modules/{id}")
    public Optional<Module> getModule(@PathVariable Integer id){
        return moduelService.getModule(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/modules")
    public void ajouterModule(@RequestBody Module module){
        moduelService.ajouterModule(module);
    }
    @RequestMapping(method=RequestMethod.PUT, value="/modules/{id}")
    public void modifierModule(@RequestBody Module module, @PathVariable Integer id) {
        moduelService.modifierModule(id, module);
    }
    @RequestMapping(method=RequestMethod.PATCH, value="/modules/{id}")
    public void modifierModuleAvecPatch(@RequestBody Module module, @PathVariable Integer id) {
        moduelService.modifierModuleAvecPAtch(id, module);
    }
    @RequestMapping(method=RequestMethod.DELETE, value="/modules/{id}")
    public void supprimerModule(@PathVariable Integer id) {
        moduelService.supprimerModule(id);
    }
}
