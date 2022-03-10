package Exception_Tasks;

public class Numbr_ForMt_Exception {


    public static void main(String[] args) {
        String str = "Manzar";
        try {
            int nunb = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Cant be done");
        }
    }
}
