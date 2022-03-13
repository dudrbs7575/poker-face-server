package com.fourtrashes.pokerface.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tblGroupCode")
public class GroupCode extends BaseDomain implements Serializable {
    private static final long serialVersionUID = -1812054084234839563L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long groupCodeNo;

    @Column
    private String groupCodeName;
}
