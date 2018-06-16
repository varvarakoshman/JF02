package task6;

import lombok.AllArgsConstructor;
import task7.NuclearSub;

@AllArgsConstructor
@NuclearSub(value = "i'm denuclearised")
public class NuclearSubmarine {
    private int submarine_number;

    class EngineOfNuclearSubmarine{
        public void go(){
            System.out.println("engine starts");
        }
        public void getAn(){
            NuclearSub nuc = NuclearSubmarine.class.getDeclaredAnnotation(NuclearSub.class);
            System.out.println(nuc.value());
        }
    }

}
