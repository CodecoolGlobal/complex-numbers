import java.util.ArrayList;
import java.util.List;

public class BubbleSort implements Sorter {
    public List<ComplexNumber> sort(List<ComplexNumber> listOfNumbers, ComplexNumberComparator comparator) {
        List<ComplexNumber> numbersCopy = new ArrayList<>(listOfNumbers);
        boolean sorted = false;
        while (!sorted) {
            sorted = true;

            for (int i = 0; i < numbersCopy.size() - 1; i++) {
                final ComplexNumber first = numbersCopy.get(i);
                final ComplexNumber second = numbersCopy.get(i + 1);
                if (comparator.shouldFirstComeFirst(first, second)) {
                    ComplexNumber temp = numbersCopy.get(i + 1);
                    numbersCopy.set(i + 1, numbersCopy.get(i));
                    numbersCopy.set(i, temp);
                    sorted = false;
                }
            }
        }
        return numbersCopy;
    }
}
