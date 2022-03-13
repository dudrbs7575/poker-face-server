package com.fourtrashes.pokerface.domain.code;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class CommonCodeId implements Serializable {
    private static final long serialVersionUID = -1292536888447910471L;
    private Long commonCodeNo;
    private Long groupCodeNo;
}
