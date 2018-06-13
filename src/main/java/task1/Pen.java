package task1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pen {
    private String producerName;
    private String inkColour;
    private int price;
}
