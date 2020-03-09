package io.hzy.jcartadministrationback.dao;

import com.github.pagehelper.Page;
import io.hzy.jcartadministrationback.dto.out.ProductListOutDTO;
import io.hzy.jcartadministrationback.po.ReturnHistory;
import org.apache.ibatis.annotations.Param;

public interface ReturnHistoryMapper {
    int deleteByPrimaryKey(Long returnHistoryId);

    int insert(ReturnHistory record);

    int insertSelective(ReturnHistory record);

    ReturnHistory selectByPrimaryKey(Long returnHistoryId);

    int updateByPrimaryKeySelective(ReturnHistory record);

    int updateByPrimaryKey(ReturnHistory record);
    Page<ProductListOutDTO> search(@Param("productCode") String productCode,
                                   @Param("status") Byte status,
                                   @Param("stockQuantity") Integer stockQuantity,
                                   @Param("price") Double price,
                                   @Param("productName") String productName);
}