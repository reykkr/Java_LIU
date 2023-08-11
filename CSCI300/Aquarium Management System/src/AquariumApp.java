public class AquariumApp {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium(10.0, 8.0, 6.0, 5);

        aquarium.addFish(new Fish("Goldfish", "Freshwater"));
        aquarium.addFish(new Fish("Clownfish", "Saltwater"));
        aquarium.addFish(new Fish("Betta", "Freshwater"));
        aquarium.addFish(new Fish("Guppy", "Freshwater"));

        String name = "Betta";
        String type = "Freshwater";

        boolean fishExists = aquarium.searchFish(name, type);
        if (fishExists) {
            System.out.println(name + " of type " + type + " exists in the aquarium.");
        } else {
            System.out.println(name + " of type " + type + " does not exist in the aquarium.");
        }

        int index = 3;
        Fish fishAtIndex = aquarium.getFish(index);
        if (fishAtIndex != null) {
            System.out.println("Fish at index " + index + ": " + fishAtIndex);
        } else {
            System.out.println("No fish found at index " + index);
        }

        System.out.println(aquarium);
    }
}
