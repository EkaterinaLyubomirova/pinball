import javax.swing.JFrame;
import javax.swing.JPanel;
public class main {
    public static void main (String[] args) {
        school KatyHS = new school();
        KatyHS.setName("Katy High School");
        KatyHS.setStudentPop(798);
        System.out.println(KatyHS.getStudentPop());
        System.out.println(KatyHS.getName());
        KatyHS.setfavteacher("Mrs.Dube");
        System.out.println(KatyHS.getFavteacher());

    }
}
