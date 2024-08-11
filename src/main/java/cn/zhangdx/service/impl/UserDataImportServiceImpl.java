package cn.zhangdx.service.impl;

import cn.zhangdx.service.DataImportService;

import java.util.List;

public class UserDataImportServiceImpl implements DataImportService<String> {
    @Override
    public void doImport(List<String> list) {
        System.out.println("User import list:" + list);
    }
}
