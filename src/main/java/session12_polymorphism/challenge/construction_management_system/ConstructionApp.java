package session12_polymorphism.challenge.construction_management_system;

import session12_polymorphism.challenge.construction_management_system.model.Worksite;
import session12_polymorphism.challenge.construction_management_system.service.WorksiteService;
import session12_polymorphism.challenge.construction_management_system.service.WorksiteServiceImpl;
import session12_polymorphism.challenge.construction_management_system.simulate_database.WorkerService;
import session12_polymorphism.challenge.construction_management_system.simulate_database.WorkerServiceImpl;

public class ConstructionApp {

    public static void main(String[] args) {
        WorkerService workerService = new WorkerServiceImpl();
        WorksiteService worksiteService = new WorksiteServiceImpl(workerService);
        worksiteService.init();

        Worksite worksite1 = worksiteService.createWorksite("Site 23", "Southpark", "House extension: studio room", 3, 2);
        System.out.println(worksite1);



    }
}
