package co.lq.modules.shop.service.mapper;

import co.lq.base.BaseMapper;
import co.lq.modules.shop.domain.CompanyAddress;
import co.lq.modules.shop.service.dto.CompanyAddressDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author billy
* @date 2020-03-27
*/
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CompanyAddressMapper extends BaseMapper<CompanyAddressDTO, CompanyAddress> {

}