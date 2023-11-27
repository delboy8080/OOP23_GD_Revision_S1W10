public abstract class Container
{
    String id;
    String contents;

    public Container() {
        id = "-1";
        contents = "empty";
    }

    public Container(String id, String contents) {
        this.id = id;
        this.contents = contents;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public abstract double volume();

}
