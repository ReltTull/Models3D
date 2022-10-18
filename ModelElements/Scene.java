package Models3D.ModelElements;

import Models3D.ModelElements.PoligonalModelStaff.PoligonalModel;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Scene<Type1, Type2> {
    public int id;
    public ArrayList<PoligonalModel> models = new ArrayList<>();
    public ArrayList<Flash> flashes = new ArrayList<>();
    public ArrayList<Camera> cameras = new ArrayList<>();


    public Scene(int id, PoligonalModel models, Camera cameras) {
        this.id = id;
        this.models.add(models);
        this.cameras.add(cameras);
    }

    public Type1 method1(Type1 input)
    {
        return input;
    }

    public Type1 method2(Type1 input1, Type2 input2)
    {
        return input1;
    }
}
