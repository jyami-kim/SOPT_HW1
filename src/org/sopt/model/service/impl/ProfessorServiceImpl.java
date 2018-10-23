package org.sopt.model.service.impl;

import org.sopt.model.Professor;
import org.sopt.model.builder.ProfessorBuilder;

public class ProfessorServiceImpl {

    public Professor getByProferssorId(final int getProfessorId){
        final ProfessorBuilder professorBuilder = new ProfessorBuilder();
        return professorBuilder
                .setNum(getProfessorId)
                .build();
    }
}
