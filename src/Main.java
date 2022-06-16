import java.io.CharConversionException;

public class Main {
    public static void main(String[] args) {
        Character dk = new Character("Dark Night", "DK", 150, new Point(150));
        Character dw = new Character("Dark Wizard", "DW", 150, new Point(150));
        Character mg = new Character("Magic Gladiator", "MG", 170, new Point(170));
        Character dl = new Character("Dark Lord", "DL", 190, new Point(190));
        Character ef = new Character("Fairy Elf", "EF", 180, new Point(180));


        System.out.println(dk);
        System.out.println(dw);
        System.out.println(mg);
        System.out.println(dl);
        System.out.println(ef);


    }
}
