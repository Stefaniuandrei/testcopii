abstract class Student {
    abstract void sustineExamen();
}

class PhdStudent extends Student {
    @Override
    void sustineExamen() {
        System.out.println("Examenul se desfasoara prin prezentare finala.");
    }
}

class GradStudent extends Student {
    @Override
    void sustineExamen() {
        System.out.println("Examenul se desfasoara scris.");
    }
}