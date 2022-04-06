package OOP.Classes;

public class Mayan extends Language {
    public Mayan(String name, int numSpeakers) {
        super(name, numSpeakers, "Central America", "verb-object-subject");
    }

    @Override
    public void getInfo() {
        String info = String.format("%s is spoken by %d people mainly in %s.\nThe language follows the word order: %s.", this.name, this.numSpeakers, this.regionsSpoken, this.wordOrder);
        String infoPlusFact = String.format(info + "\n%s is an ergative language.", this.name);
        System.out.println(infoPlusFact);
    }
}
