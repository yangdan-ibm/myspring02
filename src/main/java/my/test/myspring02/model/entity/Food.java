package my.test.myspring02.model.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table
@Data
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String food_name = "";

    @Column(insertable = false, columnDefinition = "int default 1")
    Integer status = 1;

    @CreatedDate
    @Column(updatable = false, nullable = false)
    Date createTime = new Date();

    @LastModifiedDate
    @Column(nullable = false)
    Date updateTime = new Date();
}
