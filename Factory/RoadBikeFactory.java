package Factory;

import Products.Frame.Frame;
import Products.Handlebar.Handlebar;
import Products.Wheel.RoadBikeWheel;
import Products.Wheel.Wheel;

public class RoadBikeFactory implements BikeFactory {

    @Override
    public Wheel getWheel() {
        return new RoadBikeWheel();
    }

    @Override
    public Frame getFrame() {
        // Implementation for road bike frame
        return null;
    }

    @Override
    public Handlebar getHandlebar() {
        // Implementation for road bike handlebar
        return null;
    }
}