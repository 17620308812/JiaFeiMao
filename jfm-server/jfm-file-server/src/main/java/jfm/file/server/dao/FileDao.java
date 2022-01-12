package jfm.file.server.dao;

import jfm.common.pojo.JfmFile;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDao {

    int getSeqFileId();

    int insertFile(JfmFile file);
}
