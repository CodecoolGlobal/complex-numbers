public class WeirdComplexNumberComparator implements ComplexNumberComparator {
    @Override
    public boolean shouldFirstComeFirst(ComplexNumber first, ComplexNumber second) {
        return first.getImg() + first.getReal() < second.getImg() + second.getReal();
    }
}
