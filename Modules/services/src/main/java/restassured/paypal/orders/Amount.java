package restassured.paypal.orders;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.Objects;

@Data
@Builder
@Jacksonized
public class Amount {
    String currency_code;
    String value;

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amount amount)) return false;
        return Objects.equals(getCurrency_code(), amount.getCurrency_code()) && Objects.equals(getValue(), amount.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCurrency_code(), getValue());
    }

    @Override
    public String toString() {
        return "Amount{" +
                "currency_code='" + currency_code + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
