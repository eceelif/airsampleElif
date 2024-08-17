package com.project.airsample.elifAir.bussines;

import com.project.airsample.elifAir.plane.Plane;
import com.project.airsample.elifAir.interfaces.IPlane;
import com.project.airsample.elifAir.interfaces.IPlaneBussines;
import com.project.airsample.elifAir.interfaces.IPlaneList;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlaneBusiness implements IPlaneBussines {

    private final IPlane plane;
    private final IPlaneList planeList;

    public PlaneBusiness(@Qualifier("elifPlane") IPlane plane, @Qualifier("elifPlanelist") IPlaneList planeList) {
        this.plane = plane;
        this.planeList = planeList;
    }

    @Override
    public boolean someLogicForPlane(int id, String city) {
        // TODO: Apply specific logic
        return true;
    }

    @Override
    public boolean someOtherPlaneLogic(int id, String city) {
        // TODO: Apply additional logic
        // Example: Retrieve and update plane information based on some criteria
        List<Plane> planes = planeList.getPlanesByCity(city);
        // TODO: Loop through the planes and apply necessary updates
        for (Plane p : planes) {
            // Example logic
            p.setCity(city);
            plane.updateDb(p);
        }
        return true;
    }

    @Override
    public boolean yetAnotherPlaneLogic(int id, String city) {
        // TODO: Apply more specific logic
        return true;
    }
}
