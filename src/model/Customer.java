package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Customer {
    private UUID id;
    private String name;
    private String email;
    private String document;
    private String phone;
    private boolean active;
    private BigDecimal revenue;
    private final LocalDateTime createdAt;

    public Customer(UUID id, String name, String email, String document, String phone, boolean active, BigDecimal revenue, LocalDateTime createdAt) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.document = document;
        this.phone = phone;
        this.active = true;
        this.revenue = revenue;
        this.createdAt = LocalDateTime.now();
    }

    public UUID getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDocument() { return document; }
    public void setDocument(String document) { this.document = document; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    public BigDecimal getRevenue() { return revenue; }
    public void setRevenue(BigDecimal revenue) { this.revenue = revenue; }

    public LocalDateTime getCreatedAt() { return createdAt; }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", document='" + document + '\'' +
                ", phone='" + phone + '\'' +
                ", active=" + active +
                ", revenue=" + revenue +
                ", createdAt=" + createdAt +
                '}';
    }
}
