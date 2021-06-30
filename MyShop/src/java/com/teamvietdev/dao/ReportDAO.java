package com.teamvietdev.dao;

import com.teamvietdev.bean.MyItem;
import java.util.Date;
import java.util.List;

/**
 *
 * @author TVD
 */
public interface ReportDAO {
    
    public List<MyItem> reportReceipt(Date date, int limit);
    
}
