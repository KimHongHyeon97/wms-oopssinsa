package com.oopssinsa.model.dao;

import com.oopssinsa.model.dto.*;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface IbMapper {
    List<IbDto> findAllIb();
    List<IbDto> findIbByState(char status);
    List<IbRequestAndLocationDto> findIbRequestAndLocation();
    int updateIbState(IbDto ibDto);
    int updateExpectedCapacityLocation(LocationDto locationDto);
    int updateExpectedCapacitySection(SectionDto sectionDto);
    LocationDto findLocationByCategoryIdAndSectionId(String categoryId, char sectionId);
    ProductDto findProductByProductId(String productId);
    SectionDto findSectionByBrandId(String brandId);
}
