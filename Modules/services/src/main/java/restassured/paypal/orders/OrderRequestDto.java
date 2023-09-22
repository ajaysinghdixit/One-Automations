package restassured.paypal.orders;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

import java.util.List;
import java.util.Objects;

@Getter
@Data
@Builder
@Jacksonized
public class OrderRequestDto {
    String intent;
    List<PurchaseUnit> purchaseUnits;

    public OrderRequestDto setIntent(String intent) {
        this.intent = intent;
        return this;
    }

    public OrderRequestDto setPurchaseUnits (List<PurchaseUnit> purchaseUnits) {
        this.purchaseUnits = purchaseUnits;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderRequestDto that)) return false;
        return Objects.equals(getIntent(), that.getIntent()) && Objects.equals(getPurchaseUnits(), that.getPurchaseUnits());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIntent(), getPurchaseUnits());
    }

    @Override
    public String toString() {
        return "OrderRequestDto{" +
                "intent='" + intent + '\'' +
                ", purchaseUnits=" + purchaseUnits +
                '}';
    }

}
