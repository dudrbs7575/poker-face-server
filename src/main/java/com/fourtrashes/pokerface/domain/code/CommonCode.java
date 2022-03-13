package com.fourtrashes.pokerface.domain.code;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fourtrashes.pokerface.domain.BaseDomain;
import com.fourtrashes.pokerface.domain.GroupCode;
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
@Table(name = "tblCommonCode")
public class CommonCode extends BaseDomain implements Serializable {
    private static final long serialVersionUID = 5461866141769441501L;

    @EmbeddedId
    private CommonCodeId commonCodeId;

    @Column
    private String commonCodeName;

    @JsonIgnore
    @MapsId("groupCodeNo")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "groupCodeNo", referencedColumnName = "groupCodeNo")
    private GroupCode groupCode;
}
