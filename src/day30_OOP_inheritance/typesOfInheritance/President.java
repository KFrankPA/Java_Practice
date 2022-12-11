package day30_OOP_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class President extends Person{

    private LocalDate electedDate;

    public President(String name, char gender, LocalDate DOB, LocalDate electedDate) {
        super(name, gender, DOB);
        setElectedDate(electedDate);
    }

    public LocalDate getElectedDate() {
        return electedDate;
    }

    public void setElectedDate(LocalDate electedDate) {
        this.electedDate = electedDate;
    }
}
