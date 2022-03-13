package com.fourtrashes.pokerface.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fourtrashes.pokerface.domain.code.CommonCode;
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
@Table(name = "tblRoom")
public class Room extends BaseDomain implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomNo;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "commonCodeNo", referencedColumnName = "commonCodeNo"),
            @JoinColumn(name = "groupCodeNo", referencedColumnName = "groupCodeNo")
    })
    private CommonCode commonCode;
}
