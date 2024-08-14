package proyecto_web_jpa_mysql.proyecto_web_sql_jpa.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @Column (columnDefinition = "VARCHAR(5)", nullable = false)
    private String codecountry;

    @Column (columnDefinition = "VARCHAR(50)", nullable = true)
    private String namecountry;

    public String getCodecountry() {
        return codecountry;
    }

    public void setCodecountry(String codecountry) {
        this.codecountry = codecountry;
    }

    public String getNamecountry() {
        return namecountry;
    }

    public void setNamecountry(String namecountry) {
        this.namecountry = namecountry;
    }

    @Override
    public String toString() {
        return "Country{" +
                "codecountry='" + codecountry + '\'' +
                ", namecountry='" + namecountry + '\'' +
                '}';
    }

}
