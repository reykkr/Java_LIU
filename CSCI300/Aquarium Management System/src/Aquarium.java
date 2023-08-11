class Aquarium {
    private double length;
    private double width;
    private double height;
    private Fish[] fishes;
    private int size;
    private int fishCount;

    public Aquarium(double length, double width, double height, int size) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.size = size;
        fishes = new Fish[size];
        fishCount = 0;
    }

    public int getFishCount() {
        return fishCount;
    }

    public Fish getFish(int i) {
        if (i >= 0 && i < fishCount) {
            return fishes[i];
        }
        return null;
    }

    public boolean addFish(Fish fish) {
        if (fishCount >= size) {
            System.out.println("Aquarium is full!");
            return false;
        }
        
        for (int i = 0; i < fishCount; i++) {
            if (fishes[i].equals(fish)) {
                System.out.println("Fish with the same name already exists!");
                return false;
            }
        }

        fishes[fishCount] = fish;
        fishCount++;
        return true;
    }

    public boolean searchFish(String name, String type) {
        for (int i = 0; i < fishCount; i++) {
            if (fishes[i].getName().equals(name) && fishes[i].getType().equals(type)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Aquarium Information:\n");
        result.append("Length: ").append(length).append(", Width: ").append(width).append(", Height: ").append(height).append("\n");
        result.append("Fishes:\n");
        for (int i = 0; i < fishCount; i++) {
            result.append(fishes[i]).append("\n");
        }
        return result.toString();
    }
}
