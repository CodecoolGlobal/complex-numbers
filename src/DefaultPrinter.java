import java.util.List;

public class DefaultPrinter implements Printer {
    @Override
    public void printList(List<ComplexNumber> listOfNumbers) {
        for (int i = 0; i < listOfNumbers.size(); i++) {
            System.out.println("NUMBER " + (i + 1) + "is: Img:" + listOfNumbers.get((i)).getImg() + ", real: " + listOfNumbers.get((i)).getReal());
        }
    }
}
