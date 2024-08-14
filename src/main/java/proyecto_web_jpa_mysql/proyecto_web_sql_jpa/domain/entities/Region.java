package proyecto_web_jpa_mysql.proyecto_web_sql_jpa.domain.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "regions")
public class Region {
    @Id
    @Column (columnDefinition = "VARCHAR(5)", nullable = false)
    private String codereg;

    @Column (columnDefinition = "VARCHAR(50)", nullable = true)
    private String namereg;

    @ManyToOne
    @JoinColumn(name = "codecountry")
    private Country countries;

    public Region(){
    }
    public String getCodereg() {
        return codereg;
    }

    public void setCodereg(String codereg) {
        this.codereg = codereg;
    }

    public String getNamereg() {
        return namereg;
    }

    public void setNamereg(String namereg) {
        this.namereg = namereg;
    }
    
}
