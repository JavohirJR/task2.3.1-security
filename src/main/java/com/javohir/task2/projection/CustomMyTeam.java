package com.javohir.task2.projection;

import com.javohir.task2.entity.Attachment;
import com.javohir.task2.entity.MyTeam;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = MyTeam.class)
public interface CustomMyTeam {
    Integer getId();
    String getName();
    String getOccupation();
    Attachment getAttachment();
}
