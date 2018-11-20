package education;

import java.time.LocalDate;

public abstract class Education {

    boolean graduated;
    private final LocalDate enrollmentDate;
    LocalDate graduationDate;
    private final String institutionName;

    public int idDegree;
    public int idPerson;
    public float finalGrade;

    public abstract String getDegree(int idDegree);

    Education(String institution, LocalDate enrollmentDate, LocalDate graduationDate) {
        this.institutionName = institution;
        this.enrollmentDate = enrollmentDate;
        this.graduationDate = graduationDate;
    }

    public Education(String institutionName, LocalDate enrollmentDate, LocalDate graduationDate, int idDegree, int idPerson, float finalGrade) {
        this.enrollmentDate = enrollmentDate;
        this.graduationDate = graduationDate;
        this.institutionName = institutionName;
        this.idDegree = idDegree;
        this.idPerson = idPerson;
        this.finalGrade = finalGrade;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(LocalDate graduationDate) {
        if (graduationDate == null || graduationDate.isBefore(enrollmentDate)) {
            throw new IllegalArgumentException("Graduation date is expected to be after enrollment date.");
        }
        this.graduationDate = graduationDate;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    void gotGraduated() {
        if (graduationDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Graduation date is expected to be a date in the past.");
        }

        graduated = true;
    }
}
