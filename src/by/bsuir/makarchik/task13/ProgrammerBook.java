package by.bsuir.makarchik.task13;

import by.bsuir.makarchik.task12.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        else
            if(obj instanceof ProgrammerBook)
                return this.language.equals(((ProgrammerBook) obj).language) && this.level == ((ProgrammerBook) obj).level;
            else
                return false;
    }

    @Override
    public String toString(){
        return "ProgrammerBook: " + this.language + " " + this.level;
    }

    @Override
    public int hashCode(){
        return Objects.hash(language, level);
    }
}
