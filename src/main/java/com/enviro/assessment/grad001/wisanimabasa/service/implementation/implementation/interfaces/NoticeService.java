package com.enviro.assessment.grad001.wisanimabasa.service.implementation.implementation.interfaces;

import com.enviro.assessment.grad001.wisanimabasa.models.NoticeDTO;

import java.util.List;

public interface NoticeService {
    List<NoticeDTO> getAllNotice();
    NoticeDTO createCSVFile(List<NoticeDTO> noticeDTOList, String filePath);
}
