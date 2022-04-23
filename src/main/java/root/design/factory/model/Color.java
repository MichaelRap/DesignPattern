package root.design.factory.model;

public abstract class Color
{
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Color()
    {
    }

    public Color(String name)
    {
        this.name = name;
    }
}
