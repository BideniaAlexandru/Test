import java.io.IOException;
import java.util.ArrayList;

public interface Elements {


    void print() throws IOException;

    void accept(Visitor visitor);
}