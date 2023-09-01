package com.enviro.assessment.grad001.wisanimabasa.service.implementation.implementation;

import com.enviro.assessment.grad001.wisanimabasa.models.NoticeDTO;
import com.enviro.assessment.grad001.wisanimabasa.service.implementation.implementation.interfaces.NoticeService;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
@Service
@Log4j2
public class NoticeServiceImplementation implements NoticeService {
    private final NoticeService noticeService;
@Autowired
    public NoticeServiceImplementation(final NoticeService noticeService) {
        this.noticeService = noticeService;
    }
    @Override
    public List<NoticeDTO> getAllNotice() {
        return noticeService.getAllNotice();
    }

    @Override
    public NoticeDTO createCSVFile(List<NoticeDTO> noticeDTOList, String filePath) {
        try (FileWriter fileWriter = new FileWriter(filePath);
             CSVPrinter csvPrinter = new CSVPrinter(fileWriter, CSVFormat.DEFAULT.withHeader("Title", "Date"))) {

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            for (NoticeDTO notice : noticeDTOList) {
                csvPrinter.printRecord(notice.title(), dateFormat.format(notice.date()));
            }

            log.info("CSV file generated successfully at: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return noticeService.createCSVFile(noticeDTOList, filePath);
    }
    }

