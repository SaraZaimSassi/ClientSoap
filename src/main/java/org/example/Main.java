package org.example;

<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> 48c9707 (first commit)
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
=======

        stub.EtudiantWService wsdl= new stub.ServiceWeb().getEtudiantWServicePort();
        List<stub.Student> liste=wsdl.listStudents();
        liste.forEach(elm->{System.out.println(elm.getNom()
                +"----"+elm.getPrenom());});
>>>>>>> 48c9707 (first commit)
    }
}