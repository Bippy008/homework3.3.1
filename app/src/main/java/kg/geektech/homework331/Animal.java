package kg.geektech.homework331;

public class Animal {
    private String animalText;
    private String animalURL;

    public Animal(String animalText, String animalURL) {
        this.animalText = animalText;
        this.animalURL = animalURL;
    }

    public String getAnimalText() {
        return animalText;
    }

    public void setAnimalText(String animalText) {
        this.animalText = animalText;
    }

    public String getAnimalURL() {
        return animalURL;
    }

    public void setAnimalURL(String animalURL) {
        this.animalURL = animalURL;
    }
}
