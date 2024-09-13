package geoPoliticalZones;

public class GeoPoliticalZones {
    public enum States {
        NORTH_EAST("Adamawa, Bauchi, Borno, Gombe, Taraba, Yobe"),
        NORTH_WEST("Kano, Kaduna, Sokoto, Katsina, Jigawa, Zamfara"),
        NORTH_CENTRAL("Benue, Nasarawa, Plateau, Kwara, Niger, Kogi, Federal Capital Territory"),
        SOUTH_SOUTH("Rivers, Edo, Delta, Cross River, Bayelsa, Akwa Ibom"),
        SOUTH_EAST("Imo, Enugu, Anambara, Abia, Ebonyi "),
        SOUTH_WEST("Lagos, Ekiti, Ogun, Ondo, Osun, Oyo");




        private final String description;
        private States(String description) {
            this.description = description;
        }
    }
}
