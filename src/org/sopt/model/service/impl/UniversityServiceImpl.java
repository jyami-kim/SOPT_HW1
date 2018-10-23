package org.sopt.model.service.impl;

import org.sopt.model.University;
import org.sopt.model.builder.UniversityBuilder;

public class UniversityServiceImpl {

    University getByUniversityName(final String getUniversityName){
        final UniversityBuilder universityBuilder = new UniversityBuilder();
        return universityBuilder
                .setName(getUniversityName)
                .build();
    }

}
