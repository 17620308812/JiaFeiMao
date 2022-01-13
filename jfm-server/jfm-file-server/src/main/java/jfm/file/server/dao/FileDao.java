package jfm.file.server.dao;

import jfm.common.pojo.JfmFile;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDao {

    JfmFile selectOne(@Param("fileCode") String fileCode);

    int getSeqFileId();

    int insertFile(JfmFile file);
}
