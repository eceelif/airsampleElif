package com.project.airsample.elifAir.plane;

import com.project.airsample.elifAir.interfaces.IPlaneList;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component("elifPlanelist")
public abstract class PlaneList implements IPlaneList {
    private ArrayList<Plane> planes = new ArrayList<Plane>();

    public ArrayList<Plane> getPlanes(){
        //todo : get all planes from db;
        return planes;
    }
}
