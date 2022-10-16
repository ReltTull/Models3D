package Models3D.ModelElements;

import Models3D.Plugs.Angle3D;
import Models3D.Plugs.Point3D;
import java.awt.*;

public class Flash {
    public Point3D Location;
    public Angle3D angle;
    public Color color;
    public Flash power;

    public void rotate(Angle3D input) {
    }

    public Flash(Point3D location, Angle3D angle, Color color, Flash power) {
        Location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public void move(Point3D input) {
    }
}
