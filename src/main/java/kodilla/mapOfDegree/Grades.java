package kodilla.mapOfDegree;

public class Grades {
    Double mathGrade, itGrade, historyGrade, physicsGrade, avg;

    public Grades(Double mathGrade, Double itGrade, Double historyGrade, Double physicsGrade) {
        this.mathGrade = mathGrade;
        this.itGrade = itGrade;
        this.historyGrade = historyGrade;
        this.physicsGrade = physicsGrade;
    }

    public Double getAverage() {
        return avg = (mathGrade + itGrade + historyGrade + physicsGrade) / 4;
    }

    public Double getMathGrade() {
        return mathGrade;
    }

    public Double getItGrade() {
        return itGrade;
    }

    public Double getHistoryGrade() {
        return historyGrade;
    }

    public Double getPhysicsGrade() {
        return physicsGrade;
    }

    @Override
    public String toString() {
        return "Grades{" +
                "mathGrade=" + mathGrade +
                ", itGrade=" + itGrade +
                ", historyGrade=" + historyGrade +
                ", physicsGrade=" + physicsGrade +
                '}';
    }
}
