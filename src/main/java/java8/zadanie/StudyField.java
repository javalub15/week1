package java8.zadanie;

public enum StudyField {
    MATEMATYKA(3.0), INFORMATYKA(3.5), FILOZOFIA(4.0);

    private double minAverageGradeRequired;

    StudyField(double minAverageGradeRequired) {
        this.minAverageGradeRequired = minAverageGradeRequired;
    }

    public double getMinAverageGradeRequired() {
        return minAverageGradeRequired;
    }
}
