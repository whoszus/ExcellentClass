package com.whoszus.model.FirstModel.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2015/10/29.
 */

@Table(name = "classCatcher")
@Entity
public class ClassCatcher {
    private String uuid;
    private String name;
    private String tel;
    private String cls;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uuid", nullable = false, length = 100)
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Column(name = "name", length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "tel", length = 11)
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Column(name = "cls", length = 50)
    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }
}
