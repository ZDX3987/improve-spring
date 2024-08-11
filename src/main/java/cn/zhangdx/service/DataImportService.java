package cn.zhangdx.service;

import java.util.List;

public interface DataImportService<E> {

    void doImport(List<E> list);
}
