public class Vertebrates {

    private String name;
    private String species;
    private FeaturesEnum featuresEnum;


    public Vertebrates(String name, String species, FeaturesEnum featuresEnum ) {
        this.name = name ;
        this.species = species;
        this.featuresEnum = featuresEnum ;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public FeaturesEnum getFeaturesEnum () {
        return featuresEnum ;
    }

    @Override
    public String toString() {
        return "Vertebrates{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", featuresEnum=" + featuresEnum +
                '}';
    }
}

