package uz.darkor.darkor_22.dto.course.price;

import lombok.*;
import uz.darkor.darkor_22.dto.GenericDTO;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class PriceGetDTO extends GenericDTO {
    private Double price;
    private List<String> offers;

    @Builder
    public PriceGetDTO(@NotNull(message = "code cannot be null") UUID code,
                       Double price,
                       List<String> offers) {
        super(code);
        this.price = price;
        this.offers = offers;
    }
}
