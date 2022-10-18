package Models3D.ModelElements.PoligonalModelStaff;

public class PoligonalModel
{
    public Poligon poligon;
    public Texture texture;

    public PoligonalModel(Poligon poligon)
    { // конструктор
        this.poligon = poligon;
        this.texture = new Texture();
    }
}
