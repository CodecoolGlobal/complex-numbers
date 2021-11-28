public class DefaultComplexNumberComparator implements ComplexNumberComparator {

    @Override
    public boolean shouldFirstComeFirst(ComplexNumber first, ComplexNumber second) {
        return first.getImg() < second.getImg() || first.getReal() < second.getReal();
    }
}
