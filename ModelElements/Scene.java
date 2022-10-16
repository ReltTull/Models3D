package Models3D.ModelElements;

import Models3D.ModelElements.PoligonalModelStaff.PoligonalModel;

import java.lang.reflect.Type;

public class Scene
{
    public int id;
    public PoligonalModel model;
    public Flash flash;

    public Type method1 (Type input) {
        return input;
    }

    public Scene(int id, PoligonalModel model, Flash flash) {
        this.id = id;
        this.model = model;
        this.flash = flash;
    }

    public Type method2 (Type input1, Type input2) {
        return input1;
    }
}
