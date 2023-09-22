package restassured.paypal.orders;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.Objects;

@Data
@Builder
@Jacksonized
public class Payee {
    String email_address;
    String merchant_id;

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public void setMerchant_id(String merchant_id) {
        this.merchant_id = merchant_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payee payee)) return false;
        return Objects.equals(getEmail_address(), payee.getEmail_address()) && Objects.equals(getMerchant_id(), payee.getMerchant_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmail_address(), getMerchant_id());
    }

    @Override
    public String toString() {
        return "Payee{" +
                "email_address='" + email_address + '\'' +
                ", merchant_id='" + merchant_id + '\'' +
                '}';
    }
}
