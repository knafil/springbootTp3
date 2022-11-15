package org.ensias.tp3.Module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class ModuelService {
    @Autowired
    private ModuleRepository moduleRepository;
    public List<Module> getAllModules(){
        List<Module> modules = new ArrayList<>();
        moduleRepository.findAll().forEach(modules::add);
        return modules;
    }
    public Optional<Module> getModule(Integer id) {
        return moduleRepository.findById(id);
    }
    public void ajouterModule(Module module){
        moduleRepository.save(module);
    }
    public void modifierModule(Integer id, Module module) {
        moduleRepository.save(module);
    }
    public void supprimerModule(Integer id) {
        moduleRepository.deleteById(id);
    }
    public void modifierModuleAvecPAtch(Integer id, Module module) {
        moduleRepository.save(module);
    }
}
