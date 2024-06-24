package acme.reajuste;

import java.math.BigDecimal;
import java.util.Optional;

public interface Reajuste {
    Optional<BigDecimal> novoSalario(Double porcentage);
}
