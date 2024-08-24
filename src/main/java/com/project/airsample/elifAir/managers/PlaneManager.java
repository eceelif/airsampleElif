package com.project.airsample.elifAir.managers;

import com.project.airsample.elifAir.interfaces.IPlane;
import com.project.airsample.elifAir.interfaces.IPlaneManager;
import com.project.airsample.elifAir.plane.Plane;

import java.util.List;

public class PlaneManager implements IPlaneManager, IPlane {

    @Override
    public Plane getPlaneById(int id) {
        // Implement the logic to get a plane by its ID
        return new Plane(); // Returning a new Plane object for demonstration purposes
    }

    @Override
    public List<Plane> getAllPlanes() {
        // Implement the logic to get all planes
        return List.of(); // Returning an empty list as a placeholder
    }

    @Override
    public boolean savePlane(Plane plane) {
        // Implement the logic to save a plane
        return true; // Returning true as a placeholder for success
    }

    @Override
    public boolean updatePlane(Plane plane) {
        // Implement the logic to update a plane
        return true; // Returning true as a placeholder for success
    }

    @Override
    public Plane deletePlane(int id) {
        // Implement the logic to delete a plane by its ID
        return new Plane(); // Returning a new Plane object for demonstration purposes
    }

    @Override
    public Plane getById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public boolean insertDb(Plane plane) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertDb'");
    }

    @Override
    public boolean updateDb(Plane plane) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateDb'");
    }

    @Override
    public Plane deleteDb(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteDb'");
    }

    @Override
    public List<Plane> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
}
