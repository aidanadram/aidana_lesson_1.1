public class Mammals extends Vertebrates {

    private int age;


    public Mammals(String name, String species, FeaturesEnum featuresEnum, int age ) {
        super(name, species, featuresEnum);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void consumerType(){
        System.out.println("Herbivore");

    }

    public void consumerType(String consume ) {
        System.out.println(consume);
    }
    public final void finalConsumerType (String consume) {
        System.out.println(consume);

    }

    @Override
    public String toString() {
        return super.toString() + "Age = " + age ;
    }
}

