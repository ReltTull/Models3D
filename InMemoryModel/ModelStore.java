package Models3D.InMemoryModel;

import Models3D.ModelElements.Camera;
import Models3D.ModelElements.Flash;
import Models3D.ModelElements.PoligonalModelStaff.PoligonalModel;
import Models3D.ModelElements.Scene;

public class ModelStore
{
    public PoligonalModel model;
    public Scene scene;
    public Flash flash;
    public Camera camera;

    public Scene getScene (int value)
    {
        Scene scn = new Scene();
        return scn;
    }
}
