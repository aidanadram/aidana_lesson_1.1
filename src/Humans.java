import java.util.Arrays;

final class Humans extends Mammals {

    private String[] activities;

    public Humans(String name, String species, FeaturesEnum featuresEnum,
                  int averageAge, String activities ) {
        super(name, species, featuresEnum, averageAge);
        this.activities = new String[]{activities};
    }

    public String[] getActivities() {
        return activities;
    }

    public void consumerType () {
        System.out.println("Omnivore");

    }

    @Override
    public String toString() {
        return super.toString() + "Activities: " +  Arrays.toString(activities);
    }

}
