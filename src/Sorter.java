import java.util.List;

public interface Sorter {
    List<ComplexNumber> sort(List<ComplexNumber> listOfNumbers, ComplexNumberComparator comparator);
}
