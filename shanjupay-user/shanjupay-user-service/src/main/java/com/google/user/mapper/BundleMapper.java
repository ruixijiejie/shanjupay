package com.google.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.google.user.domain.Bundle;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 *
 * @since 2019-08-13
 */
@Repository
public interface BundleMapper extends BaseMapper<Bundle> {

    //@Select("select * from bundle where CODE=#{bundleCode}")
    //Bundle selectBundleByCode(@Param("bundleCode") String bundleCode);

}
