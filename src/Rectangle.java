public class Rectangle extends Container
{
    private int w, h, l;

    public Rectangle(String id, String contents, int w, int h, int l) {
        super(id, contents);
        this.w = w;
        this.h = h;
        this.l = l;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    @Override
    public double volume() {
        return w*l*h;
    }

    @Override
    public String printDimensions()
    {
        return "Width: " + w +"; Height:"+h+";"
                +" Length:"+l+";";
    }
}
