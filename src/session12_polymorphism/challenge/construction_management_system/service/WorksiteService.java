package session12_polymorphism.challenge.construction_management_system.service;

import session12_polymorphism.challenge.construction_management_system.model.MaterialModel;
import session12_polymorphism.challenge.construction_management_system.model.WorksiteModel;

public interface WorksiteService {

    WorksiteModel createWorksite(String name, String objective);
    void addMaterialRequirement(MaterialModel material, int quantity);
    void supplyRequiredMaterial(MaterialModel materialModel, int quantity);
    void useMaterial(MaterialModel materialModel, int quantity);

}
