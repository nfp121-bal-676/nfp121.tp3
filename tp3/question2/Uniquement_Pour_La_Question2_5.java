package question2;

public class Uniquement_Pour_La_Question2_5 extends junit.framework.TestCase{
    public void test_equals_question2_5() throws Exception{
        // sÃ©lection de la zone commentÃ©e ci-dessous, puis F7 sous bluej, si vous adoptez la mÃ©thode equals de Q2.5
            PileI p  = new Pile(4);
            PileI p1 = new Pile(6);
            PileI p2 = new Pile2(6);
            PileI p3 = new Pile3(6);
            PileI p4 = new Pile4(6);
    
            // assertFalse(p.equals(p1));
            // assertTrue(p1.equals(p2) && p2.equals(p1)); // etc ...
            // assertTrue(p1.equals(p2) && p2.equals(p3) && p1.equals(p3));
            // assertTrue(p2.equals(p3) && p3.equals(p4) && p2.equals(p4));
            
            // p1.empiler(3);p1.empiler(33);p2.empiler(3);p2.empiler(33);p3.empiler(3);p3.empiler(33);p4.empiler(3);p4.empiler(33);
            // assertTrue(p1.equals(p2) && p2.equals(p1)); // etc ...
            // assertTrue(p1.equals(p2) && p2.equals(p3) && p1.equals(p3));
            // assertTrue(p2.equals(p3) && p3.equals(p4) && p2.equals(p4));
    
            // p1.empiler(4);p1.empiler(44);p2.empiler(4);p2.empiler(44);
            // assertTrue(p1.equals(p2) && p2.equals(p1)); // etc ...
            // assertTrue(p1.equals(p2) && !p2.equals(p3) && !p1.equals(p3));
            // assertTrue(!p2.equals(p3) && p3.equals(p4) && !p2.equals(p4));
    
            // p3.empiler(4);p3.empiler(44);p4.empiler(4);p4.empiler(44);
            // assertTrue(p1.equals(p2) && p2.equals(p1)); // etc ...
            // assertTrue(p1.equals(p2) && p2.equals(p3) && p1.equals(p3));
            // assertTrue(p2.equals(p3) && p3.equals(p4) && p2.equals(p4));
    
            // p1.depiler();p2.depiler();
            // assertTrue(p1.equals(p2) && p2.equals(p1)); // etc ...
            // assertTrue(p1.equals(p2) && !p2.equals(p3) && !p1.equals(p3));
            // assertTrue(!p2.equals(p3) && p3.equals(p4) && !p2.equals(p4));
    
            // p3.depiler();p4.depiler();
            // assertTrue(p1.equals(p2) && p2.equals(p1)); // etc ...
            // assertTrue(p1.equals(p2) && p2.equals(p3) && p1.equals(p3));
            // assertTrue(p2.equals(p3) && p3.equals(p4) && p2.equals(p4));
    
            // p1.depiler();p2.depiler();p3.depiler();p4.depiler();
        // assertTrue(p1.equals(p2) && p2.equals(p1)); // etc ...
        // assertTrue(p1.equals(p2) && p2.equals(p3) && p1.equals(p3));
        // assertTrue(p2.equals(p3) && p3.equals(p4) && p2.equals(p4));
        
        
        
        
    // public boolean equals(Object o) {
    // if (o instanceof PileI) {
      // PileI p = (PileI) o;
      // return this.capacite() == p.capacite()
          // && this.hashCode() == p.hashCode();
    // } else
      // return false;
    // }
   // la première réponse est correcte si vous ne souhaitez pas tester le type de l'objet
 
    // La règle à retenir est : 
    // Deux piles sont égales si elles ont la même taille, même capacité, et les éléments contenus identiques.
 
    // l'autre réponse n'est pas correcte

    // public boolean equals(Object o) {
        // return this.toString().equals(o.toString());
    // }

// Nous testons uniquement l'égalité de la sortie de la méthode tostring.
// Nous ne testons pas la taille, la capacité ou le type de l'objet.
     
        
    }
}
