package nse.objects;

import processing.core.PVector;

public class NSETransform {

    public PVector position;
    public PVector scale;
    public PVector rotation;

    NSETransform()
    {
        position = new PVector(0,0,0);
        scale = new PVector(0,0,0);
        rotation = new PVector(0,0,0);
    }
}