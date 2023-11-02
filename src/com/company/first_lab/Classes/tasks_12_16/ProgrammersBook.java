package com.company.first_lab.Classes.tasks_12_16;
import java.util.Objects;

public class ProgrammersBook extends Book{
    private String language;
    private int level;

    @Override
    public boolean equals(Object o) {
        boolean res = true;
        if (this == o)
            res=true;
        else{
            if (o == null || getClass() != o.getClass())
                res = false;
            if ((res)&&(!super.equals(o)))
                res = false;

            if(res){
                ProgrammersBook that = (ProgrammersBook) o;
                res = ((level == (that.level)) && (Objects.equals(language, that.language)));
            }
        }
        return res;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }

    @Override
    public String toString() {
        return "ProgrammerBook additional information:\n" +
                "language:" + language + "|level:" + level +
                '\n';
    }
}
