package proj;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "endereco")
@Entity
public class Endereco {
    @Id
    @Column(name = "cep", nullable = false, length = 8)
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}