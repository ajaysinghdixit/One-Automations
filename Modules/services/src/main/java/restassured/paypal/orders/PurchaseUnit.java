package restassured.paypal.orders;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.Objects;

@Data
@Builder
@Jacksonized
public class PurchaseUnit {
    String reference_id;
    Amount amount;
    Payee payee;
    String soft_descriptor;

    public void setReference_id(String reference_id) {
        this.reference_id = reference_id;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public void setPayee(Payee payee) {
        this.payee = payee;
    }

    public void setSoft_descriptor(String soft_descriptor) {
        this.soft_descriptor = soft_descriptor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PurchaseUnit that)) return false;
        return Objects.equals(getReference_id(), that.getReference_id()) && Objects.equals(getAmount(), that.getAmount()) && Objects.equals(getPayee(), that.getPayee()) && Objects.equals(getSoft_descriptor(), that.getSoft_descriptor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getReference_id(), getAmount(), getPayee(), getSoft_descriptor());
    }

    @Override
    public String toString() {
        return "PurchaseUnit{" +
                "reference_id='" + reference_id + '\'' +
                ", amount=" + amount +
                ", payee=" + payee +
                ", soft_descriptor='" + soft_descriptor + '\'' +
                '}';
    }


}
