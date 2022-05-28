package modul_07_stream_czyli_funkcyjna_iteracja_po_kolekcjach.sekcja_71_wstep_do_programowania_funkcyjnego_czyli_wyrazenia_lambda;

import static com.createdbyjurand.shared.display.Display.displaySubtitle;
import static com.createdbyjurand.shared.display.Display.displayTitle;

import com.createdbyjurand.shared.ansi_color.AnsiColor;
import com.kodilla.stream.lambda.Executor;

public class WstepDoProgramowaniaFunkcyjnegoCzyliWyrazeniaLambda {

    public static void main(String[] args) throws Exception {
        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("7. Stream, czyli funkcyjna iteracja po kolekcjach", AnsiColor.RED);

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Wyzwania:");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("7.1. Wstęp do programowania funkcyjnego, czyli wyrażenia lambda");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Przygotowanie środowiska");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Podejście obiektowe");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Podejście funkcyjne - wyrażenia lambda");

        /*

        codeToExecute = public void process() {
            System.out.println("This is an example text.");
        }

        codeToExecute = void () {
            System.out.println("This is an example text.");
        }

        codeToExecute = () {
            System.out.println("This is an example text.");
        }

        codeToExecute = () -> {
            System.out.println("This is an example text.");
        }

        codeToExecute = () -> System.out.println("This is an example text.");

        */

        Executor codeToExecute = () -> System.out.println("This is an example text.");
        //codeToExecute
    }
}
