package session12_polymorphism.challenge.construction_management_system.model;

import java.util.HashMap;
import java.util.Map;

public class WorksiteModel {

    private String name;
    private String objective;
    Map<MaterialModel, Integer> requiredMaterials;

    public WorksiteModel(String name, String objective) {
        this.name = name;
        this.objective = objective;
        requiredMaterials = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public Map<MaterialModel, Integer> getRequiredMaterials() {
        return requiredMaterials;
    }

    public void setRequiredMaterials(Map<MaterialModel, Integer> requiredMaterials) {
        this.requiredMaterials = requiredMaterials;
    }
}
