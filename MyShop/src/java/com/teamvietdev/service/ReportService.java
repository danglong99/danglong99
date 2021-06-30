package com.teamvietdev.service;

import com.teamvietdev.bean.MyItem;
import java.util.Date;
import java.util.List;

/**
 *
 * @author TVD
 */
public interface ReportService {
    
    public List<MyItem> reportReceipt(Date date, int limit);
    
}
