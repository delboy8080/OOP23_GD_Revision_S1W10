public class Cylindar extends Container
{
    private int radius;
    private int height;

    public Cylindar(String id, String contents,
                    int radius, int height) {
        super(id, contents);
        this.radius = radius;
        this.height = height;
    }

    public double volume()
    {
        return Math.PI * radius *radius * height;
    }

}
