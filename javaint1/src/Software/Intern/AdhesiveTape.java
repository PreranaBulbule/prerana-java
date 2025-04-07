package Software.Intern;

public class AdhesiveTape extends Tape {
    public AdhesiveTape() {

        System.out.println("No-args constructor of AdhesiveTape");}
        @Override
        public void stick() {
            System.out.println("Applying adhesive tape for secure bonding");
        }
        @Override
        public void cut() {
            System.out.println("Using scissors to cut adhesive tape neatly");
        }
        @Override
        public void remove() {
            System.out.println("Peeling off adhesive tape without leaving residue");
        }
        @Override
        public void store(){
        System.out.println("Keeping adhesive tape in a cool and dry place");
    }
}