package acc.br.summerAcademy.dtos;

import java.math.BigDecimal;

import acc.br.summerAcademy.domain.TypeOfStatus;
import java.time.LocalDateTime;

public class OrderCreatedEvent {
    private Long OrderId;
    private BigDecimal value;
    private String productName;
    private String description;
    private Integer quantity;
    private TypeOfStatus status;
    private LocalDateTime dateTimeDeparture;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long seller_id;

    public OrderCreatedEvent(Long orderId, BigDecimal value, String productName, String description, Integer quantity, TypeOfStatus status, LocalDateTime dateTimeDeparture, LocalDateTime createdAt, LocalDateTime updatedAt, Long seller_id) {
        OrderId = orderId;
        this.value = value;
        this.productName = productName;
        this.description = description;
        this.quantity = quantity;
        this.status = status;
        this.dateTimeDeparture = dateTimeDeparture;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.seller_id = seller_id;
    }

    public Long getOrderId() {
        return OrderId;
    }

    public void setOrderId(Long orderId) {
        OrderId = orderId;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public TypeOfStatus getStatus() {
        return status;
    }

    public void setStatus(TypeOfStatus status) {
        this.status = status;
    }

    public LocalDateTime getDateTimeDeparture() {
        return dateTimeDeparture;
    }

    public void setDateTimeDeparture(LocalDateTime dateTimeDeparture) {
        this.dateTimeDeparture = dateTimeDeparture;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(Long seller_id) {
        this.seller_id = seller_id;
    }

    @Override
    public String toString() {
        return "OrderCreatedEvent{" +
                "OrderId=" + OrderId +
                ", value=" + value +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", status=" + status +
                ", dateTimeDeparture=" + dateTimeDeparture +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", seller_id=" + seller_id +
                '}';
    }
}