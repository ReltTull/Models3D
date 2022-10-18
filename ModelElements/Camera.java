package Models3D.ModelElements;

import Models3D.Plugs.Angle3D;
import Models3D.Plugs.Point3D;

public class Camera
{
    public Point3D location;
    public Angle3D angle;

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public void rotate(Angle3D input)
    { // вращение камеры
    }

    public void move(Point3D input)
    { // перемещение камеры
    }
}
