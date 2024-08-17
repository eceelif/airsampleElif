package com.project.airsample.elifAir.managers;

import com.project.airsample.elifAir.interfaces.IPlane;
import com.project.airsample.elifAir.interfaces.IPlaneManager;
import com.project.airsample.elifAir.plane.Plane;

import java.util.List;

public class PlaneManager extends Plane implements IPlaneManager, IPlane {

    @Override
    public Plane getPlaneById(int id) {
        // Implement the logic to get a plane by its ID
        // Here, we're returning a new Plane object for demonstration purposes
        return new Plane() {
            @Override
            public List<Plane> getPlaneByModel(String model) {
                // Return an empty list as a placeholder
                return List.of();
            }
        };
    }

    @Override
    public List<Plane> getAllPlanes() {
        // Implement the logic to get all planes
        // Returning an empty list as a placeholder
        return List.of();
    }

    @Override
    public boolean savePlane(Plane plane) {
        // Implement the logic to save a plane
        // Returning true as a placeholder for success
        return true;
    }

    @Override
    public boolean updatePlane(Plane plane) {
        // Implement the logic to update a plane
        // Returning true as a placeholder for success
        return true;
    }

    @Override
    public Plane deletePlane(int id) {
        // Implement the logic to delete a plane by its ID
        // Returning a new Plane object for demonstration purposes
        return new Plane() {
            @Override
            public List<Plane> getPlaneByModel(String model) {
                // Return an empty list as a placeholder
                return List.of();
            }
        };
    }

    @Override
    public List<Plane> getPlaneByModel(String model) {
        // Implement the logic to get planes by model
        // Returning an empty list as a placeholder
        return List.of();
    }
}
