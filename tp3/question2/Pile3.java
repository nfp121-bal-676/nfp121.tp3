package question2;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Vector;

/**
 * Décrivez votre classe PileVector ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Pile3 implements PileI {

    private Vector<Object> v;
    private int capacite;

    public Pile3() {
         this(PileI.CAPACITE_PAR_DEFAUT);
    }

    public Pile3(int taille) {
        // traiter le cas <=0
        // à compléter
        if (taille <= 0){
            taille = CAPACITE_PAR_DEFAUT;
        }
        v = new Vector<Object>();
        capacite = taille;
    }

    public void empiler(Object o) throws PilePleineException {
        // à compléter
        if(estPleine()){
            throw new PilePleineException();
        }
        v.add(o);
    }

    public Object depiler() throws PileVideException {
        // à compléter
        if (estVide()){
            throw new PileVideException();
        }
        int d = v.lastIndexOf(sommet());    
        return v.remove(d);
    }

    public Object sommet() throws PileVideException {
        // à compléter
        if (estVide())
            throw new PileVideException();
        return v.lastElement();
    }

    public int taille() {
        // à compléter
        return v.size();
    }

    public int capacite() {
        // à compléter
        return capacite;
    }

    public boolean estVide() {
        // à compléter
        return v.isEmpty();
    }

    public boolean estPleine() {
        // à compléter
        return v.size() == capacite;
    }

    public String toString() {
        // à compléter
        String s = "[";
        for (int i = v.size() - 1; i >= 0; i--) {
            s+= v.get(i).toString();
            if(i >0){
                s+= ", ";
            }

        }
        return s + "]";
    }

    public boolean equals(Object o) {
        // à compléter
        if(this == o){
            return true;
        }
        if(!(o instanceof Pile3)){
            return false;
        }
        Pile3 p = (Pile3) o;
        if(taille() == p.taille()){
            if(capacite() == p.capacite()){
               boolean isEqual = false; 
               for (int i = v.size() - 1; i >= 0; i--) {
                    Object temp = v.get(i);
                    boolean exists = false;
                    for(int j = v.size() - 1; j >= 0; j--){
                        if((temp == p.v.get(i))){
                               exists = true;
                        }
                    }
                    if(exists){
                        isEqual = true;
                    } else{
                        return false;
                    }
                   
               }
                return true;
            }
                
        }
        return false;
    }

    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }

}
