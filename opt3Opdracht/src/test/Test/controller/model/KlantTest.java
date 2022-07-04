package controller.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class KlantTest {

@Test
public void setTeBetalenTest(){
    Klant klant = new Klant("a","a","a","a","a");
    klant.setLessen(new KlarinetLes(klant, "Klarinetles", "a", "a"));
    assertEquals(40, klant.getBedragTeBetalen());

}

@Test
public void klantLessenTest(){
    Klant klant = new Klant("a","a","a","a","a");
    ArrayList<Les> kaas = new ArrayList<>();
    Les kLes = new KlarinetLes(klant, "Klarinetles", "a", "a");
    Les pLes = new PianoLes(klant, "Pianoles", "a", "a");
    Les dLes = new DirigentLes(klant, "Dirigentles", "a", "a");

    kaas.add(kLes);
    kaas.add(pLes);
    kaas.add(dLes);
    klant.setLessen(kLes);
    klant.setLessen(pLes);
    klant.setLessen(dLes);

    assertArrayEquals(klant.getLessen().toArray(), kaas.toArray());
    assertEquals(klant.getLessen().get(0).getLesType(), kaas.get(0).getLesType());
}


}