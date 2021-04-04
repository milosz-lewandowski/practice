package pl.miloszlewandowski;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "customer_order")
class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;
    private Status status;


    public CustomerOrder(String description, Status status) {

        this.description = description;
        this.status = status;
    }

    public CustomerOrder() {

    }

    public Long getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof CustomerOrder))
            return false;
        CustomerOrder customerorder = (CustomerOrder) o;
        return Objects.equals(this.id, customerorder.id) && Objects.equals(this.description, customerorder.description)
                && this.status == customerorder.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.description, this.status);
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + this.id + ", description='" + this.description + '\'' + ", status=" + this.status + '}';
    }
}
