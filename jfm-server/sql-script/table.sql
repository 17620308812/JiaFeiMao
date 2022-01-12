-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
create table JFM_USER
(
    c_user_code      VARCHAR2(100),
    c_user_password  VARCHAR2(100),
    c_user_nick_name VARCHAR2(100),
    c_user_head_img  VARCHAR2(4000),
    d_register_date  NUMBER(8),
    d_register_time  NUMBER(6),
    c_status         VARCHAR2(2),
    c_phone_number   VARCHAR2(11)
);
-- Add comments to the table
comment on table JFM_USER
  is '用户表';
-- Add comments to the columns
comment on column JFM_USER.c_user_code
  is '用户主键';
comment on column JFM_USER.c_user_password
  is '密码';
comment on column JFM_USER.c_user_nick_name
  is '昵称';
comment on column JFM_USER.c_user_head_img
  is '头像';
comment on column JFM_USER.d_register_date
  is '注册日期';
comment on column JFM_USER.d_register_time
  is '注册时间';
comment on column JFM_USER.c_status
  is '状态 0正常 1冻结';
comment on column JFM_USER.c_phone_number
  is '手机号';

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
create table JFM_FILE
(
    c_file_code          VARCHAR2(100),
    c_file_name          VARCHAR2(1000),
    c_file_original_name VARCHAR2(1000),
    c_upload_user        VARCHAR2(100),
    c_upload_date        NUMBER(8),
    c_upload_time        NUMBER(6),
    c_path               VARCHAR2(200)
);
-- Add comments to the table
comment on table JFM_FILE
  is '文件记录表';
-- Add comments to the columns
comment on column JFM_FILE.c_file_code
  is '文件代码';
comment on column JFM_FILE.c_file_name
  is '文件虚拟名称';
comment on column JFM_FILE.c_file_original_name
  is '文件原始名称';
comment on column JFM_FILE.c_upload_user
  is '上传人';
comment on column JFM_FILE.c_upload_date
  is '上传日期';
comment on column JFM_FILE.c_upload_time
  is '上传时间';
comment on column JFM_FILE.c_path
  is '文件路径';
