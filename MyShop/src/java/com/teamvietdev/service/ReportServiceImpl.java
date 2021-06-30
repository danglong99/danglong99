package com.teamvietdev.service;

import com.teamvietdev.bean.MyItem;
import com.teamvietdev.dao.ReportDAO;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author TVD
 */
@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private ReportDAO reportDAO;

    @Override
    public List<MyItem> reportReceipt(Date date, int limit) {
        return reportDAO.reportReceipt(date, limit);
    }

}
