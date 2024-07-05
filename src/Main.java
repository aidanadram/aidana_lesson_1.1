public class Main {
    public static void main(String[] args) {

       Mammals mammals = new Mammals("Rex", "dog", FeaturesEnum.backbone, 6);


       Humans humans1 = new Humans("Amina", "humans", FeaturesEnum.sexualReproduction,
               74, "Playing, Swimming" );


       Humans humans2 = new Humans("Adil", "human", FeaturesEnum.endoskeleton, 19,
               "Cooking, reading");



        System.out.println(mammals);

        mammals.consumerType();
        mammals.consumerType("Carnivore");
        mammals.finalConsumerType("Omnivore");

        System.out.println("--------------------------");

        System.out.println(humans1);

        humans1.consumerType();
        humans1.consumerType("Herbivore");
        humans1.finalConsumerType("Herbivore");

        System.out.println("--------------------------");


        System.out.println(humans2);

        humans2.consumerType();
        humans2.consumerType("Omnivore");
        humans2.finalConsumerType("Omnivore");

    }


}