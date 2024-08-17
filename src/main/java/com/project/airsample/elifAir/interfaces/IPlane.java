package com.project.airsample.elifAir.interfaces;

import com.project.airsample.elifAir.plane.Plane;

import java.util.List;

public interface IPlane {
    Plane getById(int id);

    boolean insertDb(Plane plane);

    boolean updateDb(Plane plane);

    Plane deleteDb(int id);

    List<Plane> getAll();
}
