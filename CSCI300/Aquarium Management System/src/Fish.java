class Fish {
    private String name;
    private String type;

    public Fish(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public boolean equals(Fish fish) {
        return this.name.equals(fish.name);
    }
    public String toString() {
        return "Name: " + name + ", Type: " + type;
    }
    public Object getType() {
        return null;
    }
}
