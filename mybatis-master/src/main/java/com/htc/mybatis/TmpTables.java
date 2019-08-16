package com.htc.mybatis;

/**
 * Created by Administrator on 2019/1/14.
 */

public class TmpTables {

    private int id;
    private String wl_table_name;
    private String xt_table_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWl_table_name() {
        return wl_table_name;
    }

    public void setWl_table_name(String wl_table_name) {
        this.wl_table_name = wl_table_name;
    }

    public String getXt_table_name() {
        return xt_table_name;
    }

    public void setXt_table_name(String xt_table_name) {
        this.xt_table_name = xt_table_name;
    }

    @Override
    public String toString() {
        return "TmpTables{" +
                "id=" + id +
                ", wl_table_name='" + wl_table_name + '\'' +
                ", xt_table_name='" + xt_table_name + '\'' +
                '}';
    }
}
