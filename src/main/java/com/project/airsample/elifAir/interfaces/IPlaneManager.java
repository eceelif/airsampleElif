package com.project.airsample.elifAir.interfaces;

import com.project.airsample.elifAir.plane.Plane;

import java.util.List;

public interface IPlaneManager {
    Plane getPlaneById(int id);
    List<Plane> getAllPlanes();
    boolean savePlane(Plane plane);
    boolean updatePlane(Plane plane);
    Plane deletePlane(int id);
}
