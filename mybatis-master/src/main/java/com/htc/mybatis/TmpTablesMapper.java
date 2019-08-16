package com.htc.mybatis;

import org.apache.ibatis.annotations.Select;

/**
 * Created by Administrator on 2019/1/19.
 */
public interface TmpTablesMapper {

    @Select("SELECT * FROM tmp_tables WHERE id = #{id}")
    TmpTables selectTmpTables(int id);
}
