package com.project.airsample.elifAir.interfaces;

import com.project.airsample.elifAir.plane.Plane;

import java.util.ArrayList;
import java.util.List;

public interface IPlaneList {
    ArrayList<Plane> getPlanes();


    List<Plane> getPlanesByCity(String city);
}
