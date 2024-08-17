package com.project.airsample.controllers.elifFlight;

import com.project.airsample.elifAir.interfaces.IPlane;
import com.project.airsample.elifAir.interfaces.IPlaneBussines;
import com.project.airsample.elifAir.interfaces.IPlaneList;
import com.project.airsample.elifAir.plane.Plane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/elifair/plane")
public class ElifPlaneController {

    private static int counter;

    private IPlane elifPlane;
    private IPlaneList elifPlaneList;
    private IPlaneBussines planeBusiness;

    @Autowired
    public ElifPlaneController(@Qualifier("elifPlane") IPlane elifPlane,
                               @Qualifier("elifPlanelist") IPlaneList elifPlaneList,
                               IPlaneBussines planeBusiness) {
        this.elifPlane = elifPlane;
        this.elifPlaneList = elifPlaneList;
        this.planeBusiness = planeBusiness;
    }

    @GetMapping("/appliedlogic1")
    public boolean appliedLogic1() {
        // İş mantığını burada uygulama
        return planeBusiness.someLogicForPlane(1, "city1");
    }

    @GetMapping("/getcounter")
    public int getCounter(){
        return counter;
    }

    @GetMapping("{id}")
    public Plane getElifPlaneById(@PathVariable int id){
        counter++;
        return elifPlane.getById(id);
    }

    @GetMapping("/all")
    public List<Plane> getAllPlanes(){
        return elifPlane.getAll();
    }

    @PostMapping("/")
    public boolean savePlane(@RequestBody Plane plane){
        return elifPlane.insertDb(plane);
    }

    @PutMapping("/")
    public boolean updatePlane(@RequestBody Plane plane){
        return elifPlane.updateDb(plane);
    }

    @DeleteMapping("/{id}")
    public Plane deletePlane(@PathVariable int id){
        return elifPlane.deleteDb(id);
    }

    public IPlaneList getElifPlaneList() {
        return elifPlaneList;
    }

    public void setElifPlaneList(IPlaneList elifPlaneList) {
        this.elifPlaneList = elifPlaneList;
    }
}
