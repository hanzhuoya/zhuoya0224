package io.cjf.jcartstoreback.service;


import io.cjf.jcartstoreback.po.ReturnHistory;

import java.util.List;

public interface ReturnHistoryService {

    List<ReturnHistory> getListByReturnId(Integer returnId);

    Long create(ReturnHistory returnHistory);

}
