package Models3D.InMemoryModel;

import Models3D.ModelElements.Camera;
import Models3D.ModelElements.Flash;
import Models3D.ModelElements.PoligonalModelStaff.Poligon;
import Models3D.ModelElements.PoligonalModelStaff.PoligonalModel;
import Models3D.ModelElements.Scene;
import Models3D.Plugs.Angle3D;
import Models3D.Plugs.Point3D;
import java.util.ArrayList;

public class ModelStore
{
    public ArrayList<PoligonalModel> models = new ArrayList<>();
    public ArrayList<Scene> scenes = new ArrayList<>();
    public ArrayList<Flash> flashes = new ArrayList<>();
    public ArrayList<Camera> cameras = new ArrayList<>();
    private ArrayList<IModelChangedObserver> changedObservers = new ArrayList<>();

    public ModelStore(Poligon poligon)
    {
        this.models.add(new PoligonalModel(poligon));
        this.scenes.add(new Scene<>(0, models.get(0), cameras.get(0)));
        this.flashes.add(new Flash());
        this.cameras.add(new Camera(new Point3D(), new Angle3D()));
    }

    public void notifyChange (IModelChanger sender) {
    }

    public Scene getScene (int value)
    {
        return new Scene(value, models.get(value), cameras.get(value));
    }
}
