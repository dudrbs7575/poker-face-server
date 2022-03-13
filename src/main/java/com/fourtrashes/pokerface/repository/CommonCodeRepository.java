package com.fourtrashes.pokerface.repository;

import com.fourtrashes.pokerface.domain.code.CommonCode;
import com.fourtrashes.pokerface.domain.code.CommonCodeId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommonCodeRepository extends JpaRepository<CommonCode, CommonCodeId> {
}
