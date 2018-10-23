package org.sopt.model.service;

import org.sopt.model.Professor;

public interface ProfessorService {
    //교수 고유번호로 조회
    Professor getByProferssorId(final int getProfessorId);
}
