package com.google.user.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.google.user.api.dto.resource.ApplicationDTO;
import com.google.user.api.dto.resource.ApplicationQueryParams;
import com.google.user.domain.ResourceApplication;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 应用信息 Mapper 接口
 * </p>
 *
 *
 * @since 2019-08-13
 */
@Repository
public interface ResourceApplicationMapper extends BaseMapper<ResourceApplication> {

    @Select("<script>"
            +"select * from resource_application a "
            + "<where>"
            + "<if test=\"query.name != null and query.name!=''\"> "
            + "and a.NAME like CONCAT('%',#{query.name},'%') "
            + "</if>"
            +"</where>" +
            "</script>")
    List<ApplicationDTO> selectAppByPage(@Param("page") Page<ApplicationDTO> page, @Param("query") ApplicationQueryParams query);
}
