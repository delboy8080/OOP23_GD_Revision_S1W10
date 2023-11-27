public class Country implements Comparable<Country>
{
    String name;
    int population;
    double area;
    String capital;
    Continent continent;

    public Country() {
        name = "default";
        population = 0;
        area= 0;
        capital = "cap";
        continent = Continent.ASIA;
    }

    public Country(String name, int population, double area, String capital, Continent continent) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.capital = capital;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", capital='" + capital + '\'' +
                ", continent=" + continent +
                '}';
    }

    @Override
    public int compareTo(Country o)
    {
        if(this.population == o.getPopulation())
        {
            if(this.area == o.getArea())
            {
                return o.getName().compareTo(name);
            }
            return (int)(o.getArea() -this.area );
        }
        return o.getPopulation() - this.population;
    }
}
