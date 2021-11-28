import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ComplexNumber complexnumberObj = new ComplexNumber(3, 2);
        ComplexNumber complexnumberObj2 = new ComplexNumber(5, 2);
        ComplexNumber complexnumberObj3 = new ComplexNumber(1, 5);

        List<ComplexNumber> listOfNumbers = new ArrayList<>();

        listOfNumbers.add(complexnumberObj);
        listOfNumbers.add(complexnumberObj2);
        listOfNumbers.add(complexnumberObj3);

        //sort by the rules
        Sorter sorter = new BubbleSort();
        List<ComplexNumber> sorted = sorter.sort(listOfNumbers, new DefaultComplexNumberComparator());
        List<ComplexNumber> sorted2 = sorter.sort(listOfNumbers, new WeirdComplexNumberComparator());

        Printer printer = new EmailPrinter();
        printer.printList(sorted);
    }
}
