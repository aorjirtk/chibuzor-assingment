package IdeaProjects.techblazers.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import petrol.PetrolPurchase;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetrolPurchaseTest {
    PetrolPurchase petrolPurchase = new PetrolPurchase("Mushin", "Dark", 43, 500, 200);
@BeforeEach
    @Test
    public void testThatPetrolPurchasedHasType() {
        assertEquals("Dark", petrolPurchase.getPetrolType());
    }
    @Test
    public void testThatPetrolPurchasedHasPetrolPrice() {

        assertEquals(500, petrolPurchase.getPrice());
    }
    @Test
    public void testThatPetrolPurchasedHasPetrolLocation() {
        assertEquals("Mushin", petrolPurchase.getLocation());
    }
    @Test
    public void testThatPetrolPurchasedHasPetrolPurchasedAmount() {
        assertEquals(21300, petrolPurchase.getPurchasePrice());
    }
}
